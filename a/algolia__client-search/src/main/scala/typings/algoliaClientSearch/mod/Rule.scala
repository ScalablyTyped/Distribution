package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * Condition of the rule, expressed using the following variables: pattern, anchoring, context.
    */
  val condition: js.UndefOr[Condition] = js.undefined
  /**
    * Consequence of the rule. At least one of the following object must be used: params, promote, hide, userData.
    */
  val consequence: js.UndefOr[Consequence] = js.undefined
  /**
    * This field is intended for rule management purposes, in particular to ease searching for rules and presenting them to human readers. It is not interpreted by the API.
    */
  val description: js.UndefOr[String] = js.undefined
  /**
    * Whether the rule is enabled. Disabled rules remain in the index, but are not applied at query time.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique identifier for the rule (format: [A-Za-z0-9_-]+).
    */
  val objectID: String
  /**
    * By default, rules are permanently valid. When validity periods are specified, the rule applies only during those periods; it is ignored the rest of the time.
    * The list must not be empty.
    */
  val validity: js.UndefOr[js.Array[TimeRange]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    objectID: String,
    condition: Condition = null,
    consequence: Consequence = null,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    validity: js.Array[TimeRange] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (consequence != null) __obj.updateDynamic("consequence")(consequence.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (validity != null) __obj.updateDynamic("validity")(validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

