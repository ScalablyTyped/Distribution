package typings.activexDiskquota.DiskQuotaTypeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Automation interface for DiskQuotaUser */
@js.native
trait DIDiskQuotaUser extends js.Object {
  
  /** Name of user's account container */
  val AccountContainerName: String = js.native
  
  /** Status of user's account */
  val AccountStatus: AccountStatusConstants = js.native
  
  @JSName("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")
  var DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: DIDiskQuotaUser = js.native
  
  /** User's display name */
  val DisplayName: String = js.native
  
  /** Unique ID number */
  val ID: Double = js.native
  
  /** Invalidate data cached in user object */
  def Invalidate(): Unit = js.native
  
  /** User's logon account name */
  val LogonName: String = js.native
  
  /** User's quota limit (bytes) */
  var QuotaLimit: Double = js.native
  
  /** User's quota limit (text) */
  val QuotaLimitText: String = js.native
  
  /** User's quota warning threshold (bytes) */
  var QuotaThreshold: Double = js.native
  
  /** User's quota warning threshold (text) */
  val QuotaThresholdText: String = js.native
  
  /** Quota charged to user (bytes) */
  val QuotaUsed: Double = js.native
  
  /** Quota charged to user (text) */
  val QuotaUsedText: String = js.native
}
object DIDiskQuotaUser {
  
  @scala.inline
  def apply(
    AccountContainerName: String,
    AccountStatus: AccountStatusConstants,
    DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: DIDiskQuotaUser,
    DisplayName: String,
    ID: Double,
    Invalidate: () => Unit,
    LogonName: String,
    QuotaLimit: Double,
    QuotaLimitText: String,
    QuotaThreshold: Double,
    QuotaThresholdText: String,
    QuotaUsed: Double,
    QuotaUsedText: String
  ): DIDiskQuotaUser = {
    val __obj = js.Dynamic.literal(AccountContainerName = AccountContainerName.asInstanceOf[js.Any], AccountStatus = AccountStatus.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Invalidate = js.Any.fromFunction0(Invalidate), LogonName = LogonName.asInstanceOf[js.Any], QuotaLimit = QuotaLimit.asInstanceOf[js.Any], QuotaLimitText = QuotaLimitText.asInstanceOf[js.Any], QuotaThreshold = QuotaThreshold.asInstanceOf[js.Any], QuotaThresholdText = QuotaThresholdText.asInstanceOf[js.Any], QuotaUsed = QuotaUsed.asInstanceOf[js.Any], QuotaUsedText = QuotaUsedText.asInstanceOf[js.Any])
    __obj.updateDynamic("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")(DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DIDiskQuotaUser]
  }
  
  @scala.inline
  implicit class DIDiskQuotaUserOps[Self <: DIDiskQuotaUser] (val x: Self) extends AnyVal {
    
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
    def setAccountContainerName(value: String): Self = this.set("AccountContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountStatus(value: AccountStatusConstants): Self = this.set("AccountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey(value: DIDiskQuotaUser): Self = this.set("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("Invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogonName(value: String): Self = this.set("LogonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaLimit(value: Double): Self = this.set("QuotaLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaLimitText(value: String): Self = this.set("QuotaLimitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaThreshold(value: Double): Self = this.set("QuotaThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaThresholdText(value: String): Self = this.set("QuotaThresholdText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUsed(value: Double): Self = this.set("QuotaUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUsedText(value: String): Self = this.set("QuotaUsedText", value.asInstanceOf[js.Any])
  }
}
