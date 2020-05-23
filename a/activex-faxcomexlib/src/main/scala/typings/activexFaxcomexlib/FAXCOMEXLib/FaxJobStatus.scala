package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxJobStatus Class */
trait FaxJobStatus extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  /** Called Station ID */
  val CSID: String
  /** Caller ID */
  val CallerId: String
  /** Page currently in transmision */
  val CurrentPage: Double
  /** Device ID of device that transmits the job */
  val DeviceId: Double
  /** Extended status description */
  val ExtendedStatus: String
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM
  @JSName("FAXCOMEXLib.FaxJobStatus_typekey")
  var FAXCOMEXLibDotFaxJobStatus_typekey: FaxJobStatus
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM
  /** Total number of pages */
  val Pages: Double
  /** Number of failed transmission retries */
  val Retries: Double
  /** Routing information */
  val RoutingInformation: String
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate
  /** Size in bytes of TIFF file */
  val Size: Double
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM
  /** Transmitting Station ID */
  val TSID: String
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate
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
}

