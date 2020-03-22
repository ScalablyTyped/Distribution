package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearRulesOptions extends js.Object {
  /**
    * If the clear rules request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object ClearRulesOptions {
  @scala.inline
  def apply(forwardToReplicas: js.UndefOr[Boolean] = js.undefined): ClearRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearRulesOptions]
  }
}

