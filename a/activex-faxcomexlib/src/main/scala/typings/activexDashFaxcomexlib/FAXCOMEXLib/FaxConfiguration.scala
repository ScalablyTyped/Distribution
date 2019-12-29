package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxConfiguration Class */
@JSGlobal("FAXCOMEXLib.FaxConfiguration")
@js.native
class FaxConfiguration protected () extends js.Object {
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean = js.native
  /** Indicates how long the fax message is kept on the server */
  var ArchiveAgeLimit: Double = js.native
  /** Location of the archive on the server */
  var ArchiveLocation: String = js.native
  /** The high 32-bit value of the archive size */
  val ArchiveSizeHigh: Double = js.native
  /** The low 32-bit value of the archive size */
  val ArchiveSizeLow: Double = js.native
  /** Does the server auto-create fax account on connect */
  var AutoCreateAccountOnConnect: Boolean = js.native
  /** Does the server generate a brand */
  var Branding: Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate = js.native
  @JSName("FAXCOMEXLib.FaxConfiguration_typekey")
  var FAXCOMEXLibDotFaxConfiguration_typekey: FaxConfiguration = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: Double = js.native
  /** Are incoming faxes viewable by everyone */
  var IncomingFaxesArePublic: Boolean = js.native
  /** Is queue blocked for incoming faxes */
  var IncomingQueueBlocked: Boolean = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: Double = js.native
  /** How long the failed fax job is kept on the server */
  var OutgoingQueueAgeLimit: Double = js.native
  /** Is queue blocked for outgoing faxes */
  var OutgoingQueueBlocked: Boolean = js.native
  /** Is queue paused for outgoing faxes */
  var OutgoingQueuePaused: Boolean = js.native
  /** Number of retries */
  var Retries: Double = js.native
  /** Retry delay */
  var RetryDelay: Double = js.native
  /** Is size quota warning on */
  var SizeQuotaWarning: Boolean = js.native
  /** Whether faxes should be archived */
  var UseArchive: Boolean = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

