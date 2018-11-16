package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/event_listeners", JSImport.Namespace)
@js.native
object libEventUnderscoreListenersMod extends js.Object {
  @JSName("EventListeners")
  @js.native
  object EventListenersNs extends js.Object {
    @JSName("Core")
    @js.native
    object CoreNs extends js.Object {
      def HTTP_DATA(): scala.Unit = js.native
      def SEND(): scala.Unit = js.native
      def VALIDATE_CREDENTIALS(): scala.Unit = js.native
      def VALIDATE_PARAMETERS(): scala.Unit = js.native
      def VALIDATE_REGION(): scala.Unit = js.native
      def removeListener(eventName: java.lang.String, eventListener: js.Function): scala.Unit = js.native
    }
    
  }
  
}

