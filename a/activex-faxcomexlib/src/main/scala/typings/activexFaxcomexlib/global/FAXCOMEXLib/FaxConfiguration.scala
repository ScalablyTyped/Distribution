package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxConfiguration Class */
@JSGlobal("FAXCOMEXLib.FaxConfiguration")
@js.native
class FaxConfiguration protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxConfiguration {
  /** Are personal cover pages allowed */
  /* CompleteClass */
  override var AllowPersonalCoverPages: Boolean = js.native
  /** Indicates how long the fax message is kept on the server */
  /* CompleteClass */
  override var ArchiveAgeLimit: Double = js.native
  /** Location of the archive on the server */
  /* CompleteClass */
  override var ArchiveLocation: String = js.native
  /** The high 32-bit value of the archive size */
  /* CompleteClass */
  override val ArchiveSizeHigh: Double = js.native
  /** The low 32-bit value of the archive size */
  /* CompleteClass */
  override val ArchiveSizeLow: Double = js.native
  /** Does the server auto-create fax account on connect */
  /* CompleteClass */
  override var AutoCreateAccountOnConnect: Boolean = js.native
  /** Does the server generate a brand */
  /* CompleteClass */
  override var Branding: Boolean = js.native
  /** End of the discount rate period */
  /* CompleteClass */
  override var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  /* CompleteClass */
  override var DiscountRateStart: VarDate = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxConfiguration_typekey")
  override var FAXCOMEXLibDotFaxConfiguration_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxConfiguration = js.native
  /** High quota water mark */
  /* CompleteClass */
  override var HighQuotaWaterMark: Double = js.native
  /** Are incoming faxes viewable by everyone */
  /* CompleteClass */
  override var IncomingFaxesArePublic: Boolean = js.native
  /** Is queue blocked for incoming faxes */
  /* CompleteClass */
  override var IncomingQueueBlocked: Boolean = js.native
  /** Low quota water mark */
  /* CompleteClass */
  override var LowQuotaWaterMark: Double = js.native
  /** How long the failed fax job is kept on the server */
  /* CompleteClass */
  override var OutgoingQueueAgeLimit: Double = js.native
  /** Is queue blocked for outgoing faxes */
  /* CompleteClass */
  override var OutgoingQueueBlocked: Boolean = js.native
  /** Is queue paused for outgoing faxes */
  /* CompleteClass */
  override var OutgoingQueuePaused: Boolean = js.native
  /** Number of retries */
  /* CompleteClass */
  override var Retries: Double = js.native
  /** Retry delay */
  /* CompleteClass */
  override var RetryDelay: Double = js.native
  /** Is size quota warning on */
  /* CompleteClass */
  override var SizeQuotaWarning: Boolean = js.native
  /** Whether faxes should be archived */
  /* CompleteClass */
  override var UseArchive: Boolean = js.native
  /** Is device Transmitting Station ID used */
  /* CompleteClass */
  override var UseDeviceTSID: Boolean = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

