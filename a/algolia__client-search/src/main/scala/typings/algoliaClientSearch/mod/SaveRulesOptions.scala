package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveRulesOptions extends js.Object {
  /**
    * If the existing rules should be removed.
    */
  val clearExistingRules: js.UndefOr[Boolean] = js.undefined
  /**
    * If the saved rules should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object SaveRulesOptions {
  @scala.inline
  def apply(
    clearExistingRules: js.UndefOr[Boolean] = js.undefined,
    forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  ): SaveRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearExistingRules)) __obj.updateDynamic("clearExistingRules")(clearExistingRules.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveRulesOptions]
  }
}

