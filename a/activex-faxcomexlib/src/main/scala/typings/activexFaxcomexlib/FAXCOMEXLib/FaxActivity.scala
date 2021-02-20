package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivity Class */
@js.native
trait FaxActivity extends StObject {
  
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: FaxActivity = js.native
  
  /** Number of incoming messages */
  val IncomingMessages: Double = js.native
  
  /** Number of outgoing messages */
  val OutgoingMessages: Double = js.native
  
  /** Number of queued messages */
  val QueuedMessages: Double = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Number of routed incoming messages */
  val RoutingMessages: Double = js.native
}
object FaxActivity {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxActivity_typekey: FaxActivity,
    IncomingMessages: Double,
    OutgoingMessages: Double,
    QueuedMessages: Double,
    Refresh: () => Unit,
    RoutingMessages: Double
  ): FaxActivity = {
    val __obj = js.Dynamic.literal(IncomingMessages = IncomingMessages.asInstanceOf[js.Any], OutgoingMessages = OutgoingMessages.asInstanceOf[js.Any], QueuedMessages = QueuedMessages.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RoutingMessages = RoutingMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxActivity_typekey")(FAXCOMEXLibDotFaxActivity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivity]
  }
  
  @scala.inline
  implicit class FaxActivityMutableBuilder[Self <: FaxActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxActivity_typekey(value: FaxActivity): Self = StObject.set(x, "FAXCOMEXLib.FaxActivity_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingMessages(value: Double): Self = StObject.set(x, "IncomingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingMessages(value: Double): Self = StObject.set(x, "OutgoingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedMessages(value: Double): Self = StObject.set(x, "QueuedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoutingMessages(value: Double): Self = StObject.set(x, "RoutingMessages", value.asInstanceOf[js.Any])
  }
}
