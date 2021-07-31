package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingJob Class */
trait FaxIncomingJob extends StObject {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  
  /** Called Station ID */
  val CSID: String
  
  /** Caller ID */
  val CallerId: String
  
  /** Cancel the incoming job */
  def Cancel(): Unit
  
  /** Copy TIFF image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit
  
  /** Page currently in transmision */
  val CurrentPage: Double
  
  /** Device ID that transmits the job */
  val DeviceId: Double
  
  /** Extended status description */
  val ExtendedStatus: String
  
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM
  
  @JSName("FAXCOMEXLib.FaxIncomingJob_typekey")
  var FAXCOMEXLibDotFaxIncomingJob_typekey: FaxIncomingJob
  
  /** Unique message ID */
  val Id: String
  
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of failed transmission retries */
  val Retries: Double
  
  /** Routing information */
  val RoutingInformation: String
  
  /** Size in bytes of the message's TIFF file */
  val Size: Double
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM
  
  /** Transmitting Station ID */
  val TSID: String
  
  /** Transmission end time */
  val TransmissionEnd: VarDate
  
  /** Transmission start time */
  val TransmissionStart: VarDate
}
object FaxIncomingJob {
  
  @scala.inline
  def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    CallerId: String,
    Cancel: () => Unit,
    CopyTiff: String => Unit,
    CurrentPage: Double,
    DeviceId: Double,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotFaxIncomingJob_typekey: FaxIncomingJob,
    Id: String,
    JobType: FAX_JOB_TYPE_ENUM,
    Refresh: () => Unit,
    Retries: Double,
    RoutingInformation: String,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): FaxIncomingJob = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], Cancel = js.Any.fromFunction0(Cancel), CopyTiff = js.Any.fromFunction1(CopyTiff), CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingJob_typekey")(FAXCOMEXLibDotFaxIncomingJob_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingJob]
  }
  
  @scala.inline
  implicit class FaxIncomingJobMutableBuilder[Self <: FaxIncomingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = StObject.set(x, "AvailableOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "Cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: String): Self = StObject.set(x, "ExtendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = StObject.set(x, "ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxIncomingJob_typekey(value: FaxIncomingJob): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingJob_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: FAX_JOB_TYPE_ENUM): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingInformation(value: String): Self = StObject.set(x, "RoutingInformation", value.asInstanceOf[js.Any])
    
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
