package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_EXTENDED_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_OPERATIONS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_TYPE_ENUM
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingJob Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingJob")
@js.native
/* private */ open class FaxIncomingJob ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  /* CompleteClass */
  override val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  /* CompleteClass */
  override val CSID: String = js.native
  
  /** Caller ID */
  /* CompleteClass */
  override val CallerId: String = js.native
  
  /** Cancel the incoming job */
  /* CompleteClass */
  override def Cancel(): Unit = js.native
  
  /** Copy TIFF image to the local file */
  /* CompleteClass */
  override def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Page currently in transmision */
  /* CompleteClass */
  override val CurrentPage: Double = js.native
  
  /** Device ID that transmits the job */
  /* CompleteClass */
  override val DeviceId: Double = js.native
  
  /** Extended status description */
  /* CompleteClass */
  override val ExtendedStatus: String = js.native
  
  /** Code of the job's extended status */
  /* CompleteClass */
  override val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingJob_typekey")
  var FAXCOMEXLibDotFaxIncomingJob_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  
  /** Unique message ID */
  /* CompleteClass */
  override val Id: String = js.native
  
  /** Job type */
  /* CompleteClass */
  override val JobType: FAX_JOB_TYPE_ENUM = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Number of failed transmission retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  
  /** Routing information */
  /* CompleteClass */
  override val RoutingInformation: String = js.native
  
  /** Size in bytes of the message's TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  /* CompleteClass */
  override val Status: FAX_JOB_STATUS_ENUM = js.native
  
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
