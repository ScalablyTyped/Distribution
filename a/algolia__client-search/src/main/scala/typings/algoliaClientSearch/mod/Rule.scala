package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * Condition of the rule, expressed using the following variables: pattern, anchoring, context.
    *
    * @deprecated This parameter is deprecated in favor of `conditions`.
    */
  val condition: js.UndefOr[Condition] = js.native
  /**
    * Conditions of the rule, expressed using the following variables: pattern, anchoring, context.
    */
  val conditions: js.UndefOr[js.Array[Condition]] = js.native
  /**
    * Consequence of the rule. At least one of the following object must be used: params, promote, hide, userData.
    */
  val consequence: js.UndefOr[Consequence] = js.native
  /**
    * This field is intended for rule management purposes, in particular to ease searching for rules and presenting them to human readers. It is not interpreted by the API.
    */
  val description: js.UndefOr[String] = js.native
  /**
    * Whether the rule is enabled. Disabled rules remain in the index, but are not applied at query time.
    */
  val enabled: js.UndefOr[Boolean] = js.native
  /**
    * Unique identifier for the rule (format: [A-Za-z0-9_-]+).
    */
  val objectID: String = js.native
  /**
    * By default, rules are permanently valid. When validity periods are specified, the rule applies only during those periods; it is ignored the rest of the time.
    * The list must not be empty.
    */
  val validity: js.UndefOr[js.Array[TimeRange]] = js.native
}

object Rule {
  @scala.inline
  def apply(objectID: String): Rule = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setConsequence(value: Consequence): Self = this.set("consequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsequence: Self = this.set("consequence", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setValidityVarargs(value: TimeRange*): Self = this.set("validity", js.Array(value :_*))
    @scala.inline
    def setValidity(value: js.Array[TimeRange]): Self = this.set("validity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidity: Self = this.set("validity", js.undefined)
  }
  
}

