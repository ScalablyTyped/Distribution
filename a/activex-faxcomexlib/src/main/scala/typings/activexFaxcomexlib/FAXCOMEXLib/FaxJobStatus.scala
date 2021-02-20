package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxJobStatus Class */
@js.native
trait FaxJobStatus extends StObject {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  val CSID: String = js.native
  
  /** Caller ID */
  val CallerId: String = js.native
  
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  
  /** Device ID of device that transmits the job */
  val DeviceId: Double = js.native
  
  /** Extended status description */
  val ExtendedStatus: String = js.native
  
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  
  @JSName("FAXCOMEXLib.FaxJobStatus_typekey")
  var FAXCOMEXLibDotFaxJobStatus_typekey: FaxJobStatus = js.native
  
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM = js.native
  
  /** Total number of pages */
  val Pages: Double = js.native
  
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  
  /** Routing information */
  val RoutingInformation: String = js.native
  
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate = js.native
  
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  
  /** Transmitting Station ID */
  val TSID: String = js.native
  
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate = js.native
  
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate = js.native
}
object FaxJobStatus {
  
  @scala.inline
  def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    CallerId: String,
    CurrentPage: Double,
    DeviceId: Double,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotFaxJobStatus_typekey: FaxJobStatus,
    JobType: FAX_JOB_TYPE_ENUM,
    Pages: Double,
    Retries: Double,
    RoutingInformation: String,
    ScheduledTime: VarDate,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): FaxJobStatus = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxJobStatus_typekey")(FAXCOMEXLibDotFaxJobStatus_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxJobStatus]
  }
  
  @scala.inline
  implicit class FaxJobStatusMutableBuilder[Self <: FaxJobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = StObject.set(x, "AvailableOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: String): Self = StObject.set(x, "ExtendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = StObject.set(x, "ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxJobStatus_typekey(value: FaxJobStatus): Self = StObject.set(x, "FAXCOMEXLib.FaxJobStatus_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: FAX_JOB_TYPE_ENUM): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingInformation(value: String): Self = StObject.set(x, "RoutingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTime(value: VarDate): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FAX_JOB_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
