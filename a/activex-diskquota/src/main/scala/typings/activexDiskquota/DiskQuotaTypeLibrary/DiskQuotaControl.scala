package typings.activexDiskquota.DiskQuotaTypeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft Disk Quota */
trait DiskQuotaControl extends js.Object {
  /** Default quota limit applied to new volume users (byte value) */
  var DefaultQuotaLimit: Double
  /** Default quota limit applied to new volume users (text string) */
  val DefaultQuotaLimitText: String
  /** Default warning threshold applied to new volume users (byte value) */
  var DefaultQuotaThreshold: Double
  /** Default warning threshold applied to new volume users (text string) */
  val DefaultQuotaThresholdText: String
  @JSName("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")
  var DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: DiskQuotaControl
  /** Write event log entry when user exceeds quota limit */
  var LogQuotaLimit: Boolean
  /** Write event log entry when user exceeds quota warning threshold */
  var LogQuotaThreshold: Boolean
  /** Indicates if quota information is out of date */
  val QuotaFileIncomplete: Boolean
  /** Indicates if quota information is being rebuilt */
  val QuotaFileRebuilding: Boolean
  /** State of the volume's disk quota system */
  var QuotaState: QuotaStateConstants
  /** Control the resolution of user Security IDs to user Names */
  var UserNameResolution: UserNameResolutionConstants
  /** Add a user quota entry by Name */
  def AddUser(LogonName: String): DIDiskQuotaUser
  /** Delete a user quota entry */
  def DeleteUser(pUser: DIDiskQuotaUser): Unit
  /** Find a user quota entry by Name */
  def FindUser(LogonName: String): DIDiskQuotaUser
  /** Promote a user quota entry to the head of the name resolution queue */
  def GiveUserNameResolutionPriority(pUser: DIDiskQuotaUser): Unit
  /** Initialize the quota control object for a specified volume */
  def Initialize(path: String, bReadWrite: Boolean): Unit
  /** Invalidate the cache of user name information */
  def InvalidateSidNameCache(): Unit
  /** Terminate the user name resolution thread */
  def ShutdownNameResolution(): Unit
  /** Translates a user logon name to a security ID */
  def TranslateLogonNameToSID(LogonName: String): String
}

object DiskQuotaControl {
  @scala.inline
  def apply(
    AddUser: String => DIDiskQuotaUser,
    DefaultQuotaLimit: Double,
    DefaultQuotaLimitText: String,
    DefaultQuotaThreshold: Double,
    DefaultQuotaThresholdText: String,
    DeleteUser: DIDiskQuotaUser => Unit,
    DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: DiskQuotaControl,
    FindUser: String => DIDiskQuotaUser,
    GiveUserNameResolutionPriority: DIDiskQuotaUser => Unit,
    Initialize: (String, Boolean) => Unit,
    InvalidateSidNameCache: () => Unit,
    LogQuotaLimit: Boolean,
    LogQuotaThreshold: Boolean,
    QuotaFileIncomplete: Boolean,
    QuotaFileRebuilding: Boolean,
    QuotaState: QuotaStateConstants,
    ShutdownNameResolution: () => Unit,
    TranslateLogonNameToSID: String => String,
    UserNameResolution: UserNameResolutionConstants
  ): DiskQuotaControl = {
    val __obj = js.Dynamic.literal(AddUser = js.Any.fromFunction1(AddUser), DefaultQuotaLimit = DefaultQuotaLimit.asInstanceOf[js.Any], DefaultQuotaLimitText = DefaultQuotaLimitText.asInstanceOf[js.Any], DefaultQuotaThreshold = DefaultQuotaThreshold.asInstanceOf[js.Any], DefaultQuotaThresholdText = DefaultQuotaThresholdText.asInstanceOf[js.Any], DeleteUser = js.Any.fromFunction1(DeleteUser), FindUser = js.Any.fromFunction1(FindUser), GiveUserNameResolutionPriority = js.Any.fromFunction1(GiveUserNameResolutionPriority), Initialize = js.Any.fromFunction2(Initialize), InvalidateSidNameCache = js.Any.fromFunction0(InvalidateSidNameCache), LogQuotaLimit = LogQuotaLimit.asInstanceOf[js.Any], LogQuotaThreshold = LogQuotaThreshold.asInstanceOf[js.Any], QuotaFileIncomplete = QuotaFileIncomplete.asInstanceOf[js.Any], QuotaFileRebuilding = QuotaFileRebuilding.asInstanceOf[js.Any], QuotaState = QuotaState.asInstanceOf[js.Any], ShutdownNameResolution = js.Any.fromFunction0(ShutdownNameResolution), TranslateLogonNameToSID = js.Any.fromFunction1(TranslateLogonNameToSID), UserNameResolution = UserNameResolution.asInstanceOf[js.Any])
    __obj.updateDynamic("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")(DiskQuotaTypeLibraryDotDiskQuotaControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskQuotaControl]
  }
}

