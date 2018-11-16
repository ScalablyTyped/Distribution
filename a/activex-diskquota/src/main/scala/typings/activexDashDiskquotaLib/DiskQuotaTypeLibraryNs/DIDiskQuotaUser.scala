package typings
package activexDashDiskquotaLib.DiskQuotaTypeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Automation interface for DiskQuotaUser */
@JSGlobal("DiskQuotaTypeLibrary.DIDiskQuotaUser")
@js.native
class DIDiskQuotaUser protected () extends js.Object {
  /** Name of user's account container */
  val AccountContainerName: java.lang.String = js.native
  /** Status of user's account */
  val AccountStatus: AccountStatusConstants = js.native
  var `DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey`: DIDiskQuotaUser = js.native
  /** User's display name */
  val DisplayName: java.lang.String = js.native
  /** Unique ID number */
  val ID: scala.Double = js.native
  /** User's logon account name */
  val LogonName: java.lang.String = js.native
  /** User's quota limit (bytes) */
  var QuotaLimit: scala.Double = js.native
  /** User's quota limit (text) */
  val QuotaLimitText: java.lang.String = js.native
  /** User's quota warning threshold (bytes) */
  var QuotaThreshold: scala.Double = js.native
  /** User's quota warning threshold (text) */
  val QuotaThresholdText: java.lang.String = js.native
  /** Quota charged to user (bytes) */
  val QuotaUsed: scala.Double = js.native
  /** Quota charged to user (text) */
  val QuotaUsedText: java.lang.String = js.native
  /** Invalidate data cached in user object */
  def Invalidate(): scala.Unit = js.native
}

