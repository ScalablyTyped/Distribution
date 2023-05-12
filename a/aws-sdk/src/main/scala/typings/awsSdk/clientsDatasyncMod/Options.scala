package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set Atime to BEST_EFFORT, DataSync attempts to preserve the original Atime attribute on all source files (that is, the version before the PREPARING phase of the task execution).  The behavior of Atime isn't fully standard across platforms, so DataSync can only do this on a best-effort basis.  Default value: BEST_EFFORT   BEST_EFFORT: Attempt to preserve the per-file Atime value (recommended).  NONE: Ignore Atime.  If Atime is set to BEST_EFFORT, Mtime must be set to PRESERVE.  If Atime is set to NONE, Mtime must also be NONE.  
    */
  var Atime: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Atime] = js.undefined
  
  /**
    * Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB, set this value to 1048576 (=1024*1024).
    */
  var BytesPerSecond: js.UndefOr[typings.awsSdk.clientsDatasyncMod.BytesPerSecond] = js.undefined
  
  /**
    * Specifies the POSIX group ID (GID) of the file's owners. For more information, see Metadata copied by DataSync. Default value: INT_VALUE. This preserves the integer value of the ID.  INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).  NONE: Ignore UID and GID.
    */
  var Gid: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Gid] = js.undefined
  
  /**
    * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log group, see CloudWatchLogGroupArn. If you set LogLevel to OFF, no logs are published. BASIC publishes logs on errors for individual files transferred. TRANSFER publishes logs for every file or object that is transferred and integrity checked.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LogLevel] = js.undefined
  
  /**
    * Specifies whether to preserve metadata indicating the last time that a file was written to before the PREPARING phase of your task execution. This option is required when you need to run the a task more than once. Default Value: PRESERVE   PRESERVE: Preserve original Mtime (recommended)  NONE: Ignore Mtime.   If Mtime is set to PRESERVE, Atime must be set to BEST_EFFORT. If Mtime is set to NONE, Atime must also be set to NONE.  
    */
  var Mtime: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Mtime] = js.undefined
  
  /**
    * Specifies whether object tags are preserved when transferring between object storage systems. If you want your DataSync task to ignore object tags, specify the NONE value. Default Value: PRESERVE 
    */
  var ObjectTags: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ObjectTags] = js.undefined
  
  /**
    * Specifies whether data at the destination location should be overwritten or preserved. If set to NEVER, a destination file for example will not be replaced by a source file (even if the destination file differs from the source file). If you modify files in the destination and you sync the files, you can use this value to protect against overwriting those changes.  Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed information, see Considerations when working with Amazon S3 storage classes in DataSync.
    */
  var OverwriteMode: js.UndefOr[typings.awsSdk.clientsDatasyncMod.OverwriteMode] = js.undefined
  
  /**
    * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file. For more information, see Metadata copied by DataSync. Default value: PRESERVE   PRESERVE: Preserve POSIX-style permissions (recommended).  NONE: Ignore permissions.   DataSync can preserve extant permissions of a source location. 
    */
  var PosixPermissions: js.UndefOr[typings.awsSdk.clientsDatasyncMod.PosixPermissions] = js.undefined
  
  /**
    * Specifies whether files in the destination location that don't exist in the source should be preserved. This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage duration charges for certain storage classes. For detailed information, see Considerations when working with Amazon S3 storage classes in DataSync. Default value: PRESERVE   PRESERVE: Ignore such destination files (recommended).   REMOVE: Delete destination files that aren’t present in the source.  If you set this parameter to REMOVE, you can't set TransferMode to ALL. When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete. 
    */
  var PreserveDeletedFiles: js.UndefOr[typings.awsSdk.clientsDatasyncMod.PreserveDeletedFiles] = js.undefined
  
  /**
    * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and recreate the files with that device name and metadata on the destination. DataSync copies only the name and metadata of such devices.  DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an end-of-file (EOF) marker.  Default value: NONE   NONE: Ignore special devices (recommended).   PRESERVE: Preserve character and block device metadata. This option currently isn't supported for Amazon EFS. 
    */
  var PreserveDevices: js.UndefOr[typings.awsSdk.clientsDatasyncMod.PreserveDevices] = js.undefined
  
  /**
    * Specifies which components of the SMB security descriptor are copied from source to destination objects.  This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two FSx for Windows File Server locations. For more information, see how DataSync handles metadata. Default value: OWNER_DACL   OWNER_DACL: For each copied object, DataSync copies the following metadata:   The object owner.   NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object. DataSync won't copy NTFS system access control lists (SACLs) with this option.    OWNER_DACL_SACL: For each copied object, DataSync copies the following metadata:   The object owner.   NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.   SACLs, which are used by administrators to log attempts to access a secured object. Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB location. For information about choosing a user that ensures sufficient permissions to files, folders, and metadata, see user.    NONE: None of the SMB security descriptor components are copied. Destination objects are owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based on the destination server’s configuration. 
    */
  var SecurityDescriptorCopyFlags: js.UndefOr[SmbSecurityDescriptorCopyFlags] = js.undefined
  
  /**
    * Specifies whether tasks should be queued before executing the tasks. The default is ENABLED, which means the tasks will be queued. If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information, see Queueing task executions.
    */
  var TaskQueueing: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskQueueing] = js.undefined
  
  /**
    * Determines whether DataSync transfers only the data and metadata that differ between the source and the destination location or transfers all the content from the source (without comparing what's in the destination).  CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the destination location.  ALL: DataSync copies all source location content to the destination (without comparing what's in the destination).
    */
  var TransferMode: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TransferMode] = js.undefined
  
  /**
    * Specifies the POSIX user ID (UID) of the file's owner. For more information, see Metadata copied by DataSync. Default value: INT_VALUE. This preserves the integer value of the ID.  INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).  NONE: Ignore UID and GID. 
    */
  var Uid: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Uid] = js.undefined
  
  /**
    * Specifies how and when DataSync checks the integrity of your data during a transfer.  Default value: POINT_IN_TIME_CONSISTENT   ONLY_FILES_TRANSFERRED (recommended): DataSync calculates the checksum of transferred files and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum calculated on those files at the destination. We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage classes. For more information, see Storage class considerations with Amazon S3 locations.  POINT_IN_TIME_CONSISTENT: At the end of the transfer, DataSync scans the entire source and destination to verify that both locations are fully synchronized. You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage classes. For more information, see Storage class considerations with Amazon S3 locations.  NONE: DataSync doesn't run additional verification at the end of the transfer. All data transmissions are still integrity-checked with checksum verification during the transfer.
    */
  var VerifyMode: js.UndefOr[typings.awsSdk.clientsDatasyncMod.VerifyMode] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAtime(value: Atime): Self = StObject.set(x, "Atime", value.asInstanceOf[js.Any])
    
    inline def setAtimeUndefined: Self = StObject.set(x, "Atime", js.undefined)
    
    inline def setBytesPerSecond(value: BytesPerSecond): Self = StObject.set(x, "BytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setBytesPerSecondUndefined: Self = StObject.set(x, "BytesPerSecond", js.undefined)
    
    inline def setGid(value: Gid): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "Gid", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setMtime(value: Mtime): Self = StObject.set(x, "Mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "Mtime", js.undefined)
    
    inline def setObjectTags(value: ObjectTags): Self = StObject.set(x, "ObjectTags", value.asInstanceOf[js.Any])
    
    inline def setObjectTagsUndefined: Self = StObject.set(x, "ObjectTags", js.undefined)
    
    inline def setOverwriteMode(value: OverwriteMode): Self = StObject.set(x, "OverwriteMode", value.asInstanceOf[js.Any])
    
    inline def setOverwriteModeUndefined: Self = StObject.set(x, "OverwriteMode", js.undefined)
    
    inline def setPosixPermissions(value: PosixPermissions): Self = StObject.set(x, "PosixPermissions", value.asInstanceOf[js.Any])
    
    inline def setPosixPermissionsUndefined: Self = StObject.set(x, "PosixPermissions", js.undefined)
    
    inline def setPreserveDeletedFiles(value: PreserveDeletedFiles): Self = StObject.set(x, "PreserveDeletedFiles", value.asInstanceOf[js.Any])
    
    inline def setPreserveDeletedFilesUndefined: Self = StObject.set(x, "PreserveDeletedFiles", js.undefined)
    
    inline def setPreserveDevices(value: PreserveDevices): Self = StObject.set(x, "PreserveDevices", value.asInstanceOf[js.Any])
    
    inline def setPreserveDevicesUndefined: Self = StObject.set(x, "PreserveDevices", js.undefined)
    
    inline def setSecurityDescriptorCopyFlags(value: SmbSecurityDescriptorCopyFlags): Self = StObject.set(x, "SecurityDescriptorCopyFlags", value.asInstanceOf[js.Any])
    
    inline def setSecurityDescriptorCopyFlagsUndefined: Self = StObject.set(x, "SecurityDescriptorCopyFlags", js.undefined)
    
    inline def setTaskQueueing(value: TaskQueueing): Self = StObject.set(x, "TaskQueueing", value.asInstanceOf[js.Any])
    
    inline def setTaskQueueingUndefined: Self = StObject.set(x, "TaskQueueing", js.undefined)
    
    inline def setTransferMode(value: TransferMode): Self = StObject.set(x, "TransferMode", value.asInstanceOf[js.Any])
    
    inline def setTransferModeUndefined: Self = StObject.set(x, "TransferMode", js.undefined)
    
    inline def setUid(value: Uid): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
    
    inline def setVerifyMode(value: VerifyMode): Self = StObject.set(x, "VerifyMode", value.asInstanceOf[js.Any])
    
    inline def setVerifyModeUndefined: Self = StObject.set(x, "VerifyMode", js.undefined)
  }
}
