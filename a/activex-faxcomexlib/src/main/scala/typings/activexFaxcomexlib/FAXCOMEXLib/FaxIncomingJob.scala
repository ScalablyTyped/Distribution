package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingJob Class */
@js.native
trait FaxIncomingJob extends js.Object {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  val CSID: String = js.native
  
  /** Caller ID */
  val CallerId: String = js.native
  
  /** Cancel the incoming job */
  def Cancel(): Unit = js.native
  
  /** Copy TIFF image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  
  /** Device ID that transmits the job */
  val DeviceId: Double = js.native
  
  /** Extended status description */
  val ExtendedStatus: String = js.native
  
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  
  @JSName("FAXCOMEXLib.FaxIncomingJob_typekey")
  var FAXCOMEXLibDotFaxIncomingJob_typekey: FaxIncomingJob = js.native
  
  /** Unique message ID */
  val Id: String = js.native
  
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  
  /** Routing information */
  val RoutingInformation: String = js.native
  
  /** Size in bytes of the message's TIFF file */
  val Size: Double = js.native
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  
  /** Transmitting Station ID */
  val TSID: String = js.native
  
  /** Transmission end time */
  val TransmissionEnd: VarDate = js.native
  
  /** Transmission start time */
  val TransmissionStart: VarDate = js.native
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
  implicit class FaxIncomingJobOps[Self <: FaxIncomingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = this.set("AvailableOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSID(value: String): Self = this.set("CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerId(value: String): Self = this.set("CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("Cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = this.set("CopyTiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: Double): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: String): Self = this.set("ExtendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = this.set("ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxIncomingJob_typekey(value: FaxIncomingJob): Self = this.set("FAXCOMEXLib.FaxIncomingJob_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: FAX_JOB_TYPE_ENUM): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingInformation(value: String): Self = this.set("RoutingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FAX_JOB_STATUS_ENUM): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = this.set("TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = this.set("TransmissionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = this.set("TransmissionStart", value.asInstanceOf[js.Any])
  }
}
