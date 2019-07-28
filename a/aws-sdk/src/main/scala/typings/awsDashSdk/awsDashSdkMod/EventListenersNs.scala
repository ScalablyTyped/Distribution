package typings.awsDashSdk.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "EventListeners")
@js.native
object EventListenersNs extends js.Object {
  @JSName("Core")
  @js.native
  object CoreNs extends js.Object {
    def HTTP_DATA(): Unit = js.native
    def SEND(): Unit = js.native
    def VALIDATE_CREDENTIALS(): Unit = js.native
    def VALIDATE_PARAMETERS(): Unit = js.native
    def VALIDATE_REGION(): Unit = js.native
    def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
  }
  
}

