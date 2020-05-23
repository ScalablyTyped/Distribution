package typings.activexDiskquota.DiskQuotaTypeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Automation interface for DiskQuotaUser */
trait DIDiskQuotaUser extends js.Object {
  /** Name of user's account container */
  val AccountContainerName: String
  /** Status of user's account */
  val AccountStatus: AccountStatusConstants
  @JSName("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")
  var DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: DIDiskQuotaUser
  /** User's display name */
  val DisplayName: String
  /** Unique ID number */
  val ID: Double
  /** User's logon account name */
  val LogonName: String
  /** User's quota limit (bytes) */
  var QuotaLimit: Double
  /** User's quota limit (text) */
  val QuotaLimitText: String
  /** User's quota warning threshold (bytes) */
  var QuotaThreshold: Double
  /** User's quota warning threshold (text) */
  val QuotaThresholdText: String
  /** Quota charged to user (bytes) */
  val QuotaUsed: Double
  /** Quota charged to user (text) */
  val QuotaUsedText: String
  /** Invalidate data cached in user object */
  def Invalidate(): Unit
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
}

