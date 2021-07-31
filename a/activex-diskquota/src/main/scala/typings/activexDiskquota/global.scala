package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.AccountStatusConstants
import typings.activexDiskquota.DiskQuotaTypeLibrary.QuotaStateConstants
import typings.activexDiskquota.DiskQuotaTypeLibrary.UserNameResolutionConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DiskQuotaTypeLibrary {
    
    /** Automation interface for DiskQuotaUser */
    @JSGlobal("DiskQuotaTypeLibrary.DIDiskQuotaUser")
    @js.native
    class DIDiskQuotaUser protected ()
      extends StObject
         with typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser {
      
      /** Name of user's account container */
      /* CompleteClass */
      override val AccountContainerName: String = js.native
      
      /** Status of user's account */
      /* CompleteClass */
      override val AccountStatus: AccountStatusConstants = js.native
      
      /* CompleteClass */
      @JSName("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")
      var DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser = js.native
      
      /** User's display name */
      /* CompleteClass */
      override val DisplayName: String = js.native
      
      /** Unique ID number */
      /* CompleteClass */
      override val ID: Double = js.native
      
      /** Invalidate data cached in user object */
      /* CompleteClass */
      override def Invalidate(): Unit = js.native
      
      /** User's logon account name */
      /* CompleteClass */
      override val LogonName: String = js.native
      
      /** User's quota limit (bytes) */
      /* CompleteClass */
      var QuotaLimit: Double = js.native
      
      /** User's quota limit (text) */
      /* CompleteClass */
      override val QuotaLimitText: String = js.native
      
      /** User's quota warning threshold (bytes) */
      /* CompleteClass */
      var QuotaThreshold: Double = js.native
      
      /** User's quota warning threshold (text) */
      /* CompleteClass */
      override val QuotaThresholdText: String = js.native
      
      /** Quota charged to user (bytes) */
      /* CompleteClass */
      override val QuotaUsed: Double = js.native
      
      /** Quota charged to user (text) */
      /* CompleteClass */
      override val QuotaUsedText: String = js.native
    }
    
    /** Microsoft Disk Quota */
    @JSGlobal("DiskQuotaTypeLibrary.DiskQuotaControl")
    @js.native
    class DiskQuotaControl protected ()
      extends StObject
         with typings.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl {
      
      /** Add a user quota entry by Name */
      /* CompleteClass */
      override def AddUser(LogonName: String): typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser = js.native
      
      /** Default quota limit applied to new volume users (byte value) */
      /* CompleteClass */
      var DefaultQuotaLimit: Double = js.native
      
      /** Default quota limit applied to new volume users (text string) */
      /* CompleteClass */
      override val DefaultQuotaLimitText: String = js.native
      
      /** Default warning threshold applied to new volume users (byte value) */
      /* CompleteClass */
      var DefaultQuotaThreshold: Double = js.native
      
      /** Default warning threshold applied to new volume users (text string) */
      /* CompleteClass */
      override val DefaultQuotaThresholdText: String = js.native
      
      /** Delete a user quota entry */
      /* CompleteClass */
      override def DeleteUser(pUser: typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser): Unit = js.native
      
      /* CompleteClass */
      @JSName("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")
      var DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: typings.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl = js.native
      
      /** Find a user quota entry by Name */
      /* CompleteClass */
      override def FindUser(LogonName: String): typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser = js.native
      
      /** Promote a user quota entry to the head of the name resolution queue */
      /* CompleteClass */
      override def GiveUserNameResolutionPriority(pUser: typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser): Unit = js.native
      
      /** Initialize the quota control object for a specified volume */
      /* CompleteClass */
      override def Initialize(path: String, bReadWrite: Boolean): Unit = js.native
      
      /** Invalidate the cache of user name information */
      /* CompleteClass */
      override def InvalidateSidNameCache(): Unit = js.native
      
      /** Write event log entry when user exceeds quota limit */
      /* CompleteClass */
      var LogQuotaLimit: Boolean = js.native
      
      /** Write event log entry when user exceeds quota warning threshold */
      /* CompleteClass */
      var LogQuotaThreshold: Boolean = js.native
      
      /** Indicates if quota information is out of date */
      /* CompleteClass */
      override val QuotaFileIncomplete: Boolean = js.native
      
      /** Indicates if quota information is being rebuilt */
      /* CompleteClass */
      override val QuotaFileRebuilding: Boolean = js.native
      
      /** State of the volume's disk quota system */
      /* CompleteClass */
      var QuotaState: QuotaStateConstants = js.native
      
      /** Terminate the user name resolution thread */
      /* CompleteClass */
      override def ShutdownNameResolution(): Unit = js.native
      
      /** Translates a user logon name to a security ID */
      /* CompleteClass */
      override def TranslateLogonNameToSID(LogonName: String): String = js.native
      
      /** Control the resolution of user Security IDs to user Names */
      /* CompleteClass */
      var UserNameResolution: UserNameResolutionConstants = js.native
    }
  }
}
