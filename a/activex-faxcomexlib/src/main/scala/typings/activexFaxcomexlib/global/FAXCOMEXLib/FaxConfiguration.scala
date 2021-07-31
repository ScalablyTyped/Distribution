package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxConfiguration Class */
@JSGlobal("FAXCOMEXLib.FaxConfiguration")
@js.native
class FaxConfiguration protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxConfiguration {
  
  /** Are personal cover pages allowed */
  /* CompleteClass */
  var AllowPersonalCoverPages: Boolean = js.native
  
  /** Indicates how long the fax message is kept on the server */
  /* CompleteClass */
  var ArchiveAgeLimit: Double = js.native
  
  /** Location of the archive on the server */
  /* CompleteClass */
  var ArchiveLocation: String = js.native
  
  /** The high 32-bit value of the archive size */
  /* CompleteClass */
  override val ArchiveSizeHigh: Double = js.native
  
  /** The low 32-bit value of the archive size */
  /* CompleteClass */
  override val ArchiveSizeLow: Double = js.native
  
  /** Does the server auto-create fax account on connect */
  /* CompleteClass */
  var AutoCreateAccountOnConnect: Boolean = js.native
  
  /** Does the server generate a brand */
  /* CompleteClass */
  var Branding: Boolean = js.native
  
  /** End of the discount rate period */
  /* CompleteClass */
  var DiscountRateEnd: VarDate = js.native
  
  /** Start of the discount rate period */
  /* CompleteClass */
  var DiscountRateStart: VarDate = js.native
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxConfiguration_typekey")
  var FAXCOMEXLibDotFaxConfiguration_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxConfiguration = js.native
  
  /** High quota water mark */
  /* CompleteClass */
  var HighQuotaWaterMark: Double = js.native
  
  /** Are incoming faxes viewable by everyone */
  /* CompleteClass */
  var IncomingFaxesArePublic: Boolean = js.native
  
  /** Is queue blocked for incoming faxes */
  /* CompleteClass */
  var IncomingQueueBlocked: Boolean = js.native
  
  /** Low quota water mark */
  /* CompleteClass */
  var LowQuotaWaterMark: Double = js.native
  
  /** How long the failed fax job is kept on the server */
  /* CompleteClass */
  var OutgoingQueueAgeLimit: Double = js.native
  
  /** Is queue blocked for outgoing faxes */
  /* CompleteClass */
  var OutgoingQueueBlocked: Boolean = js.native
  
  /** Is queue paused for outgoing faxes */
  /* CompleteClass */
  var OutgoingQueuePaused: Boolean = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Number of retries */
  /* CompleteClass */
  var Retries: Double = js.native
  
  /** Retry delay */
  /* CompleteClass */
  var RetryDelay: Double = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Is size quota warning on */
  /* CompleteClass */
  var SizeQuotaWarning: Boolean = js.native
  
  /** Whether faxes should be archived */
  /* CompleteClass */
  var UseArchive: Boolean = js.native
  
  /** Is device Transmitting Station ID used */
  /* CompleteClass */
  var UseDeviceTSID: Boolean = js.native
}
