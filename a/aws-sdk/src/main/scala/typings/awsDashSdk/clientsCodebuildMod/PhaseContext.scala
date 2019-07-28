package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseContext extends js.Object {
  /**
    * An explanation of the build phase's context. This might include a command ID and an exit code.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The status code for the context of the build phase.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}

object PhaseContext {
  @scala.inline
  def apply(message: String = null, statusCode: String = null): PhaseContext = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[PhaseContext]
  }
}

