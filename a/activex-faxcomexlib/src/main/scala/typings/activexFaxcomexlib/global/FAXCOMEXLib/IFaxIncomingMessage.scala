package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxIncomingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxIncomingMessage")
@js.native
class IFaxIncomingMessage ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.IFaxIncomingMessage {
  
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
  
  /** Unique message ID */
  /* CompleteClass */
  override val Id: String = js.native
  
  /** Total number of pages */
  /* CompleteClass */
  override val Pages: Double = js.native
  
  /** Number of failed routing retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  
  /** Routing information */
  /* CompleteClass */
  override val RoutingInformation: String = js.native
  
  /** Size in bytes of the message's TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  
  /** Transmitting Station ID */
  /* CompleteClass */
  override val TSID: String = js.native
  
  /** Transmission end time */
  /* CompleteClass */
  override val TransmissionEnd: VarDate = js.native
  
  /** Transmission start time */
  /* CompleteClass */
  override val TransmissionStart: VarDate = js.native
}
