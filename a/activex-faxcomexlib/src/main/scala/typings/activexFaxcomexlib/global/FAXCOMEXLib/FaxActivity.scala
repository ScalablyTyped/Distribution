package typings.activexFaxcomexlib.global.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivity Class */
@JSGlobal("FAXCOMEXLib.FaxActivity")
@js.native
/* private */ open class FaxActivity ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivity {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivity = js.native
  
  /** Number of incoming messages */
  /* CompleteClass */
  override val IncomingMessages: Double = js.native
  
  /** Number of outgoing messages */
  /* CompleteClass */
  override val OutgoingMessages: Double = js.native
  
  /** Number of queued messages */
  /* CompleteClass */
  override val QueuedMessages: Double = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Number of routed incoming messages */
  /* CompleteClass */
  override val RoutingMessages: Double = js.native
}
