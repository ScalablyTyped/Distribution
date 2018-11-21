package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxConfiguration Class */
@JSGlobal("FAXCOMEXLib.FaxConfiguration")
@js.native
class FaxConfiguration protected () extends js.Object {
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: scala.Boolean = js.native
  /** Indicates how long the fax message is kept on the server */
  var ArchiveAgeLimit: scala.Double = js.native
  /** Location of the archive on the server */
  var ArchiveLocation: java.lang.String = js.native
  /** The high 32-bit value of the archive size */
  val ArchiveSizeHigh: scala.Double = js.native
  /** The low 32-bit value of the archive size */
  val ArchiveSizeLow: scala.Double = js.native
  /** Does the server auto-create fax account on connect */
  var AutoCreateAccountOnConnect: scala.Boolean = js.native
  /** Does the server generate a brand */
  var Branding: scala.Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: activexDashInteropLib.VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: activexDashInteropLib.VarDate = js.native
  var `FAXCOMEXLib.FaxConfiguration_typekey`: FaxConfiguration = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: scala.Double = js.native
  /** Are incoming faxes viewable by everyone */
  var IncomingFaxesArePublic: scala.Boolean = js.native
  /** Is queue blocked for incoming faxes */
  var IncomingQueueBlocked: scala.Boolean = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: scala.Double = js.native
  /** How long the failed fax job is kept on the server */
  var OutgoingQueueAgeLimit: scala.Double = js.native
  /** Is queue blocked for outgoing faxes */
  var OutgoingQueueBlocked: scala.Boolean = js.native
  /** Is queue paused for outgoing faxes */
  var OutgoingQueuePaused: scala.Boolean = js.native
  /** Number of retries */
  var Retries: scala.Double = js.native
  /** Retry delay */
  var RetryDelay: scala.Double = js.native
  /** Is size quota warning on */
  var SizeQuotaWarning: scala.Boolean = js.native
  /** Whether faxes should be archived */
  var UseArchive: scala.Boolean = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: scala.Boolean = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

