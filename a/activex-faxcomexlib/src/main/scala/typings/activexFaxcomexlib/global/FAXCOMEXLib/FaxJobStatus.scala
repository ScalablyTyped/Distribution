package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_EXTENDED_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_OPERATIONS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_JOB_TYPE_ENUM
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxJobStatus Class */
@JSGlobal("FAXCOMEXLib.FaxJobStatus")
@js.native
class FaxJobStatus protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  /* CompleteClass */
  override val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  /* CompleteClass */
  override val CSID: String = js.native
  
  /** Caller ID */
  /* CompleteClass */
  override val CallerId: String = js.native
  
  /** Page currently in transmision */
  /* CompleteClass */
  override val CurrentPage: Double = js.native
  
  /** Device ID of device that transmits the job */
  /* CompleteClass */
  override val DeviceId: Double = js.native
  
  /** Extended status description */
  /* CompleteClass */
  override val ExtendedStatus: String = js.native
  
  /** Code of the job's extended status */
  /* CompleteClass */
  override val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxJobStatus_typekey")
  var FAXCOMEXLibDotFaxJobStatus_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus = js.native
  
  /** Job type */
  /* CompleteClass */
  override val JobType: FAX_JOB_TYPE_ENUM = js.native
  
  /** Total number of pages */
  /* CompleteClass */
  override val Pages: Double = js.native
  
  /** Number of failed transmission retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  
  /** Routing information */
  /* CompleteClass */
  override val RoutingInformation: String = js.native
  
  /** The time the fax job is scheduled to be transmitted */
  /* CompleteClass */
  override val ScheduledTime: VarDate = js.native
  
  /** Size in bytes of TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  /* CompleteClass */
  override val Status: FAX_JOB_STATUS_ENUM = js.native
  
  /** Transmitting Station ID */
  /* CompleteClass */
  override val TSID: String = js.native
  
  /** The time the fax job finished its transmission */
  /* CompleteClass */
  override val TransmissionEnd: VarDate = js.native
  
  /** The time the fax job started its transmission */
  /* CompleteClass */
  override val TransmissionStart: VarDate = js.native
}
