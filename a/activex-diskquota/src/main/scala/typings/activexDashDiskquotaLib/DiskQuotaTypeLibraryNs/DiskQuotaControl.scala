package typings
package activexDashDiskquotaLib.DiskQuotaTypeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft Disk Quota */
@JSGlobal("DiskQuotaTypeLibrary.DiskQuotaControl")
@js.native
class DiskQuotaControl protected () extends js.Object {
  /** Default quota limit applied to new volume users (byte value) */
  var DefaultQuotaLimit: scala.Double = js.native
  /** Default quota limit applied to new volume users (text string) */
  val DefaultQuotaLimitText: java.lang.String = js.native
  /** Default warning threshold applied to new volume users (byte value) */
  var DefaultQuotaThreshold: scala.Double = js.native
  /** Default warning threshold applied to new volume users (text string) */
  val DefaultQuotaThresholdText: java.lang.String = js.native
  var `DiskQuotaTypeLibrary.DiskQuotaControl_typekey`: DiskQuotaControl = js.native
  /** Write event log entry when user exceeds quota limit */
  var LogQuotaLimit: scala.Boolean = js.native
  /** Write event log entry when user exceeds quota warning threshold */
  var LogQuotaThreshold: scala.Boolean = js.native
  /** Indicates if quota information is out of date */
  val QuotaFileIncomplete: scala.Boolean = js.native
  /** Indicates if quota information is being rebuilt */
  val QuotaFileRebuilding: scala.Boolean = js.native
  /** State of the volume's disk quota system */
  var QuotaState: QuotaStateConstants = js.native
  /** Control the resolution of user Security IDs to user Names */
  var UserNameResolution: UserNameResolutionConstants = js.native
  /** Add a user quota entry by Name */
  def AddUser(LogonName: java.lang.String): DIDiskQuotaUser = js.native
  /** Delete a user quota entry */
  def DeleteUser(pUser: DIDiskQuotaUser): scala.Unit = js.native
  /** Find a user quota entry by Name */
  def FindUser(LogonName: java.lang.String): DIDiskQuotaUser = js.native
  /** Promote a user quota entry to the head of the name resolution queue */
  def GiveUserNameResolutionPriority(pUser: DIDiskQuotaUser): scala.Unit = js.native
  /** Initialize the quota control object for a specified volume */
  def Initialize(path: java.lang.String, bReadWrite: scala.Boolean): scala.Unit = js.native
  /** Invalidate the cache of user name information */
  def InvalidateSidNameCache(): scala.Unit = js.native
  /** Terminate the user name resolution thread */
  def ShutdownNameResolution(): scala.Unit = js.native
  /** Translates a user logon name to a security ID */
  def TranslateLogonNameToSID(LogonName: java.lang.String): java.lang.String = js.native
}

