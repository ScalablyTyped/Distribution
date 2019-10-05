package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingJob Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingJob")
@js.native
class FaxIncomingJob protected () extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  /** Called Station ID */
  val CSID: String = js.native
  /** Caller ID */
  val CallerId: String = js.native
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  /** Device ID that transmits the job */
  val DeviceId: Double = js.native
  /** Extended status description */
  val ExtendedStatus: String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  var `FAXCOMEXLib.FaxIncomingJob_typekey`: FaxIncomingJob = js.native
  /** Unique message ID */
  val Id: String = js.native
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM = js.native
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
  /** Cancel the incoming job */
  def Cancel(): Unit = js.native
  /** Copy TIFF image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
}

