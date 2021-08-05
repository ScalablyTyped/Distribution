package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingMessage Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessage")
@js.native
/* private */ class FaxIncomingMessage ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessage {
  
  /** Called Station ID */
  /* CompleteClass */
  override val CSID: String = js.native
  
  /** Caller ID */
  /* CompleteClass */
  override val CallerId: String = js.native
  
  /** Copy Tiff image to the local file */
  /* CompleteClass */
  override def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Delete the message from the archive */
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /** Name of the device that received the message */
  /* CompleteClass */
  override val DeviceName: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingMessage_typekey")
  var FAXCOMEXLibDotFaxIncomingMessage_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessage = js.native
  
  /** Has Cover page */
  /* CompleteClass */
  var HasCoverPage: Boolean = js.native
  
  /** Unique message ID */
  /* CompleteClass */
  override val Id: String = js.native
  
  /** Total number of pages */
  /* CompleteClass */
  override val Pages: Double = js.native
  
  /** Reassigns the message */
  /* CompleteClass */
  override def ReAssign(): Unit = js.native
  
  /** Read flag on the message */
  /* CompleteClass */
  var Read: Boolean = js.native
  
  /** Set of recipient names */
  /* CompleteClass */
  var Recipients: String = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Number of failed routing retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  
  /** Routing information */
  /* CompleteClass */
  override val RoutingInformation: String = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Sender's fax number */
  /* CompleteClass */
  var SenderFaxNumber: String = js.native
  
  /** Sender's name */
  /* CompleteClass */
  var SenderName: String = js.native
  
  /** Size in bytes of the message's TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  
  /** Contents of cover page subject field */
  /* CompleteClass */
  var Subject: String = js.native
  
  /** Transmitting Station ID */
  /* CompleteClass */
  override val TSID: String = js.native
  
  /** Transmission end time */
  /* CompleteClass */
  override val TransmissionEnd: VarDate = js.native
  
  /** Transmission start time */
  /* CompleteClass */
  override val TransmissionStart: VarDate = js.native
  
  /** Is message reassigned? */
  /* CompleteClass */
  override val WasReAssigned: Boolean = js.native
}
