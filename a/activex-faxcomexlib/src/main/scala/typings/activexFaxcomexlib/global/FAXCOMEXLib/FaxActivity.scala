package typings.activexFaxcomexlib.global.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
@JSGlobal("FAXCOMEXLib.FaxActivity")
@js.native
class FaxActivity protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivity {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  override var FAXCOMEXLibDotFaxActivity_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivity = js.native
  /** Number of incoming messages */
  /* CompleteClass */
  override val IncomingMessages: Double = js.native
  /** Number of outgoing messages */
  /* CompleteClass */
  override val OutgoingMessages: Double = js.native
  /** Number of queued messages */
  /* CompleteClass */
  override val QueuedMessages: Double = js.native
  /** Number of routed incoming messages */
  /* CompleteClass */
  override val RoutingMessages: Double = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
}

