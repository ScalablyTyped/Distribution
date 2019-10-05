package typings.activexDashDiskquota.DiskQuotaTypeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Automation interface for DiskQuotaUser */
@JSGlobal("DiskQuotaTypeLibrary.DIDiskQuotaUser")
@js.native
class DIDiskQuotaUser protected () extends js.Object {
  /** Name of user's account container */
  val AccountContainerName: String = js.native
  /** Status of user's account */
  val AccountStatus: AccountStatusConstants = js.native
  var `DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey`: DIDiskQuotaUser = js.native
  /** User's display name */
  val DisplayName: String = js.native
  /** Unique ID number */
  val ID: Double = js.native
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
  /** Invalidate data cached in user object */
  def Invalidate(): Unit = js.native
}

