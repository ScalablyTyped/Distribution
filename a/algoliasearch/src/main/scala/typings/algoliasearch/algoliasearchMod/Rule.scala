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
  var condition: Anon_Anchoring
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
  def apply(condition: Anon_Anchoring, consequence: Anon_Params, objectID: String, description: String = null): Rule = {
    val __obj = js.Dynamic.literal(condition = condition, consequence = consequence, objectID = objectID)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Rule]
  }
}

