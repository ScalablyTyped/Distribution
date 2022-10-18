package typings.awsSdk.clientsFsxMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSx extends Service {
  
  /**
    * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows File Server file system. A file system can have a maximum of 50 DNS aliases associated with it at any one time. If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that alias in the request. For more information, see Working with DNS Aliases and Walkthrough 5: Using DNS aliases to access your file system, including additional steps you must take to be able to access your file system using a DNS alias. The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
    */
  def associateFileSystemAliases(): Request[AssociateFileSystemAliasesResponse, AWSError] = js.native
  def associateFileSystemAliases(callback: js.Function2[/* err */ AWSError, /* data */ AssociateFileSystemAliasesResponse, Unit]): Request[AssociateFileSystemAliasesResponse, AWSError] = js.native
  /**
    * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows File Server file system. A file system can have a maximum of 50 DNS aliases associated with it at any one time. If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that alias in the request. For more information, see Working with DNS Aliases and Walkthrough 5: Using DNS aliases to access your file system, including additional steps you must take to be able to access your file system using a DNS alias. The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
    */
  def associateFileSystemAliases(params: AssociateFileSystemAliasesRequest): Request[AssociateFileSystemAliasesResponse, AWSError] = js.native
  def associateFileSystemAliases(
    params: AssociateFileSystemAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateFileSystemAliasesResponse, Unit]
  ): Request[AssociateFileSystemAliasesResponse, AWSError] = js.native
  
  /**
    * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the PENDING or EXECUTING state. When you cancel a task, Amazon FSx does the following.   Any files that FSx has already exported are not reverted.   FSx continues to export any files that are "in-flight" when the cancel operation is received.   FSx does not export any files that have not yet been exported.  
    */
  def cancelDataRepositoryTask(): Request[CancelDataRepositoryTaskResponse, AWSError] = js.native
  def cancelDataRepositoryTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelDataRepositoryTaskResponse, Unit]): Request[CancelDataRepositoryTaskResponse, AWSError] = js.native
  /**
    * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the PENDING or EXECUTING state. When you cancel a task, Amazon FSx does the following.   Any files that FSx has already exported are not reverted.   FSx continues to export any files that are "in-flight" when the cancel operation is received.   FSx does not export any files that have not yet been exported.  
    */
  def cancelDataRepositoryTask(params: CancelDataRepositoryTaskRequest): Request[CancelDataRepositoryTaskResponse, AWSError] = js.native
  def cancelDataRepositoryTask(
    params: CancelDataRepositoryTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelDataRepositoryTaskResponse, Unit]
  ): Request[CancelDataRepositoryTaskResponse, AWSError] = js.native
  
  @JSName("config")
  var config_FSx: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies an existing backup within the same Amazon Web Services account to another Amazon Web Services Region (cross-Region copy) or within the same Amazon Web Services Region (in-Region copy). You can have up to five backup copy requests in progress to a single destination Region per account. You can use cross-Region backup copies for cross-Region disaster recovery. You can periodically take backups and copy them to another Region so that in the event of a disaster in the primary Region, you can restore from backup and recover availability quickly in the other Region. You can make cross-Region copies only within your Amazon Web Services partition. A partition is a grouping of Regions. Amazon Web Services currently has three partitions: aws (Standard Regions), aws-cn (China Regions), and aws-us-gov (Amazon Web Services GovCloud [US] Regions). You can also use backup copies to clone your file dataset to another Region or within the same Region. You can use the SourceRegion parameter to specify the Amazon Web Services Region from which the backup will be copied. For example, if you make the call from the us-west-1 Region and want to copy a backup from the us-east-2 Region, you specify us-east-2 in the SourceRegion parameter to make a cross-Region copy. If you don't specify a Region, the backup copy is created in the same Region where the request is sent from (in-Region copy). For more information about creating backup copies, see  Copying backups in the Amazon FSx for Windows User Guide, Copying backups in the Amazon FSx for Lustre User Guide, and Copying backups in the Amazon FSx for OpenZFS User Guide.
    */
  def copyBackup(): Request[CopyBackupResponse, AWSError] = js.native
  def copyBackup(callback: js.Function2[/* err */ AWSError, /* data */ CopyBackupResponse, Unit]): Request[CopyBackupResponse, AWSError] = js.native
  /**
    * Copies an existing backup within the same Amazon Web Services account to another Amazon Web Services Region (cross-Region copy) or within the same Amazon Web Services Region (in-Region copy). You can have up to five backup copy requests in progress to a single destination Region per account. You can use cross-Region backup copies for cross-Region disaster recovery. You can periodically take backups and copy them to another Region so that in the event of a disaster in the primary Region, you can restore from backup and recover availability quickly in the other Region. You can make cross-Region copies only within your Amazon Web Services partition. A partition is a grouping of Regions. Amazon Web Services currently has three partitions: aws (Standard Regions), aws-cn (China Regions), and aws-us-gov (Amazon Web Services GovCloud [US] Regions). You can also use backup copies to clone your file dataset to another Region or within the same Region. You can use the SourceRegion parameter to specify the Amazon Web Services Region from which the backup will be copied. For example, if you make the call from the us-west-1 Region and want to copy a backup from the us-east-2 Region, you specify us-east-2 in the SourceRegion parameter to make a cross-Region copy. If you don't specify a Region, the backup copy is created in the same Region where the request is sent from (in-Region copy). For more information about creating backup copies, see  Copying backups in the Amazon FSx for Windows User Guide, Copying backups in the Amazon FSx for Lustre User Guide, and Copying backups in the Amazon FSx for OpenZFS User Guide.
    */
  def copyBackup(params: CopyBackupRequest): Request[CopyBackupResponse, AWSError] = js.native
  def copyBackup(
    params: CopyBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyBackupResponse, Unit]
  ): Request[CopyBackupResponse, AWSError] = js.native
  
  /**
    * Creates a backup of an existing Amazon FSx for Windows File Server file system, Amazon FSx for Lustre file system, Amazon FSx for NetApp ONTAP volume, or Amazon FSx for OpenZFS file system. We recommend creating regular backups so that you can restore a file system or volume from a backup if an issue arises with the original file system or volume. For Amazon FSx for Lustre file systems, you can create a backup only for file systems that have the following configuration:   A Persistent deployment type   Are not linked to a data repository   For more information about backups, see the following:   For Amazon FSx for Lustre, see Working with FSx for Lustre backups.   For Amazon FSx for Windows, see Working with FSx for Windows backups.   For Amazon FSx for NetApp ONTAP, see Working with FSx for NetApp ONTAP backups.   For Amazon FSx for OpenZFS, see Working with FSx for OpenZFS backups.   If a backup with the specified client request token exists and the parameters match, this operation returns the description of the existing backup. If a backup with the specified client request token exists and the parameters don't match, this operation returns IncompatibleParameterError. If a backup with the specified client request token doesn't exist, CreateBackup does the following:    Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the backup.   By using the idempotent operation, you can retry a CreateBackup operation without the risk of creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear whether a backup was created. If you use the same client request token and the initial call created a backup, the operation returns a successful result because all the parameters are the same. The CreateBackup operation returns while the backup's lifecycle state is still CREATING. You can check the backup creation status by calling the DescribeBackups operation, which returns the backup state along with other information.
    */
  def createBackup(): Request[CreateBackupResponse, AWSError] = js.native
  def createBackup(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupResponse, Unit]): Request[CreateBackupResponse, AWSError] = js.native
  /**
    * Creates a backup of an existing Amazon FSx for Windows File Server file system, Amazon FSx for Lustre file system, Amazon FSx for NetApp ONTAP volume, or Amazon FSx for OpenZFS file system. We recommend creating regular backups so that you can restore a file system or volume from a backup if an issue arises with the original file system or volume. For Amazon FSx for Lustre file systems, you can create a backup only for file systems that have the following configuration:   A Persistent deployment type   Are not linked to a data repository   For more information about backups, see the following:   For Amazon FSx for Lustre, see Working with FSx for Lustre backups.   For Amazon FSx for Windows, see Working with FSx for Windows backups.   For Amazon FSx for NetApp ONTAP, see Working with FSx for NetApp ONTAP backups.   For Amazon FSx for OpenZFS, see Working with FSx for OpenZFS backups.   If a backup with the specified client request token exists and the parameters match, this operation returns the description of the existing backup. If a backup with the specified client request token exists and the parameters don't match, this operation returns IncompatibleParameterError. If a backup with the specified client request token doesn't exist, CreateBackup does the following:    Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the backup.   By using the idempotent operation, you can retry a CreateBackup operation without the risk of creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear whether a backup was created. If you use the same client request token and the initial call created a backup, the operation returns a successful result because all the parameters are the same. The CreateBackup operation returns while the backup's lifecycle state is still CREATING. You can check the backup creation status by calling the DescribeBackups operation, which returns the backup state along with other information.
    */
  def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse, AWSError] = js.native
  def createBackup(
    params: CreateBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupResponse, Unit]
  ): Request[CreateBackupResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon FSx for Lustre data repository association (DRA). A data repository association is a link between a directory on the file system and an Amazon S3 bucket or prefix. You can have a maximum of 8 data repository associations on a file system. Data repository associations are supported only for file systems with the Persistent_2 deployment type. Each data repository association must have a unique Amazon FSx file system directory and a unique S3 bucket or prefix associated with it. You can configure a data repository association for automatic import only, for automatic export only, or for both. To learn more about linking a data repository to your file system, see Linking your file system to an S3 bucket.   CreateDataRepositoryAssociation isn't supported on Amazon File Cache resources. To create a DRA on Amazon File Cache, use the CreateFileCache operation. 
    */
  def createDataRepositoryAssociation(): Request[CreateDataRepositoryAssociationResponse, AWSError] = js.native
  def createDataRepositoryAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataRepositoryAssociationResponse, Unit]
  ): Request[CreateDataRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Creates an Amazon FSx for Lustre data repository association (DRA). A data repository association is a link between a directory on the file system and an Amazon S3 bucket or prefix. You can have a maximum of 8 data repository associations on a file system. Data repository associations are supported only for file systems with the Persistent_2 deployment type. Each data repository association must have a unique Amazon FSx file system directory and a unique S3 bucket or prefix associated with it. You can configure a data repository association for automatic import only, for automatic export only, or for both. To learn more about linking a data repository to your file system, see Linking your file system to an S3 bucket.   CreateDataRepositoryAssociation isn't supported on Amazon File Cache resources. To create a DRA on Amazon File Cache, use the CreateFileCache operation. 
    */
  def createDataRepositoryAssociation(params: CreateDataRepositoryAssociationRequest): Request[CreateDataRepositoryAssociationResponse, AWSError] = js.native
  def createDataRepositoryAssociation(
    params: CreateDataRepositoryAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataRepositoryAssociationResponse, Unit]
  ): Request[CreateDataRepositoryAssociationResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations between your Amazon FSx file system and its linked data repositories. An example of a data repository task is exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links (symlinks) from your FSx file system to a linked data repository. A CreateDataRepositoryTask operation will fail if a data repository is not linked to the FSx file system. To learn more about data repository tasks, see Data Repository Tasks. To learn more about linking a data repository to your file system, see Linking your file system to an S3 bucket.
    */
  def createDataRepositoryTask(): Request[CreateDataRepositoryTaskResponse, AWSError] = js.native
  def createDataRepositoryTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataRepositoryTaskResponse, Unit]): Request[CreateDataRepositoryTaskResponse, AWSError] = js.native
  /**
    * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations between your Amazon FSx file system and its linked data repositories. An example of a data repository task is exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links (symlinks) from your FSx file system to a linked data repository. A CreateDataRepositoryTask operation will fail if a data repository is not linked to the FSx file system. To learn more about data repository tasks, see Data Repository Tasks. To learn more about linking a data repository to your file system, see Linking your file system to an S3 bucket.
    */
  def createDataRepositoryTask(params: CreateDataRepositoryTaskRequest): Request[CreateDataRepositoryTaskResponse, AWSError] = js.native
  def createDataRepositoryTask(
    params: CreateDataRepositoryTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataRepositoryTaskResponse, Unit]
  ): Request[CreateDataRepositoryTaskResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon File Cache resource. You can use this operation with a client request token in the request that Amazon File Cache uses to ensure idempotent creation. If a cache with the specified client request token exists and the parameters match, CreateFileCache returns the description of the existing cache. If a cache with the specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file cache with the specified client request token doesn't exist, CreateFileCache does the following:    Creates a new, empty Amazon File Cache resourcewith an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the cache in JSON format.    The CreateFileCache call returns while the cache's lifecycle state is still CREATING. You can check the cache creation status by calling the DescribeFileCaches operation, which returns the cache state along with other information. 
    */
  def createFileCache(): Request[CreateFileCacheResponse, AWSError] = js.native
  def createFileCache(callback: js.Function2[/* err */ AWSError, /* data */ CreateFileCacheResponse, Unit]): Request[CreateFileCacheResponse, AWSError] = js.native
  /**
    * Creates a new Amazon File Cache resource. You can use this operation with a client request token in the request that Amazon File Cache uses to ensure idempotent creation. If a cache with the specified client request token exists and the parameters match, CreateFileCache returns the description of the existing cache. If a cache with the specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file cache with the specified client request token doesn't exist, CreateFileCache does the following:    Creates a new, empty Amazon File Cache resourcewith an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the cache in JSON format.    The CreateFileCache call returns while the cache's lifecycle state is still CREATING. You can check the cache creation status by calling the DescribeFileCaches operation, which returns the cache state along with other information. 
    */
  def createFileCache(params: CreateFileCacheRequest): Request[CreateFileCacheResponse, AWSError] = js.native
  def createFileCache(
    params: CreateFileCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFileCacheResponse, Unit]
  ): Request[CreateFileCacheResponse, AWSError] = js.native
  
  /**
    * Creates a new, empty Amazon FSx file system. You can create the following supported Amazon FSx file systems using the CreateFileSystem API operation:   Amazon FSx for Lustre   Amazon FSx for NetApp ONTAP   Amazon FSx for OpenZFS   Amazon FSx for Windows File Server   This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation. This means that calling the operation multiple times with the same client request token has no effect. By using the idempotent operation, you can retry a CreateFileSystem operation without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same. If a file system with the specified client request token exists and the parameters match, CreateFileSystem returns the description of the existing file system. If a file system with the specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, CreateFileSystem does the following:    Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system in JSON format.    The CreateFileSystem call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
    */
  def createFileSystem(): Request[CreateFileSystemResponse, AWSError] = js.native
  def createFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ CreateFileSystemResponse, Unit]): Request[CreateFileSystemResponse, AWSError] = js.native
  /**
    * Creates a new, empty Amazon FSx file system. You can create the following supported Amazon FSx file systems using the CreateFileSystem API operation:   Amazon FSx for Lustre   Amazon FSx for NetApp ONTAP   Amazon FSx for OpenZFS   Amazon FSx for Windows File Server   This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation. This means that calling the operation multiple times with the same client request token has no effect. By using the idempotent operation, you can retry a CreateFileSystem operation without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same. If a file system with the specified client request token exists and the parameters match, CreateFileSystem returns the description of the existing file system. If a file system with the specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, CreateFileSystem does the following:    Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system in JSON format.    The CreateFileSystem call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
    */
  def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse, AWSError] = js.native
  def createFileSystem(
    params: CreateFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFileSystemResponse, Unit]
  ): Request[CreateFileSystemResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon FSx for Lustre, Amazon FSx for Windows File Server, or Amazon FSx for OpenZFS file system from an existing Amazon FSx backup. If a file system with the specified client request token exists and the parameters match, this operation returns the description of the file system. If a file system with the specified client request token exists but the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, this operation does the following:   Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   Parameters like the Active Directory, default share name, automatic backup, and backup settings default to the parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings. By using the idempotent operation, you can retry a CreateFileSystemFromBackup call without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives a success message as long as the parameters are the same.  The CreateFileSystemFromBackup call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the  DescribeFileSystems operation, which returns the file system state along with other information. 
    */
  def createFileSystemFromBackup(): Request[CreateFileSystemFromBackupResponse, AWSError] = js.native
  def createFileSystemFromBackup(callback: js.Function2[/* err */ AWSError, /* data */ CreateFileSystemFromBackupResponse, Unit]): Request[CreateFileSystemFromBackupResponse, AWSError] = js.native
  /**
    * Creates a new Amazon FSx for Lustre, Amazon FSx for Windows File Server, or Amazon FSx for OpenZFS file system from an existing Amazon FSx backup. If a file system with the specified client request token exists and the parameters match, this operation returns the description of the file system. If a file system with the specified client request token exists but the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, this operation does the following:   Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   Parameters like the Active Directory, default share name, automatic backup, and backup settings default to the parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings. By using the idempotent operation, you can retry a CreateFileSystemFromBackup call without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives a success message as long as the parameters are the same.  The CreateFileSystemFromBackup call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the  DescribeFileSystems operation, which returns the file system state along with other information. 
    */
  def createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest): Request[CreateFileSystemFromBackupResponse, AWSError] = js.native
  def createFileSystemFromBackup(
    params: CreateFileSystemFromBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFileSystemFromBackupResponse, Unit]
  ): Request[CreateFileSystemFromBackupResponse, AWSError] = js.native
  
  /**
    * Creates a snapshot of an existing Amazon FSx for OpenZFS volume. With snapshots, you can easily undo file changes and compare file versions by restoring the volume to a previous version. If a snapshot with the specified client request token exists, and the parameters match, this operation returns the description of the existing snapshot. If a snapshot with the specified client request token exists, and the parameters don't match, this operation returns IncompatibleParameterError. If a snapshot with the specified client request token doesn't exist, CreateSnapshot does the following:   Creates a new OpenZFS snapshot with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the snapshot.   By using the idempotent operation, you can retry a CreateSnapshot operation without the risk of creating an extra snapshot. This approach can be useful when an initial call fails in a way that makes it unclear whether a snapshot was created. If you use the same client request token and the initial call created a snapshot, the operation returns a successful result because all the parameters are the same. The CreateSnapshot operation returns while the snapshot's lifecycle state is still CREATING. You can check the snapshot creation status by calling the DescribeSnapshots operation, which returns the snapshot state along with other information.
    */
  def createSnapshot(): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]): Request[CreateSnapshotResponse, AWSError] = js.native
  /**
    * Creates a snapshot of an existing Amazon FSx for OpenZFS volume. With snapshots, you can easily undo file changes and compare file versions by restoring the volume to a previous version. If a snapshot with the specified client request token exists, and the parameters match, this operation returns the description of the existing snapshot. If a snapshot with the specified client request token exists, and the parameters don't match, this operation returns IncompatibleParameterError. If a snapshot with the specified client request token doesn't exist, CreateSnapshot does the following:   Creates a new OpenZFS snapshot with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the snapshot.   By using the idempotent operation, you can retry a CreateSnapshot operation without the risk of creating an extra snapshot. This approach can be useful when an initial call fails in a way that makes it unclear whether a snapshot was created. If you use the same client request token and the initial call created a snapshot, the operation returns a successful result because all the parameters are the same. The CreateSnapshot operation returns while the snapshot's lifecycle state is still CREATING. You can check the snapshot creation status by calling the DescribeSnapshots operation, which returns the snapshot state along with other information.
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]
  ): Request[CreateSnapshotResponse, AWSError] = js.native
  
  /**
    * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
    */
  def createStorageVirtualMachine(): Request[CreateStorageVirtualMachineResponse, AWSError] = js.native
  def createStorageVirtualMachine(callback: js.Function2[/* err */ AWSError, /* data */ CreateStorageVirtualMachineResponse, Unit]): Request[CreateStorageVirtualMachineResponse, AWSError] = js.native
  /**
    * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
    */
  def createStorageVirtualMachine(params: CreateStorageVirtualMachineRequest): Request[CreateStorageVirtualMachineResponse, AWSError] = js.native
  def createStorageVirtualMachine(
    params: CreateStorageVirtualMachineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStorageVirtualMachineResponse, Unit]
  ): Request[CreateStorageVirtualMachineResponse, AWSError] = js.native
  
  /**
    * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
    */
  def createVolume(): Request[CreateVolumeResponse, AWSError] = js.native
  def createVolume(callback: js.Function2[/* err */ AWSError, /* data */ CreateVolumeResponse, Unit]): Request[CreateVolumeResponse, AWSError] = js.native
  /**
    * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
    */
  def createVolume(params: CreateVolumeRequest): Request[CreateVolumeResponse, AWSError] = js.native
  def createVolume(
    params: CreateVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVolumeResponse, Unit]
  ): Request[CreateVolumeResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
    */
  def createVolumeFromBackup(): Request[CreateVolumeFromBackupResponse, AWSError] = js.native
  def createVolumeFromBackup(callback: js.Function2[/* err */ AWSError, /* data */ CreateVolumeFromBackupResponse, Unit]): Request[CreateVolumeFromBackupResponse, AWSError] = js.native
  /**
    * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
    */
  def createVolumeFromBackup(params: CreateVolumeFromBackupRequest): Request[CreateVolumeFromBackupResponse, AWSError] = js.native
  def createVolumeFromBackup(
    params: CreateVolumeFromBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVolumeFromBackupResponse, Unit]
  ): Request[CreateVolumeFromBackupResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon FSx backup. After deletion, the backup no longer exists, and its data is gone. The DeleteBackup call returns instantly. The backup won't show up in later DescribeBackups calls.  The data in a deleted backup is also deleted and can't be recovered by any means. 
    */
  def deleteBackup(): Request[DeleteBackupResponse, AWSError] = js.native
  def deleteBackup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupResponse, Unit]): Request[DeleteBackupResponse, AWSError] = js.native
  /**
    * Deletes an Amazon FSx backup. After deletion, the backup no longer exists, and its data is gone. The DeleteBackup call returns instantly. The backup won't show up in later DescribeBackups calls.  The data in a deleted backup is also deleted and can't be recovered by any means. 
    */
  def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse, AWSError] = js.native
  def deleteBackup(
    params: DeleteBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupResponse, Unit]
  ): Request[DeleteBackupResponse, AWSError] = js.native
  
  /**
    * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you have the option of deleting the data in the file system that corresponds to the data repository association. Data repository associations are supported only for file systems with the Persistent_2 deployment type.
    */
  def deleteDataRepositoryAssociation(): Request[DeleteDataRepositoryAssociationResponse, AWSError] = js.native
  def deleteDataRepositoryAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataRepositoryAssociationResponse, Unit]
  ): Request[DeleteDataRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you have the option of deleting the data in the file system that corresponds to the data repository association. Data repository associations are supported only for file systems with the Persistent_2 deployment type.
    */
  def deleteDataRepositoryAssociation(params: DeleteDataRepositoryAssociationRequest): Request[DeleteDataRepositoryAssociationResponse, AWSError] = js.native
  def deleteDataRepositoryAssociation(
    params: DeleteDataRepositoryAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataRepositoryAssociationResponse, Unit]
  ): Request[DeleteDataRepositoryAssociationResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon File Cache resource. After deletion, the cache no longer exists, and its data is gone. The DeleteFileCache operation returns while the cache has the DELETING status. You can check the cache deletion status by calling the DescribeFileCaches operation, which returns a list of caches in your account. If you pass the cache ID for a deleted cache, the DescribeFileCaches operation returns a FileCacheNotFound error.  The data in a deleted cache is also deleted and can't be recovered by any means. 
    */
  def deleteFileCache(): Request[DeleteFileCacheResponse, AWSError] = js.native
  def deleteFileCache(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileCacheResponse, Unit]): Request[DeleteFileCacheResponse, AWSError] = js.native
  /**
    * Deletes an Amazon File Cache resource. After deletion, the cache no longer exists, and its data is gone. The DeleteFileCache operation returns while the cache has the DELETING status. You can check the cache deletion status by calling the DescribeFileCaches operation, which returns a list of caches in your account. If you pass the cache ID for a deleted cache, the DescribeFileCaches operation returns a FileCacheNotFound error.  The data in a deleted cache is also deleted and can't be recovered by any means. 
    */
  def deleteFileCache(params: DeleteFileCacheRequest): Request[DeleteFileCacheResponse, AWSError] = js.native
  def deleteFileCache(
    params: DeleteFileCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileCacheResponse, Unit]
  ): Request[DeleteFileCacheResponse, AWSError] = js.native
  
  /**
    * Deletes a file system. After deletion, the file system no longer exists, and its data is gone. Any existing automatic backups and snapshots are also deleted. To delete an Amazon FSx for NetApp ONTAP file system, first delete all the volumes and storage virtual machines (SVMs) on the file system. Then provide a FileSystemId value to the DeleFileSystem operation. By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon deletion. This final backup isn't subject to the file system's retention policy, and must be manually deleted. The DeleteFileSystem operation returns while the file system has the DELETING status. You can check the file system deletion status by calling the DescribeFileSystems operation, which returns a list of file systems in your account. If you pass the file system ID for a deleted file system, the DescribeFileSystems operation returns a FileSystemNotFound error.  If a data repository task is in a PENDING or EXECUTING state, deleting an Amazon FSx for Lustre file system will fail with an HTTP status code 400 (Bad Request).   The data in a deleted file system is also deleted and can't be recovered by any means. 
    */
  def deleteFileSystem(): Request[DeleteFileSystemResponse, AWSError] = js.native
  def deleteFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileSystemResponse, Unit]): Request[DeleteFileSystemResponse, AWSError] = js.native
  /**
    * Deletes a file system. After deletion, the file system no longer exists, and its data is gone. Any existing automatic backups and snapshots are also deleted. To delete an Amazon FSx for NetApp ONTAP file system, first delete all the volumes and storage virtual machines (SVMs) on the file system. Then provide a FileSystemId value to the DeleFileSystem operation. By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon deletion. This final backup isn't subject to the file system's retention policy, and must be manually deleted. The DeleteFileSystem operation returns while the file system has the DELETING status. You can check the file system deletion status by calling the DescribeFileSystems operation, which returns a list of file systems in your account. If you pass the file system ID for a deleted file system, the DescribeFileSystems operation returns a FileSystemNotFound error.  If a data repository task is in a PENDING or EXECUTING state, deleting an Amazon FSx for Lustre file system will fail with an HTTP status code 400 (Bad Request).   The data in a deleted file system is also deleted and can't be recovered by any means. 
    */
  def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse, AWSError] = js.native
  def deleteFileSystem(
    params: DeleteFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileSystemResponse, Unit]
  ): Request[DeleteFileSystemResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon FSx for OpenZFS snapshot. After deletion, the snapshot no longer exists, and its data is gone. Deleting a snapshot doesn't affect snapshots stored in a file system backup.  The DeleteSnapshot operation returns instantly. The snapshot appears with the lifecycle status of DELETING until the deletion is complete.
    */
  def deleteSnapshot(): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]): Request[DeleteSnapshotResponse, AWSError] = js.native
  /**
    * Deletes an Amazon FSx for OpenZFS snapshot. After deletion, the snapshot no longer exists, and its data is gone. Deleting a snapshot doesn't affect snapshots stored in a file system backup.  The DeleteSnapshot operation returns instantly. The snapshot appears with the lifecycle status of DELETING until the deletion is complete.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]
  ): Request[DeleteSnapshotResponse, AWSError] = js.native
  
  /**
    * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete all non-root volumes in the SVM, otherwise the operation will fail.
    */
  def deleteStorageVirtualMachine(): Request[DeleteStorageVirtualMachineResponse, AWSError] = js.native
  def deleteStorageVirtualMachine(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageVirtualMachineResponse, Unit]): Request[DeleteStorageVirtualMachineResponse, AWSError] = js.native
  /**
    * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete all non-root volumes in the SVM, otherwise the operation will fail.
    */
  def deleteStorageVirtualMachine(params: DeleteStorageVirtualMachineRequest): Request[DeleteStorageVirtualMachineResponse, AWSError] = js.native
  def deleteStorageVirtualMachine(
    params: DeleteStorageVirtualMachineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageVirtualMachineResponse, Unit]
  ): Request[DeleteStorageVirtualMachineResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
    */
  def deleteVolume(): Request[DeleteVolumeResponse, AWSError] = js.native
  def deleteVolume(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVolumeResponse, Unit]): Request[DeleteVolumeResponse, AWSError] = js.native
  /**
    * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
    */
  def deleteVolume(params: DeleteVolumeRequest): Request[DeleteVolumeResponse, AWSError] = js.native
  def deleteVolume(
    params: DeleteVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVolumeResponse, Unit]
  ): Request[DeleteVolumeResponse, AWSError] = js.native
  
  /**
    * Returns the description of a specific Amazon FSx backup, if a BackupIds value is provided for that backup. Otherwise, it returns all backups owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all backups, you can optionally specify the MaxResults parameter to limit the number of backups in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of the NextToken value from the last response. This operation is used in an iterative process to retrieve a list of your backups. DescribeBackups is called first without a NextToken value. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken value. When using this operation, keep the following in mind:   The operation might return fewer than the MaxResults value of backup descriptions while still including a NextToken value.   The order of the backups returned in the response of one DescribeBackups call and the order of the backups returned across the responses of a multi-call iteration is unspecified.  
    */
  def describeBackups(): Request[DescribeBackupsResponse, AWSError] = js.native
  def describeBackups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupsResponse, Unit]): Request[DescribeBackupsResponse, AWSError] = js.native
  /**
    * Returns the description of a specific Amazon FSx backup, if a BackupIds value is provided for that backup. Otherwise, it returns all backups owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all backups, you can optionally specify the MaxResults parameter to limit the number of backups in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of the NextToken value from the last response. This operation is used in an iterative process to retrieve a list of your backups. DescribeBackups is called first without a NextToken value. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken value. When using this operation, keep the following in mind:   The operation might return fewer than the MaxResults value of backup descriptions while still including a NextToken value.   The order of the backups returned in the response of one DescribeBackups call and the order of the backups returned across the responses of a multi-call iteration is unspecified.  
    */
  def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse, AWSError] = js.native
  def describeBackups(
    params: DescribeBackupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupsResponse, Unit]
  ): Request[DescribeBackupsResponse, AWSError] = js.native
  
  /**
    * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository associations, if one or more AssociationIds values are provided in the request, or if filters are used in the request. Data repository associations are supported only for Amazon FSx for Lustre file systems with the Persistent_2 deployment type and for Amazon File Cache resources. You can use filters to narrow the response to include just data repository associations for specific file systems (use the file-system-id filter with the ID of the file system) or caches (use the file-cache-id filter with the ID of the cache), or data repository associations for a specific repository type (use the data-repository-type filter with a value of S3 or NFS). If you don't use filters, the response returns all data repository associations owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all data repository associations, you can paginate the response by using the optional MaxResults parameter to limit the number of data repository associations returned in a response. If more data repository associations remain, a NextToken value is returned in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.
    */
  def describeDataRepositoryAssociations(): Request[DescribeDataRepositoryAssociationsResponse, AWSError] = js.native
  def describeDataRepositoryAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataRepositoryAssociationsResponse, Unit]
  ): Request[DescribeDataRepositoryAssociationsResponse, AWSError] = js.native
  /**
    * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository associations, if one or more AssociationIds values are provided in the request, or if filters are used in the request. Data repository associations are supported only for Amazon FSx for Lustre file systems with the Persistent_2 deployment type and for Amazon File Cache resources. You can use filters to narrow the response to include just data repository associations for specific file systems (use the file-system-id filter with the ID of the file system) or caches (use the file-cache-id filter with the ID of the cache), or data repository associations for a specific repository type (use the data-repository-type filter with a value of S3 or NFS). If you don't use filters, the response returns all data repository associations owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all data repository associations, you can paginate the response by using the optional MaxResults parameter to limit the number of data repository associations returned in a response. If more data repository associations remain, a NextToken value is returned in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.
    */
  def describeDataRepositoryAssociations(params: DescribeDataRepositoryAssociationsRequest): Request[DescribeDataRepositoryAssociationsResponse, AWSError] = js.native
  def describeDataRepositoryAssociations(
    params: DescribeDataRepositoryAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataRepositoryAssociationsResponse, Unit]
  ): Request[DescribeDataRepositoryAssociationsResponse, AWSError] = js.native
  
  /**
    * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository tasks, if one or more TaskIds values are provided in the request, or if filters are used in the request. You can use filters to narrow the response to include just tasks for specific file systems or caches, or tasks in a specific lifecycle state. Otherwise, it returns all data repository tasks owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all tasks, you can paginate the response by using the optional MaxResults parameter to limit the number of tasks returned in a response. If more tasks remain, a NextToken value is returned in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.
    */
  def describeDataRepositoryTasks(): Request[DescribeDataRepositoryTasksResponse, AWSError] = js.native
  def describeDataRepositoryTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataRepositoryTasksResponse, Unit]): Request[DescribeDataRepositoryTasksResponse, AWSError] = js.native
  /**
    * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository tasks, if one or more TaskIds values are provided in the request, or if filters are used in the request. You can use filters to narrow the response to include just tasks for specific file systems or caches, or tasks in a specific lifecycle state. Otherwise, it returns all data repository tasks owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all tasks, you can paginate the response by using the optional MaxResults parameter to limit the number of tasks returned in a response. If more tasks remain, a NextToken value is returned in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.
    */
  def describeDataRepositoryTasks(params: DescribeDataRepositoryTasksRequest): Request[DescribeDataRepositoryTasksResponse, AWSError] = js.native
  def describeDataRepositoryTasks(
    params: DescribeDataRepositoryTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataRepositoryTasksResponse, Unit]
  ): Request[DescribeDataRepositoryTasksResponse, AWSError] = js.native
  
  /**
    * Returns the description of a specific Amazon File Cache resource, if a FileCacheIds value is provided for that cache. Otherwise, it returns descriptions of all caches owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all cache descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more cache descriptions remain, the operation returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This operation is used in an iterative process to retrieve a list of your cache descriptions. DescribeFileCaches is called first without a NextTokenvalue. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this operation, keep the following in mind:   The implementation might return fewer than MaxResults cache descriptions while still including a NextToken value.   The order of caches returned in the response of one DescribeFileCaches call and the order of caches returned across the responses of a multicall iteration is unspecified.  
    */
  def describeFileCaches(): Request[DescribeFileCachesResponse, AWSError] = js.native
  def describeFileCaches(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileCachesResponse, Unit]): Request[DescribeFileCachesResponse, AWSError] = js.native
  /**
    * Returns the description of a specific Amazon File Cache resource, if a FileCacheIds value is provided for that cache. Otherwise, it returns descriptions of all caches owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all cache descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more cache descriptions remain, the operation returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This operation is used in an iterative process to retrieve a list of your cache descriptions. DescribeFileCaches is called first without a NextTokenvalue. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this operation, keep the following in mind:   The implementation might return fewer than MaxResults cache descriptions while still including a NextToken value.   The order of caches returned in the response of one DescribeFileCaches call and the order of caches returned across the responses of a multicall iteration is unspecified.  
    */
  def describeFileCaches(params: DescribeFileCachesRequest): Request[DescribeFileCachesResponse, AWSError] = js.native
  def describeFileCaches(
    params: DescribeFileCachesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileCachesResponse, Unit]
  ): Request[DescribeFileCachesResponse, AWSError] = js.native
  
  /**
    * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A history of all DNS aliases that have been associated with and disassociated from the file system is available in the list of AdministrativeAction provided in the DescribeFileSystems operation response.
    */
  def describeFileSystemAliases(): Request[DescribeFileSystemAliasesResponse, AWSError] = js.native
  def describeFileSystemAliases(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemAliasesResponse, Unit]): Request[DescribeFileSystemAliasesResponse, AWSError] = js.native
  /**
    * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A history of all DNS aliases that have been associated with and disassociated from the file system is available in the list of AdministrativeAction provided in the DescribeFileSystems operation response.
    */
  def describeFileSystemAliases(params: DescribeFileSystemAliasesRequest): Request[DescribeFileSystemAliasesResponse, AWSError] = js.native
  def describeFileSystemAliases(
    params: DescribeFileSystemAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemAliasesResponse, Unit]
  ): Request[DescribeFileSystemAliasesResponse, AWSError] = js.native
  
  /**
    * Returns the description of specific Amazon FSx file systems, if a FileSystemIds value is provided for that file system. Otherwise, it returns descriptions of all file systems owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This operation is used in an iterative process to retrieve a list of your file system descriptions. DescribeFileSystems is called first without a NextTokenvalue. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this operation, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multicall iteration is unspecified.  
    */
  def describeFileSystems(): Request[DescribeFileSystemsResponse, AWSError] = js.native
  def describeFileSystems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemsResponse, Unit]): Request[DescribeFileSystemsResponse, AWSError] = js.native
  /**
    * Returns the description of specific Amazon FSx file systems, if a FileSystemIds value is provided for that file system. Otherwise, it returns descriptions of all file systems owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This operation is used in an iterative process to retrieve a list of your file system descriptions. DescribeFileSystems is called first without a NextTokenvalue. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this operation, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multicall iteration is unspecified.  
    */
  def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse, AWSError] = js.native
  def describeFileSystems(
    params: DescribeFileSystemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemsResponse, Unit]
  ): Request[DescribeFileSystemsResponse, AWSError] = js.native
  
  /**
    * Returns the description of specific Amazon FSx for OpenZFS snapshots, if a SnapshotIds value is provided. Otherwise, this operation returns all snapshots owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all snapshots, you can optionally specify the MaxResults parameter to limit the number of snapshots in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.  Use this operation in an iterative process to retrieve a list of your snapshots. DescribeSnapshots is called first without a NextToken value. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken value. When using this operation, keep the following in mind:   The operation might return fewer than the MaxResults value of snapshot descriptions while still including a NextToken value.   The order of snapshots returned in the response of one DescribeSnapshots call and the order of backups returned across the responses of a multi-call iteration is unspecified.   
    */
  def describeSnapshots(): Request[DescribeSnapshotsResponse, AWSError] = js.native
  def describeSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResponse, Unit]): Request[DescribeSnapshotsResponse, AWSError] = js.native
  /**
    * Returns the description of specific Amazon FSx for OpenZFS snapshots, if a SnapshotIds value is provided. Otherwise, this operation returns all snapshots owned by your Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling. When retrieving all snapshots, you can optionally specify the MaxResults parameter to limit the number of snapshots in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response.  Use this operation in an iterative process to retrieve a list of your snapshots. DescribeSnapshots is called first without a NextToken value. Then the operation continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken value. When using this operation, keep the following in mind:   The operation might return fewer than the MaxResults value of snapshot descriptions while still including a NextToken value.   The order of snapshots returned in the response of one DescribeSnapshots call and the order of backups returned across the responses of a multi-call iteration is unspecified.   
    */
  def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResponse, AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResponse, Unit]
  ): Request[DescribeSnapshotsResponse, AWSError] = js.native
  
  /**
    * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
    */
  def describeStorageVirtualMachines(): Request[DescribeStorageVirtualMachinesResponse, AWSError] = js.native
  def describeStorageVirtualMachines(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageVirtualMachinesResponse, Unit]
  ): Request[DescribeStorageVirtualMachinesResponse, AWSError] = js.native
  /**
    * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
    */
  def describeStorageVirtualMachines(params: DescribeStorageVirtualMachinesRequest): Request[DescribeStorageVirtualMachinesResponse, AWSError] = js.native
  def describeStorageVirtualMachines(
    params: DescribeStorageVirtualMachinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageVirtualMachinesResponse, Unit]
  ): Request[DescribeStorageVirtualMachinesResponse, AWSError] = js.native
  
  /**
    * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
    */
  def describeVolumes(): Request[DescribeVolumesResponse, AWSError] = js.native
  def describeVolumes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResponse, Unit]): Request[DescribeVolumesResponse, AWSError] = js.native
  /**
    * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
    */
  def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResponse, AWSError] = js.native
  def describeVolumes(
    params: DescribeVolumesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResponse, Unit]
  ): Request[DescribeVolumesResponse, AWSError] = js.native
  
  /**
    * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file system, Amazon FSx responds with a 400 Bad Request. For more information, see Working with DNS Aliases. The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file system.
    */
  def disassociateFileSystemAliases(): Request[DisassociateFileSystemAliasesResponse, AWSError] = js.native
  def disassociateFileSystemAliases(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFileSystemAliasesResponse, Unit]): Request[DisassociateFileSystemAliasesResponse, AWSError] = js.native
  /**
    * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file system, Amazon FSx responds with a 400 Bad Request. For more information, see Working with DNS Aliases. The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file system.
    */
  def disassociateFileSystemAliases(params: DisassociateFileSystemAliasesRequest): Request[DisassociateFileSystemAliasesResponse, AWSError] = js.native
  def disassociateFileSystemAliases(
    params: DisassociateFileSystemAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFileSystemAliasesResponse, Unit]
  ): Request[DisassociateFileSystemAliasesResponse, AWSError] = js.native
  
  /**
    * Lists tags for Amazon FSx resources. When retrieving all tags, you can optionally specify the MaxResults parameter to limit the number of tags in a response. If more tags remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your tags. ListTagsForResource is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of tags returned in the response of one ListTagsForResource call and the order of tags returned across the responses of a multi-call iteration is unspecified.  
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists tags for Amazon FSx resources. When retrieving all tags, you can optionally specify the MaxResults parameter to limit the number of tags in a response. If more tags remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your tags. ListTagsForResource is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of tags returned in the response of one ListTagsForResource call and the order of tags returned across the responses of a multi-call iteration is unspecified.  
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Releases the file system lock from an Amazon FSx for OpenZFS file system.
    */
  def releaseFileSystemNfsV3Locks(): Request[ReleaseFileSystemNfsV3LocksResponse, AWSError] = js.native
  def releaseFileSystemNfsV3Locks(callback: js.Function2[/* err */ AWSError, /* data */ ReleaseFileSystemNfsV3LocksResponse, Unit]): Request[ReleaseFileSystemNfsV3LocksResponse, AWSError] = js.native
  /**
    * Releases the file system lock from an Amazon FSx for OpenZFS file system.
    */
  def releaseFileSystemNfsV3Locks(params: ReleaseFileSystemNfsV3LocksRequest): Request[ReleaseFileSystemNfsV3LocksResponse, AWSError] = js.native
  def releaseFileSystemNfsV3Locks(
    params: ReleaseFileSystemNfsV3LocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReleaseFileSystemNfsV3LocksResponse, Unit]
  ): Request[ReleaseFileSystemNfsV3LocksResponse, AWSError] = js.native
  
  /**
    * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot. 
    */
  def restoreVolumeFromSnapshot(): Request[RestoreVolumeFromSnapshotResponse, AWSError] = js.native
  def restoreVolumeFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreVolumeFromSnapshotResponse, Unit]): Request[RestoreVolumeFromSnapshotResponse, AWSError] = js.native
  /**
    * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot. 
    */
  def restoreVolumeFromSnapshot(params: RestoreVolumeFromSnapshotRequest): Request[RestoreVolumeFromSnapshotResponse, AWSError] = js.native
  def restoreVolumeFromSnapshot(
    params: RestoreVolumeFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreVolumeFromSnapshotResponse, Unit]
  ): Request[RestoreVolumeFromSnapshotResponse, AWSError] = js.native
  
  /**
    * Tags an Amazon FSx resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags an Amazon FSx resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * This action removes a tag from an Amazon FSx resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * This action removes a tag from an Amazon FSx resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system. Data repository associations are supported only for file systems with the Persistent_2 deployment type.
    */
  def updateDataRepositoryAssociation(): Request[UpdateDataRepositoryAssociationResponse, AWSError] = js.native
  def updateDataRepositoryAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataRepositoryAssociationResponse, Unit]
  ): Request[UpdateDataRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system. Data repository associations are supported only for file systems with the Persistent_2 deployment type.
    */
  def updateDataRepositoryAssociation(params: UpdateDataRepositoryAssociationRequest): Request[UpdateDataRepositoryAssociationResponse, AWSError] = js.native
  def updateDataRepositoryAssociation(
    params: UpdateDataRepositoryAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataRepositoryAssociationResponse, Unit]
  ): Request[UpdateDataRepositoryAssociationResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a single request.
    */
  def updateFileCache(): Request[UpdateFileCacheResponse, AWSError] = js.native
  def updateFileCache(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFileCacheResponse, Unit]): Request[UpdateFileCacheResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a single request.
    */
  def updateFileCache(params: UpdateFileCacheRequest): Request[UpdateFileCacheResponse, AWSError] = js.native
  def updateFileCache(
    params: UpdateFileCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFileCacheResponse, Unit]
  ): Request[UpdateFileCacheResponse, AWSError] = js.native
  
  /**
    * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple properties in a single request. For Amazon FSx for Windows File Server file systems, you can update the following properties:    AuditLogConfiguration     AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     SelfManagedActiveDirectoryConfiguration     StorageCapacity     ThroughputCapacity     WeeklyMaintenanceStartTime    For Amazon FSx for Lustre file systems, you can update the following properties:    AutoImportPolicy     AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     DataCompressionType     LustreRootSquashConfiguration     StorageCapacity     WeeklyMaintenanceStartTime    For Amazon FSx for NetApp ONTAP file systems, you can update the following properties:    AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     DiskIopsConfiguration     FsxAdminPassword     StorageCapacity     ThroughputCapacity     WeeklyMaintenanceStartTime    For the Amazon FSx for OpenZFS file systems, you can update the following properties:    AutomaticBackupRetentionDays     CopyTagsToBackups     CopyTagsToVolumes     DailyAutomaticBackupStartTime     ThroughputCapacity     WeeklyMaintenanceStartTime   
    */
  def updateFileSystem(): Request[UpdateFileSystemResponse, AWSError] = js.native
  def updateFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFileSystemResponse, Unit]): Request[UpdateFileSystemResponse, AWSError] = js.native
  /**
    * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple properties in a single request. For Amazon FSx for Windows File Server file systems, you can update the following properties:    AuditLogConfiguration     AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     SelfManagedActiveDirectoryConfiguration     StorageCapacity     ThroughputCapacity     WeeklyMaintenanceStartTime    For Amazon FSx for Lustre file systems, you can update the following properties:    AutoImportPolicy     AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     DataCompressionType     LustreRootSquashConfiguration     StorageCapacity     WeeklyMaintenanceStartTime    For Amazon FSx for NetApp ONTAP file systems, you can update the following properties:    AutomaticBackupRetentionDays     DailyAutomaticBackupStartTime     DiskIopsConfiguration     FsxAdminPassword     StorageCapacity     ThroughputCapacity     WeeklyMaintenanceStartTime    For the Amazon FSx for OpenZFS file systems, you can update the following properties:    AutomaticBackupRetentionDays     CopyTagsToBackups     CopyTagsToVolumes     DailyAutomaticBackupStartTime     ThroughputCapacity     WeeklyMaintenanceStartTime   
    */
  def updateFileSystem(params: UpdateFileSystemRequest): Request[UpdateFileSystemResponse, AWSError] = js.native
  def updateFileSystem(
    params: UpdateFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFileSystemResponse, Unit]
  ): Request[UpdateFileSystemResponse, AWSError] = js.native
  
  /**
    * Updates the name of an Amazon FSx for OpenZFS snapshot.
    */
  def updateSnapshot(): Request[UpdateSnapshotResponse, AWSError] = js.native
  def updateSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResponse, Unit]): Request[UpdateSnapshotResponse, AWSError] = js.native
  /**
    * Updates the name of an Amazon FSx for OpenZFS snapshot.
    */
  def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResponse, AWSError] = js.native
  def updateSnapshot(
    params: UpdateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResponse, Unit]
  ): Request[UpdateSnapshotResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
    */
  def updateStorageVirtualMachine(): Request[UpdateStorageVirtualMachineResponse, AWSError] = js.native
  def updateStorageVirtualMachine(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStorageVirtualMachineResponse, Unit]): Request[UpdateStorageVirtualMachineResponse, AWSError] = js.native
  /**
    * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
    */
  def updateStorageVirtualMachine(params: UpdateStorageVirtualMachineRequest): Request[UpdateStorageVirtualMachineResponse, AWSError] = js.native
  def updateStorageVirtualMachine(
    params: UpdateStorageVirtualMachineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStorageVirtualMachineResponse, Unit]
  ): Request[UpdateStorageVirtualMachineResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
    */
  def updateVolume(): Request[UpdateVolumeResponse, AWSError] = js.native
  def updateVolume(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVolumeResponse, Unit]): Request[UpdateVolumeResponse, AWSError] = js.native
  /**
    * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
    */
  def updateVolume(params: UpdateVolumeRequest): Request[UpdateVolumeResponse, AWSError] = js.native
  def updateVolume(
    params: UpdateVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVolumeResponse, Unit]
  ): Request[UpdateVolumeResponse, AWSError] = js.native
}
