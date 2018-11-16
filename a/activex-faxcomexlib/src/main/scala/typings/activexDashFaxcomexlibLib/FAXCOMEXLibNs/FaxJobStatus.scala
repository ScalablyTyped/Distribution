package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxJobStatus Class */
@JSGlobal("FAXCOMEXLib.FaxJobStatus")
@js.native
class FaxJobStatus protected () extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  /** Called Station ID */
  val CSID: java.lang.String = js.native
  /** Caller ID */
  val CallerId: java.lang.String = js.native
  /** Page currently in transmision */
  val CurrentPage: scala.Double = js.native
  /** Device ID of device that transmits the job */
  val DeviceId: scala.Double = js.native
  /** Extended status description */
  val ExtendedStatus: java.lang.String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  var `FAXCOMEXLib.FaxJobStatus_typekey`: FaxJobStatus = js.native
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM = js.native
  /** Total number of pages */
  val Pages: scala.Double = js.native
  /** Number of failed transmission retries */
  val Retries: scala.Double = js.native
  /** Routing information */
  val RoutingInformation: java.lang.String = js.native
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: stdLib.VarDate = js.native
  /** Size in bytes of TIFF file */
  val Size: scala.Double = js.native
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  /** Transmitting Station ID */
  val TSID: java.lang.String = js.native
  /** The time the fax job finished its transmission */
  val TransmissionEnd: stdLib.VarDate = js.native
  /** The time the fax job started its transmission */
  val TransmissionStart: stdLib.VarDate = js.native
}

