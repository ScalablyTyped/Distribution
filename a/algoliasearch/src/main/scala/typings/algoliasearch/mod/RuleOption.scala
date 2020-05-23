package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on query rules
  */
trait RuleOption extends js.Object {
  /**
    * Replace all existing query rules on the index with the content of the batch
    */
  var clearExistingRules: js.UndefOr[Boolean] = js.undefined
  /**
    * You can forward all settings updates to the replicas of an index
    */
  var forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object RuleOption {
  @scala.inline
  def apply(
    clearExistingRules: js.UndefOr[Boolean] = js.undefined,
    forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  ): RuleOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearExistingRules)) __obj.updateDynamic("clearExistingRules")(clearExistingRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOption]
  }
}

