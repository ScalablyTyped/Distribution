package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSummary extends js.Object {
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.undefined
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object ContainerSummary {
  @scala.inline
  def apply(exitCode: js.UndefOr[Integer] = js.undefined, reason: String = null): ContainerSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ContainerSummary]
  }
}

