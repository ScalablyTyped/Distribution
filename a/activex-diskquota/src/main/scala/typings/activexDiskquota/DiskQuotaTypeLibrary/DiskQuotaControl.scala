package typings.activexDiskquota.DiskQuotaTypeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Microsoft Disk Quota */
@js.native
trait DiskQuotaControl extends js.Object {
  
  /** Add a user quota entry by Name */
  def AddUser(LogonName: String): DIDiskQuotaUser = js.native
  
  /** Default quota limit applied to new volume users (byte value) */
  var DefaultQuotaLimit: Double = js.native
  
  /** Default quota limit applied to new volume users (text string) */
  val DefaultQuotaLimitText: String = js.native
  
  /** Default warning threshold applied to new volume users (byte value) */
  var DefaultQuotaThreshold: Double = js.native
  
  /** Default warning threshold applied to new volume users (text string) */
  val DefaultQuotaThresholdText: String = js.native
  
  /** Delete a user quota entry */
  def DeleteUser(pUser: DIDiskQuotaUser): Unit = js.native
  
  @JSName("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")
  var DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: DiskQuotaControl = js.native
  
  /** Find a user quota entry by Name */
  def FindUser(LogonName: String): DIDiskQuotaUser = js.native
  
  /** Promote a user quota entry to the head of the name resolution queue */
  def GiveUserNameResolutionPriority(pUser: DIDiskQuotaUser): Unit = js.native
  
  /** Initialize the quota control object for a specified volume */
  def Initialize(path: String, bReadWrite: Boolean): Unit = js.native
  
  /** Invalidate the cache of user name information */
  def InvalidateSidNameCache(): Unit = js.native
  
  /** Write event log entry when user exceeds quota limit */
  var LogQuotaLimit: Boolean = js.native
  
  /** Write event log entry when user exceeds quota warning threshold */
  var LogQuotaThreshold: Boolean = js.native
  
  /** Indicates if quota information is out of date */
  val QuotaFileIncomplete: Boolean = js.native
  
  /** Indicates if quota information is being rebuilt */
  val QuotaFileRebuilding: Boolean = js.native
  
  /** State of the volume's disk quota system */
  var QuotaState: QuotaStateConstants = js.native
  
  /** Terminate the user name resolution thread */
  def ShutdownNameResolution(): Unit = js.native
  
  /** Translates a user logon name to a security ID */
  def TranslateLogonNameToSID(LogonName: String): String = js.native
  
  /** Control the resolution of user Security IDs to user Names */
  var UserNameResolution: UserNameResolutionConstants = js.native
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
  
  @scala.inline
  implicit class DiskQuotaControlOps[Self <: DiskQuotaControl] (val x: Self) extends AnyVal {
    
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
    def setAddUser(value: String => DIDiskQuotaUser): Self = this.set("AddUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultQuotaLimit(value: Double): Self = this.set("DefaultQuotaLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultQuotaLimitText(value: String): Self = this.set("DefaultQuotaLimitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultQuotaThreshold(value: Double): Self = this.set("DefaultQuotaThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultQuotaThresholdText(value: String): Self = this.set("DefaultQuotaThresholdText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUser(value: DIDiskQuotaUser => Unit): Self = this.set("DeleteUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiskQuotaTypeLibraryDotDiskQuotaControl_typekey(value: DiskQuotaControl): Self = this.set("DiskQuotaTypeLibrary.DiskQuotaControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindUser(value: String => DIDiskQuotaUser): Self = this.set("FindUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGiveUserNameResolutionPriority(value: DIDiskQuotaUser => Unit): Self = this.set("GiveUserNameResolutionPriority", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: (String, Boolean) => Unit): Self = this.set("Initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInvalidateSidNameCache(value: () => Unit): Self = this.set("InvalidateSidNameCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogQuotaLimit(value: Boolean): Self = this.set("LogQuotaLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogQuotaThreshold(value: Boolean): Self = this.set("LogQuotaThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaFileIncomplete(value: Boolean): Self = this.set("QuotaFileIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaFileRebuilding(value: Boolean): Self = this.set("QuotaFileRebuilding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaState(value: QuotaStateConstants): Self = this.set("QuotaState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownNameResolution(value: () => Unit): Self = this.set("ShutdownNameResolution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranslateLogonNameToSID(value: String => String): Self = this.set("TranslateLogonNameToSID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserNameResolution(value: UserNameResolutionConstants): Self = this.set("UserNameResolution", value.asInstanceOf[js.Any])
  }
}
