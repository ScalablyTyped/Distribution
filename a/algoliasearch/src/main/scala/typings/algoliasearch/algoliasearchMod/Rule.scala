package typings.algoliasearch.algoliasearchMod

import typings.algoliasearch.Anon_Anchoring
import typings.algoliasearch.Anon_Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a query rule object
  */
trait Rule extends js.Object {
  /**
    * Condition of the rule
    */
  var condition: js.UndefOr[Anon_Anchoring] = js.undefined
  /**
    * Consequence of the rule. At least one of the following must be used:
    */
  var consequence: Anon_Params
  /**
    * This field is intended for rule management purposes,
    * in particular to ease searching for rules and presenting them to human readers.
    * It is not interpreted by the API.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * ObjectID of the synonym
    */
  var objectID: String
}

object Rule {
  @scala.inline
  def apply(
    consequence: Anon_Params,
    objectID: String,
    condition: Anon_Anchoring = null,
    description: String = null
  ): Rule = {
    val __obj = js.Dynamic.literal(consequence = consequence.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

