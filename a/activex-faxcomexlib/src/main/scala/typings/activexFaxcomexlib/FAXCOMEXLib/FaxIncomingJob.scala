package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingJob Class */
trait FaxIncomingJob extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  /** Called Station ID */
  val CSID: String
  /** Caller ID */
  val CallerId: String
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
  /** Cancel the incoming job */
  def Cancel(): Unit
  /** Copy TIFF image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit
  /** Refresh the object */
  def Refresh(): Unit
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
}

