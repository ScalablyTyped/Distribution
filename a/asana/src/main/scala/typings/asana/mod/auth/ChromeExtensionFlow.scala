package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeExtensionFlow extends BaseBrowserFlow {
  
  /**
    * Runs the receiver code to send the Oauth result to the requesting tab.
    */
  def runReceiver(): Unit = js.native
}
object ChromeExtensionFlow {
  
  @JSImport("asana", "auth.ChromeExtensionFlow")
  @js.native
  val ^ : ChromeExtensionFlowStatic = js.native
  
  @scala.inline
  implicit class ChromeExtensionFlowMutableBuilder[Self <: ChromeExtensionFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunReceiver(value: () => Unit): Self = StObject.set(x, "runReceiver", js.Any.fromFunction0(value))
  }
}
