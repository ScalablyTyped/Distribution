package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSettingsOptions extends js.Object {
  /**
    * If the saved settings should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object SetSettingsOptions {
  @scala.inline
  def apply(forwardToReplicas: js.UndefOr[Boolean] = js.undefined): SetSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSettingsOptions]
  }
}

