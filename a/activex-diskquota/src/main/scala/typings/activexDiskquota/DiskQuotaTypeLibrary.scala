package typings.activexDiskquota

import typings.activexDiskquota.activexDiskquotaNumbers.`0`
import typings.activexDiskquota.activexDiskquotaNumbers.`1`
import typings.activexDiskquota.activexDiskquotaNumbers.`2`
import typings.activexDiskquota.activexDiskquotaNumbers.`3`
import typings.activexDiskquota.activexDiskquotaNumbers.`4`
import typings.activexDiskquota.activexDiskquotaNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiskQuotaTypeLibrary {
  
  // tslint:disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexDiskquota.activexDiskquotaNumbers.`2`
    - typings.activexDiskquota.activexDiskquotaNumbers.`3`
    - typings.activexDiskquota.activexDiskquotaNumbers.`0`
    - typings.activexDiskquota.activexDiskquotaNumbers.`1`
    - typings.activexDiskquota.activexDiskquotaNumbers.`4`
    - typings.activexDiskquota.activexDiskquotaNumbers.`5`
  */
  trait AccountStatusConstants extends StObject
  object AccountStatusConstants {
    
    @scala.inline
    def dqAcctDeleted: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def dqAcctInvalid: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def dqAcctResolved: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def dqAcctUnavailable: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def dqAcctUnknown: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def dqAcctUnresolved: `5` = 5.asInstanceOf[`5`]
  }
  
  /** Automation interface for DiskQuotaUser */
  @js.native
  trait DIDiskQuotaUser extends StObject {
    
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
    implicit class DIDiskQuotaUserMutableBuilder[Self <: DIDiskQuotaUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountContainerName(value: String): Self = StObject.set(x, "AccountContainerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountStatus(value: AccountStatusConstants): Self = StObject.set(x, "AccountStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey(value: DIDiskQuotaUser): Self = StObject.set(x, "DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidate(value: () => Unit): Self = StObject.set(x, "Invalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogonName(value: String): Self = StObject.set(x, "LogonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaLimit(value: Double): Self = StObject.set(x, "QuotaLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaLimitText(value: String): Self = StObject.set(x, "QuotaLimitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaThreshold(value: Double): Self = StObject.set(x, "QuotaThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaThresholdText(value: String): Self = StObject.set(x, "QuotaThresholdText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUsed(value: Double): Self = StObject.set(x, "QuotaUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUsedText(value: String): Self = StObject.set(x, "QuotaUsedText", value.asInstanceOf[js.Any])
    }
  }
  
  /** Microsoft Disk Quota */
  @js.native
  trait DiskQuotaControl extends StObject {
    
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
    implicit class DiskQuotaControlMutableBuilder[Self <: DiskQuotaControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddUser(value: String => DIDiskQuotaUser): Self = StObject.set(x, "AddUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultQuotaLimit(value: Double): Self = StObject.set(x, "DefaultQuotaLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultQuotaLimitText(value: String): Self = StObject.set(x, "DefaultQuotaLimitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultQuotaThreshold(value: Double): Self = StObject.set(x, "DefaultQuotaThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultQuotaThresholdText(value: String): Self = StObject.set(x, "DefaultQuotaThresholdText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUser(value: DIDiskQuotaUser => Unit): Self = StObject.set(x, "DeleteUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDiskQuotaTypeLibraryDotDiskQuotaControl_typekey(value: DiskQuotaControl): Self = StObject.set(x, "DiskQuotaTypeLibrary.DiskQuotaControl_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindUser(value: String => DIDiskQuotaUser): Self = StObject.set(x, "FindUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGiveUserNameResolutionPriority(value: DIDiskQuotaUser => Unit): Self = StObject.set(x, "GiveUserNameResolutionPriority", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialize(value: (String, Boolean) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalidateSidNameCache(value: () => Unit): Self = StObject.set(x, "InvalidateSidNameCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogQuotaLimit(value: Boolean): Self = StObject.set(x, "LogQuotaLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogQuotaThreshold(value: Boolean): Self = StObject.set(x, "LogQuotaThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaFileIncomplete(value: Boolean): Self = StObject.set(x, "QuotaFileIncomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaFileRebuilding(value: Boolean): Self = StObject.set(x, "QuotaFileRebuilding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaState(value: QuotaStateConstants): Self = StObject.set(x, "QuotaState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShutdownNameResolution(value: () => Unit): Self = StObject.set(x, "ShutdownNameResolution", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranslateLogonNameToSID(value: String => String): Self = StObject.set(x, "TranslateLogonNameToSID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUserNameResolution(value: UserNameResolutionConstants): Self = StObject.set(x, "UserNameResolution", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexDiskquota.activexDiskquotaNumbers.`0`
    - typings.activexDiskquota.activexDiskquotaNumbers.`2`
    - typings.activexDiskquota.activexDiskquotaNumbers.`1`
  */
  trait QuotaStateConstants extends StObject
  object QuotaStateConstants {
    
    @scala.inline
    def dqStateDisable: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def dqStateEnforce: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def dqStateTrack: `1` = 1.asInstanceOf[`1`]
  }
  
  // tslint:disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexDiskquota.activexDiskquotaNumbers.`2`
    - typings.activexDiskquota.activexDiskquotaNumbers.`0`
    - typings.activexDiskquota.activexDiskquotaNumbers.`1`
  */
  trait UserNameResolutionConstants extends StObject
  object UserNameResolutionConstants {
    
    @scala.inline
    def dqResolveAsync: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def dqResolveNone: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def dqResolveSync: `1` = 1.asInstanceOf[`1`]
  }
}
