package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxConfiguration Class */
trait FaxConfiguration extends StObject {
  
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean
  
  /** Indicates how long the fax message is kept on the server */
  var ArchiveAgeLimit: Double
  
  /** Location of the archive on the server */
  var ArchiveLocation: String
  
  /** The high 32-bit value of the archive size */
  val ArchiveSizeHigh: Double
  
  /** The low 32-bit value of the archive size */
  val ArchiveSizeLow: Double
  
  /** Does the server auto-create fax account on connect */
  var AutoCreateAccountOnConnect: Boolean
  
  /** Does the server generate a brand */
  var Branding: Boolean
  
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate
  
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate
  
  /* private */ @JSName("FAXCOMEXLib.FaxConfiguration_typekey")
  var FAXCOMEXLibDotFaxConfiguration_typekey: FaxConfiguration
  
  /** High quota water mark */
  var HighQuotaWaterMark: Double
  
  /** Are incoming faxes viewable by everyone */
  var IncomingFaxesArePublic: Boolean
  
  /** Is queue blocked for incoming faxes */
  var IncomingQueueBlocked: Boolean
  
  /** Low quota water mark */
  var LowQuotaWaterMark: Double
  
  /** How long the failed fax job is kept on the server */
  var OutgoingQueueAgeLimit: Double
  
  /** Is queue blocked for outgoing faxes */
  var OutgoingQueueBlocked: Boolean
  
  /** Is queue paused for outgoing faxes */
  var OutgoingQueuePaused: Boolean
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of retries */
  var Retries: Double
  
  /** Retry delay */
  var RetryDelay: Double
  
  /** Save the object */
  def Save(): Unit
  
  /** Is size quota warning on */
  var SizeQuotaWarning: Boolean
  
  /** Whether faxes should be archived */
  var UseArchive: Boolean
  
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean
}
object FaxConfiguration {
  
  inline def apply(
    AllowPersonalCoverPages: Boolean,
    ArchiveAgeLimit: Double,
    ArchiveLocation: String,
    ArchiveSizeHigh: Double,
    ArchiveSizeLow: Double,
    AutoCreateAccountOnConnect: Boolean,
    Branding: Boolean,
    DiscountRateEnd: VarDate,
    DiscountRateStart: VarDate,
    FAXCOMEXLibDotFaxConfiguration_typekey: FaxConfiguration,
    HighQuotaWaterMark: Double,
    IncomingFaxesArePublic: Boolean,
    IncomingQueueBlocked: Boolean,
    LowQuotaWaterMark: Double,
    OutgoingQueueAgeLimit: Double,
    OutgoingQueueBlocked: Boolean,
    OutgoingQueuePaused: Boolean,
    Refresh: () => Unit,
    Retries: Double,
    RetryDelay: Double,
    Save: () => Unit,
    SizeQuotaWarning: Boolean,
    UseArchive: Boolean,
    UseDeviceTSID: Boolean
  ): FaxConfiguration = {
    val __obj = js.Dynamic.literal(AllowPersonalCoverPages = AllowPersonalCoverPages.asInstanceOf[js.Any], ArchiveAgeLimit = ArchiveAgeLimit.asInstanceOf[js.Any], ArchiveLocation = ArchiveLocation.asInstanceOf[js.Any], ArchiveSizeHigh = ArchiveSizeHigh.asInstanceOf[js.Any], ArchiveSizeLow = ArchiveSizeLow.asInstanceOf[js.Any], AutoCreateAccountOnConnect = AutoCreateAccountOnConnect.asInstanceOf[js.Any], Branding = Branding.asInstanceOf[js.Any], DiscountRateEnd = DiscountRateEnd.asInstanceOf[js.Any], DiscountRateStart = DiscountRateStart.asInstanceOf[js.Any], HighQuotaWaterMark = HighQuotaWaterMark.asInstanceOf[js.Any], IncomingFaxesArePublic = IncomingFaxesArePublic.asInstanceOf[js.Any], IncomingQueueBlocked = IncomingQueueBlocked.asInstanceOf[js.Any], LowQuotaWaterMark = LowQuotaWaterMark.asInstanceOf[js.Any], OutgoingQueueAgeLimit = OutgoingQueueAgeLimit.asInstanceOf[js.Any], OutgoingQueueBlocked = OutgoingQueueBlocked.asInstanceOf[js.Any], OutgoingQueuePaused = OutgoingQueuePaused.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RetryDelay = RetryDelay.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SizeQuotaWarning = SizeQuotaWarning.asInstanceOf[js.Any], UseArchive = UseArchive.asInstanceOf[js.Any], UseDeviceTSID = UseDeviceTSID.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxConfiguration_typekey")(FAXCOMEXLibDotFaxConfiguration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaxConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowPersonalCoverPages(value: Boolean): Self = StObject.set(x, "AllowPersonalCoverPages", value.asInstanceOf[js.Any])
    
    inline def setArchiveAgeLimit(value: Double): Self = StObject.set(x, "ArchiveAgeLimit", value.asInstanceOf[js.Any])
    
    inline def setArchiveLocation(value: String): Self = StObject.set(x, "ArchiveLocation", value.asInstanceOf[js.Any])
    
    inline def setArchiveSizeHigh(value: Double): Self = StObject.set(x, "ArchiveSizeHigh", value.asInstanceOf[js.Any])
    
    inline def setArchiveSizeLow(value: Double): Self = StObject.set(x, "ArchiveSizeLow", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateAccountOnConnect(value: Boolean): Self = StObject.set(x, "AutoCreateAccountOnConnect", value.asInstanceOf[js.Any])
    
    inline def setBranding(value: Boolean): Self = StObject.set(x, "Branding", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateEnd(value: VarDate): Self = StObject.set(x, "DiscountRateEnd", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateStart(value: VarDate): Self = StObject.set(x, "DiscountRateStart", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxConfiguration_typekey(value: FaxConfiguration): Self = StObject.set(x, "FAXCOMEXLib.FaxConfiguration_typekey", value.asInstanceOf[js.Any])
    
    inline def setHighQuotaWaterMark(value: Double): Self = StObject.set(x, "HighQuotaWaterMark", value.asInstanceOf[js.Any])
    
    inline def setIncomingFaxesArePublic(value: Boolean): Self = StObject.set(x, "IncomingFaxesArePublic", value.asInstanceOf[js.Any])
    
    inline def setIncomingQueueBlocked(value: Boolean): Self = StObject.set(x, "IncomingQueueBlocked", value.asInstanceOf[js.Any])
    
    inline def setLowQuotaWaterMark(value: Double): Self = StObject.set(x, "LowQuotaWaterMark", value.asInstanceOf[js.Any])
    
    inline def setOutgoingQueueAgeLimit(value: Double): Self = StObject.set(x, "OutgoingQueueAgeLimit", value.asInstanceOf[js.Any])
    
    inline def setOutgoingQueueBlocked(value: Boolean): Self = StObject.set(x, "OutgoingQueueBlocked", value.asInstanceOf[js.Any])
    
    inline def setOutgoingQueuePaused(value: Boolean): Self = StObject.set(x, "OutgoingQueuePaused", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "RetryDelay", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSizeQuotaWarning(value: Boolean): Self = StObject.set(x, "SizeQuotaWarning", value.asInstanceOf[js.Any])
    
    inline def setUseArchive(value: Boolean): Self = StObject.set(x, "UseArchive", value.asInstanceOf[js.Any])
    
    inline def setUseDeviceTSID(value: Boolean): Self = StObject.set(x, "UseDeviceTSID", value.asInstanceOf[js.Any])
  }
}
