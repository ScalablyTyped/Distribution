package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSummary extends js.Object {
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
}

object ContainerSummary {
  @scala.inline
  def apply(exitCode: Int | Double = null, reason: String = null): ContainerSummary = {
    val __obj = js.Dynamic.literal()
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSummary]
  }
}

