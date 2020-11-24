package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxConfiguration Class */
@js.native
trait FaxConfiguration extends js.Object {
  
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
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Number of retries */
  var Retries: Double = js.native
  
  /** Retry delay */
  var RetryDelay: Double = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
  
  /** Is size quota warning on */
  var SizeQuotaWarning: Boolean = js.native
  
  /** Whether faxes should be archived */
  var UseArchive: Boolean = js.native
  
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
}
object FaxConfiguration {
  
  @scala.inline
  def apply(
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
  implicit class FaxConfigurationOps[Self <: FaxConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowPersonalCoverPages(value: Boolean): Self = this.set("AllowPersonalCoverPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveAgeLimit(value: Double): Self = this.set("ArchiveAgeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveLocation(value: String): Self = this.set("ArchiveLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveSizeHigh(value: Double): Self = this.set("ArchiveSizeHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveSizeLow(value: Double): Self = this.set("ArchiveSizeLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateAccountOnConnect(value: Boolean): Self = this.set("AutoCreateAccountOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranding(value: Boolean): Self = this.set("Branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountRateEnd(value: VarDate): Self = this.set("DiscountRateEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountRateStart(value: VarDate): Self = this.set("DiscountRateStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxConfiguration_typekey(value: FaxConfiguration): Self = this.set("FAXCOMEXLib.FaxConfiguration_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighQuotaWaterMark(value: Double): Self = this.set("HighQuotaWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingFaxesArePublic(value: Boolean): Self = this.set("IncomingFaxesArePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingQueueBlocked(value: Boolean): Self = this.set("IncomingQueueBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowQuotaWaterMark(value: Double): Self = this.set("LowQuotaWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingQueueAgeLimit(value: Double): Self = this.set("OutgoingQueueAgeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingQueueBlocked(value: Boolean): Self = this.set("OutgoingQueueBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingQueuePaused(value: Boolean): Self = this.set("OutgoingQueuePaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("RetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSizeQuotaWarning(value: Boolean): Self = this.set("SizeQuotaWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseArchive(value: Boolean): Self = this.set("UseArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDeviceTSID(value: Boolean): Self = this.set("UseDeviceTSID", value.asInstanceOf[js.Any])
  }
}
