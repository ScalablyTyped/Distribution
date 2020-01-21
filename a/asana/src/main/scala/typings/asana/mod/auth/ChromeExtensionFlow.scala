package typings.asana.mod.auth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeExtensionFlow extends BaseBrowserFlow {
  /**
    * Runs the receiver code to send the Oauth result to the requesting tab.
    */
  def runReceiver(): Unit
}

@JSImport("asana", "auth.ChromeExtensionFlow")
@js.native
object ChromeExtensionFlow extends TopLevel[ChromeExtensionFlowStatic]

