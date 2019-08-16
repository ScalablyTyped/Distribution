package typings.awsDashSdk.clientsStoragegatewayMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageGateway extends Service {
  @JSName("config")
  var config_StorageGateway: ConfigBase with ClientConfiguration = js.native
  /**
    * Activates the gateway you previously deployed on your host. In the activation process, you specify information such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account; for more information, see UpdateGatewayInformation.  You must turn on the gateway VM before you can activate your gateway. 
    */
  def activateGateway(): Request[ActivateGatewayOutput, AWSError] = js.native
  def activateGateway(callback: js.Function2[/* err */ AWSError, /* data */ ActivateGatewayOutput, Unit]): Request[ActivateGatewayOutput, AWSError] = js.native
  /**
    * Activates the gateway you previously deployed on your host. In the activation process, you specify information such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account; for more information, see UpdateGatewayInformation.  You must turn on the gateway VM before you can activate your gateway. 
    */
  def activateGateway(params: ActivateGatewayInput): Request[ActivateGatewayOutput, AWSError] = js.native
  def activateGateway(
    params: ActivateGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateGatewayOutput, Unit]
  ): Request[ActivateGatewayOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached volume, tape and file gateway type (see Storage Gateway Concepts). In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or more disk IDs that you want to configure as cache.
    */
  def addCache(): Request[AddCacheOutput, AWSError] = js.native
  def addCache(callback: js.Function2[/* err */ AWSError, /* data */ AddCacheOutput, Unit]): Request[AddCacheOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached volume, tape and file gateway type (see Storage Gateway Concepts). In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or more disk IDs that you want to configure as cache.
    */
  def addCache(params: AddCacheInput): Request[AddCacheOutput, AWSError] = js.native
  def addCache(params: AddCacheInput, callback: js.Function2[/* err */ AWSError, /* data */ AddCacheOutput, Unit]): Request[AddCacheOutput, AWSError] = js.native
  /**
    * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team. Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway resources:   Storage gateways of all types   Storage volumes   Virtual tapes   NFS and SMB file shares   You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a new gateway maintain their tags.
    */
  def addTagsToResource(): Request[AddTagsToResourceOutput, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceOutput, Unit]): Request[AddTagsToResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team. Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway resources:   Storage gateways of all types   Storage volumes   Virtual tapes   NFS and SMB file shares   You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a new gateway maintain their tags.
    */
  def addTagsToResource(params: AddTagsToResourceInput): Request[AddTagsToResourceOutput, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceOutput, Unit]
  ): Request[AddTagsToResourceOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported for the stored volume, cached volume and tape gateway types. In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and one or more disk IDs that you want to configure as upload buffer.
    */
  def addUploadBuffer(): Request[AddUploadBufferOutput, AWSError] = js.native
  def addUploadBuffer(callback: js.Function2[/* err */ AWSError, /* data */ AddUploadBufferOutput, Unit]): Request[AddUploadBufferOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported for the stored volume, cached volume and tape gateway types. In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and one or more disk IDs that you want to configure as upload buffer.
    */
  def addUploadBuffer(params: AddUploadBufferInput): Request[AddUploadBufferOutput, AWSError] = js.native
  def addUploadBuffer(
    params: AddUploadBufferInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddUploadBufferOutput, Unit]
  ): Request[AddUploadBufferOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use AddUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to add upload buffer to a stored volume gateway.  In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and one or more disk IDs that you want to configure as working storage.
    */
  def addWorkingStorage(): Request[AddWorkingStorageOutput, AWSError] = js.native
  def addWorkingStorage(callback: js.Function2[/* err */ AWSError, /* data */ AddWorkingStorageOutput, Unit]): Request[AddWorkingStorageOutput, AWSError] = js.native
  /**
    * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use AddUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to add upload buffer to a stored volume gateway.  In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and one or more disk IDs that you want to configure as working storage.
    */
  def addWorkingStorage(params: AddWorkingStorageInput): Request[AddWorkingStorageOutput, AWSError] = js.native
  def addWorkingStorage(
    params: AddWorkingStorageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddWorkingStorageOutput, Unit]
  ): Request[AddWorkingStorageOutput, AWSError] = js.native
  /**
    * Assigns a tape to a tape pool for archiving. The tape assigned to a pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the S3 storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  def assignTapePool(): Request[AssignTapePoolOutput, AWSError] = js.native
  def assignTapePool(callback: js.Function2[/* err */ AWSError, /* data */ AssignTapePoolOutput, Unit]): Request[AssignTapePoolOutput, AWSError] = js.native
  /**
    * Assigns a tape to a tape pool for archiving. The tape assigned to a pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the S3 storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  def assignTapePool(params: AssignTapePoolInput): Request[AssignTapePoolOutput, AWSError] = js.native
  def assignTapePool(
    params: AssignTapePoolInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssignTapePoolOutput, Unit]
  ): Request[AssignTapePoolOutput, AWSError] = js.native
  /**
    * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
    */
  def attachVolume(): Request[AttachVolumeOutput, AWSError] = js.native
  def attachVolume(callback: js.Function2[/* err */ AWSError, /* data */ AttachVolumeOutput, Unit]): Request[AttachVolumeOutput, AWSError] = js.native
  /**
    * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
    */
  def attachVolume(params: AttachVolumeInput): Request[AttachVolumeOutput, AWSError] = js.native
  def attachVolume(
    params: AttachVolumeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachVolumeOutput, Unit]
  ): Request[AttachVolumeOutput, AWSError] = js.native
  /**
    * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated. This operation is only supported in the tape gateway type.
    */
  def cancelArchival(): Request[CancelArchivalOutput, AWSError] = js.native
  def cancelArchival(callback: js.Function2[/* err */ AWSError, /* data */ CancelArchivalOutput, Unit]): Request[CancelArchivalOutput, AWSError] = js.native
  /**
    * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated. This operation is only supported in the tape gateway type.
    */
  def cancelArchival(params: CancelArchivalInput): Request[CancelArchivalOutput, AWSError] = js.native
  def cancelArchival(
    params: CancelArchivalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelArchivalOutput, Unit]
  ): Request[CancelArchivalOutput, AWSError] = js.native
  /**
    * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
    */
  def cancelRetrieval(): Request[CancelRetrievalOutput, AWSError] = js.native
  def cancelRetrieval(callback: js.Function2[/* err */ AWSError, /* data */ CancelRetrievalOutput, Unit]): Request[CancelRetrievalOutput, AWSError] = js.native
  /**
    * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
    */
  def cancelRetrieval(params: CancelRetrievalInput): Request[CancelRetrievalOutput, AWSError] = js.native
  def cancelRetrieval(
    params: CancelRetrievalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelRetrievalOutput, Unit]
  ): Request[CancelRetrievalOutput, AWSError] = js.native
  /**
    * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached volume gateway type.  Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache operation to add cache storage to a gateway.   In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target. Optionally, you can provide the ARN for an existing volume as the SourceVolumeARN for this cached volume, which creates an exact copy of the existing volume’s latest recovery point. The VolumeSizeInBytes value must be equal to or larger than the size of the copied volume, in bytes.
    */
  def createCachediSCSIVolume(): Request[CreateCachediSCSIVolumeOutput, AWSError] = js.native
  def createCachediSCSIVolume(callback: js.Function2[/* err */ AWSError, /* data */ CreateCachediSCSIVolumeOutput, Unit]): Request[CreateCachediSCSIVolumeOutput, AWSError] = js.native
  /**
    * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached volume gateway type.  Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache operation to add cache storage to a gateway.   In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target. Optionally, you can provide the ARN for an existing volume as the SourceVolumeARN for this cached volume, which creates an exact copy of the existing volume’s latest recovery point. The VolumeSizeInBytes value must be equal to or larger than the size of the copied volume, in bytes.
    */
  def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput): Request[CreateCachediSCSIVolumeOutput, AWSError] = js.native
  def createCachediSCSIVolume(
    params: CreateCachediSCSIVolumeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCachediSCSIVolumeOutput, Unit]
  ): Request[CreateCachediSCSIVolumeOutput, AWSError] = js.native
  /**
    * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS interface. This operation is only supported for file gateways.  File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share. Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateway does not support creating hard or symbolic links on a file share. 
    */
  def createNFSFileShare(): Request[CreateNFSFileShareOutput, AWSError] = js.native
  def createNFSFileShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateNFSFileShareOutput, Unit]): Request[CreateNFSFileShareOutput, AWSError] = js.native
  /**
    * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS interface. This operation is only supported for file gateways.  File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share. Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateway does not support creating hard or symbolic links on a file share. 
    */
  def createNFSFileShare(params: CreateNFSFileShareInput): Request[CreateNFSFileShareOutput, AWSError] = js.native
  def createNFSFileShare(
    params: CreateNFSFileShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNFSFileShareOutput, Unit]
  ): Request[CreateNFSFileShareOutput, AWSError] = js.native
  /**
    * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB interface. This operation is only supported for file gateways.  File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
    */
  def createSMBFileShare(): Request[CreateSMBFileShareOutput, AWSError] = js.native
  def createSMBFileShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateSMBFileShareOutput, Unit]): Request[CreateSMBFileShareOutput, AWSError] = js.native
  /**
    * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB interface. This operation is only supported for file gateways.  File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
    */
  def createSMBFileShare(params: CreateSMBFileShareInput): Request[CreateSMBFileShareOutput, AWSError] = js.native
  def createSMBFileShare(
    params: CreateSMBFileShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSMBFileShareOutput, Unit]
  ): Request[CreateSMBFileShareOutput, AWSError] = js.native
  /**
    * Initiates a snapshot of a volume. AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis. This API enables you to take ad-hoc snapshot. For more information, see Editing a Snapshot Schedule. In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or DeleteSnapshot in the EC2 API reference.   Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note on the Welcome page. 
    */
  def createSnapshot(): Request[CreateSnapshotOutput, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotOutput, Unit]): Request[CreateSnapshotOutput, AWSError] = js.native
  /**
    * Initiates a snapshot of a volume. AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis. This API enables you to take ad-hoc snapshot. For more information, see Editing a Snapshot Schedule. In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or DeleteSnapshot in the EC2 API reference.   Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note on the Welcome page. 
    */
  def createSnapshot(params: CreateSnapshotInput): Request[CreateSnapshotOutput, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotOutput, Unit]
  ): Request[CreateSnapshotOutput, AWSError] = js.native
  /**
    * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached volume gateway type. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot. To get a list of volume recovery point for cached volume gateway, use ListVolumeRecoveryPoints. In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume by providing its Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute Cloud API Reference. 
    */
  def createSnapshotFromVolumeRecoveryPoint(): Request[CreateSnapshotFromVolumeRecoveryPointOutput, AWSError] = js.native
  def createSnapshotFromVolumeRecoveryPoint(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotFromVolumeRecoveryPointOutput, Unit]
  ): Request[CreateSnapshotFromVolumeRecoveryPointOutput, AWSError] = js.native
  /**
    * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached volume gateway type. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot. To get a list of volume recovery point for cached volume gateway, use ListVolumeRecoveryPoints. In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume by providing its Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute Cloud API Reference. 
    */
  def createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput): Request[CreateSnapshotFromVolumeRecoveryPointOutput, AWSError] = js.native
  def createSnapshotFromVolumeRecoveryPoint(
    params: CreateSnapshotFromVolumeRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotFromVolumeRecoveryPointOutput, Unit]
  ): Request[CreateSnapshotFromVolumeRecoveryPointOutput, AWSError] = js.native
  /**
    * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type. The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty gateway volume, then any existing data on the disk is erased. In the request you must specify the gateway and the disk information on which you are creating the volume. In response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
    */
  def createStorediSCSIVolume(): Request[CreateStorediSCSIVolumeOutput, AWSError] = js.native
  def createStorediSCSIVolume(callback: js.Function2[/* err */ AWSError, /* data */ CreateStorediSCSIVolumeOutput, Unit]): Request[CreateStorediSCSIVolumeOutput, AWSError] = js.native
  /**
    * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type. The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty gateway volume, then any existing data on the disk is erased. In the request you must specify the gateway and the disk information on which you are creating the volume. In response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
    */
  def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput): Request[CreateStorediSCSIVolumeOutput, AWSError] = js.native
  def createStorediSCSIVolume(
    params: CreateStorediSCSIVolumeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStorediSCSIVolumeOutput, Unit]
  ): Request[CreateStorediSCSIVolumeOutput, AWSError] = js.native
  /**
    * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on deleted tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache operation to add cache storage to a gateway. 
    */
  def createTapeWithBarcode(): Request[CreateTapeWithBarcodeOutput, AWSError] = js.native
  def createTapeWithBarcode(callback: js.Function2[/* err */ AWSError, /* data */ CreateTapeWithBarcodeOutput, Unit]): Request[CreateTapeWithBarcodeOutput, AWSError] = js.native
  /**
    * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on deleted tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache operation to add cache storage to a gateway. 
    */
  def createTapeWithBarcode(params: CreateTapeWithBarcodeInput): Request[CreateTapeWithBarcodeOutput, AWSError] = js.native
  def createTapeWithBarcode(
    params: CreateTapeWithBarcodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTapeWithBarcodeOutput, Unit]
  ): Request[CreateTapeWithBarcodeOutput, AWSError] = js.native
  /**
    * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache operation to add cache storage to a gateway.  
    */
  def createTapes(): Request[CreateTapesOutput, AWSError] = js.native
  def createTapes(callback: js.Function2[/* err */ AWSError, /* data */ CreateTapesOutput, Unit]): Request[CreateTapesOutput, AWSError] = js.native
  /**
    * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache operation to add cache storage to a gateway.  
    */
  def createTapes(params: CreateTapesInput): Request[CreateTapesOutput, AWSError] = js.native
  def createTapes(
    params: CreateTapesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTapesOutput, Unit]
  ): Request[CreateTapesOutput, AWSError] = js.native
  /**
    * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def deleteBandwidthRateLimit(): Request[DeleteBandwidthRateLimitOutput, AWSError] = js.native
  def deleteBandwidthRateLimit(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBandwidthRateLimitOutput, Unit]): Request[DeleteBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput): Request[DeleteBandwidthRateLimitOutput, AWSError] = js.native
  def deleteBandwidthRateLimit(
    params: DeleteBandwidthRateLimitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBandwidthRateLimitOutput, Unit]
  ): Request[DeleteBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator pair.
    */
  def deleteChapCredentials(): Request[DeleteChapCredentialsOutput, AWSError] = js.native
  def deleteChapCredentials(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChapCredentialsOutput, Unit]): Request[DeleteChapCredentialsOutput, AWSError] = js.native
  /**
    * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator pair.
    */
  def deleteChapCredentials(params: DeleteChapCredentialsInput): Request[DeleteChapCredentialsOutput, AWSError] = js.native
  def deleteChapCredentials(
    params: DeleteChapCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChapCredentialsOutput, Unit]
  ): Request[DeleteChapCredentialsOutput, AWSError] = js.native
  /**
    * Deletes a file share from a file gateway. This operation is only supported for file gateways.
    */
  def deleteFileShare(): Request[DeleteFileShareOutput, AWSError] = js.native
  def deleteFileShare(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileShareOutput, Unit]): Request[DeleteFileShareOutput, AWSError] = js.native
  /**
    * Deletes a file share from a file gateway. This operation is only supported for file gateways.
    */
  def deleteFileShare(params: DeleteFileShareInput): Request[DeleteFileShareOutput, AWSError] = js.native
  def deleteFileShare(
    params: DeleteFileShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileShareOutput, Unit]
  ): Request[DeleteFileShareOutput, AWSError] = js.native
  /**
    * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from your host computer. After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next step is to remove it from your environment.  You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription, you can delete your snapshots using the Amazon EC2 console. For more information, see the  AWS Storage Gateway Detail Page.  
    */
  def deleteGateway(): Request[DeleteGatewayOutput, AWSError] = js.native
  def deleteGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayOutput, Unit]): Request[DeleteGatewayOutput, AWSError] = js.native
  /**
    * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from your host computer. After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next step is to remove it from your environment.  You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription, you can delete your snapshots using the Amazon EC2 console. For more information, see the  AWS Storage Gateway Detail Page.  
    */
  def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput, AWSError] = js.native
  def deleteGateway(
    params: DeleteGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayOutput, Unit]
  ): Request[DeleteGatewayOutput, AWSError] = js.native
  /**
    * Deletes a snapshot of a volume. You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to delete a snapshot schedule for a volume. For more information, see Working with Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.  To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API Reference. 
    */
  def deleteSnapshotSchedule(): Request[DeleteSnapshotScheduleOutput, AWSError] = js.native
  def deleteSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotScheduleOutput, Unit]): Request[DeleteSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Deletes a snapshot of a volume. You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to delete a snapshot schedule for a volume. For more information, see Working with Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.  To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API Reference. 
    */
  def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput): Request[DeleteSnapshotScheduleOutput, AWSError] = js.native
  def deleteSnapshotSchedule(
    params: DeleteSnapshotScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotScheduleOutput, Unit]
  ): Request[DeleteSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
    */
  def deleteTape(): Request[DeleteTapeOutput, AWSError] = js.native
  def deleteTape(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTapeOutput, Unit]): Request[DeleteTapeOutput, AWSError] = js.native
  /**
    * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
    */
  def deleteTape(params: DeleteTapeInput): Request[DeleteTapeOutput, AWSError] = js.native
  def deleteTape(
    params: DeleteTapeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTapeOutput, Unit]
  ): Request[DeleteTapeOutput, AWSError] = js.native
  /**
    * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the tape gateway type.
    */
  def deleteTapeArchive(): Request[DeleteTapeArchiveOutput, AWSError] = js.native
  def deleteTapeArchive(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTapeArchiveOutput, Unit]): Request[DeleteTapeArchiveOutput, AWSError] = js.native
  /**
    * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the tape gateway type.
    */
  def deleteTapeArchive(params: DeleteTapeArchiveInput): Request[DeleteTapeArchiveOutput, AWSError] = js.native
  def deleteTapeArchive(
    params: DeleteTapeArchiveInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTapeArchiveOutput, Unit]
  ): Request[DeleteTapeArchiveOutput, AWSError] = js.native
  /**
    * Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You can reuse the local disk to create another storage volume.  Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query snapshots on the volume you are deleting and check the snapshot status. For more information, go to DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference. In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
    */
  def deleteVolume(): Request[DeleteVolumeOutput, AWSError] = js.native
  def deleteVolume(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVolumeOutput, Unit]): Request[DeleteVolumeOutput, AWSError] = js.native
  /**
    * Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You can reuse the local disk to create another storage volume.  Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query snapshots on the volume you are deleting and check the snapshot status. For more information, go to DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference. In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
    */
  def deleteVolume(params: DeleteVolumeInput): Request[DeleteVolumeOutput, AWSError] = js.native
  def deleteVolume(
    params: DeleteVolumeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVolumeOutput, Unit]
  ): Request[DeleteVolumeOutput, AWSError] = js.native
  /**
    * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth rate limiting is in effect. This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def describeBandwidthRateLimit(): Request[DescribeBandwidthRateLimitOutput, AWSError] = js.native
  def describeBandwidthRateLimit(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBandwidthRateLimitOutput, Unit]): Request[DescribeBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth rate limiting is in effect. This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput): Request[DescribeBandwidthRateLimitOutput, AWSError] = js.native
  def describeBandwidthRateLimit(
    params: DescribeBandwidthRateLimitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBandwidthRateLimitOutput, Unit]
  ): Request[DescribeBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and file gateway types. The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and used.
    */
  def describeCache(): Request[DescribeCacheOutput, AWSError] = js.native
  def describeCache(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCacheOutput, Unit]): Request[DescribeCacheOutput, AWSError] = js.native
  /**
    * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and file gateway types. The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and used.
    */
  def describeCache(params: DescribeCacheInput): Request[DescribeCacheOutput, AWSError] = js.native
  def describeCache(
    params: DescribeCacheInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCacheOutput, Unit]
  ): Request[DescribeCacheOutput, AWSError] = js.native
  /**
    * Returns a description of the gateway volumes specified in the request. This operation is only supported in the cached volume gateway types. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume Amazon Resource Name (ARN).
    */
  def describeCachediSCSIVolumes(): Request[DescribeCachediSCSIVolumesOutput, AWSError] = js.native
  def describeCachediSCSIVolumes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCachediSCSIVolumesOutput, Unit]): Request[DescribeCachediSCSIVolumesOutput, AWSError] = js.native
  /**
    * Returns a description of the gateway volumes specified in the request. This operation is only supported in the cached volume gateway types. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume Amazon Resource Name (ARN).
    */
  def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput): Request[DescribeCachediSCSIVolumesOutput, AWSError] = js.native
  def describeCachediSCSIVolumes(
    params: DescribeCachediSCSIVolumesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCachediSCSIVolumesOutput, Unit]
  ): Request[DescribeCachediSCSIVolumesOutput, AWSError] = js.native
  /**
    * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified iSCSI target, one for each target-initiator pair.
    */
  def describeChapCredentials(): Request[DescribeChapCredentialsOutput, AWSError] = js.native
  def describeChapCredentials(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChapCredentialsOutput, Unit]): Request[DescribeChapCredentialsOutput, AWSError] = js.native
  /**
    * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified iSCSI target, one for each target-initiator pair.
    */
  def describeChapCredentials(params: DescribeChapCredentialsInput): Request[DescribeChapCredentialsOutput, AWSError] = js.native
  def describeChapCredentials(
    params: DescribeChapCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChapCredentialsOutput, Unit]
  ): Request[DescribeChapCredentialsOutput, AWSError] = js.native
  /**
    * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def describeGatewayInformation(): Request[DescribeGatewayInformationOutput, AWSError] = js.native
  def describeGatewayInformation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayInformationOutput, Unit]): Request[DescribeGatewayInformationOutput, AWSError] = js.native
  /**
    * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def describeGatewayInformation(params: DescribeGatewayInformationInput): Request[DescribeGatewayInformationOutput, AWSError] = js.native
  def describeGatewayInformation(
    params: DescribeGatewayInformationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayInformationOutput, Unit]
  ): Request[DescribeGatewayInformationOutput, AWSError] = js.native
  /**
    * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone.
    */
  def describeMaintenanceStartTime(): Request[DescribeMaintenanceStartTimeOutput, AWSError] = js.native
  def describeMaintenanceStartTime(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceStartTimeOutput, Unit]): Request[DescribeMaintenanceStartTimeOutput, AWSError] = js.native
  /**
    * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone.
    */
  def describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput): Request[DescribeMaintenanceStartTimeOutput, AWSError] = js.native
  def describeMaintenanceStartTime(
    params: DescribeMaintenanceStartTimeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceStartTimeOutput, Unit]
  ): Request[DescribeMaintenanceStartTimeOutput, AWSError] = js.native
  /**
    * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is only supported for file gateways.
    */
  def describeNFSFileShares(): Request[DescribeNFSFileSharesOutput, AWSError] = js.native
  def describeNFSFileShares(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNFSFileSharesOutput, Unit]): Request[DescribeNFSFileSharesOutput, AWSError] = js.native
  /**
    * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is only supported for file gateways.
    */
  def describeNFSFileShares(params: DescribeNFSFileSharesInput): Request[DescribeNFSFileSharesOutput, AWSError] = js.native
  def describeNFSFileShares(
    params: DescribeNFSFileSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNFSFileSharesOutput, Unit]
  ): Request[DescribeNFSFileSharesOutput, AWSError] = js.native
  /**
    * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is only supported for file gateways.
    */
  def describeSMBFileShares(): Request[DescribeSMBFileSharesOutput, AWSError] = js.native
  def describeSMBFileShares(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSMBFileSharesOutput, Unit]): Request[DescribeSMBFileSharesOutput, AWSError] = js.native
  /**
    * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is only supported for file gateways.
    */
  def describeSMBFileShares(params: DescribeSMBFileSharesInput): Request[DescribeSMBFileSharesOutput, AWSError] = js.native
  def describeSMBFileShares(
    params: DescribeSMBFileSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSMBFileSharesOutput, Unit]
  ): Request[DescribeSMBFileSharesOutput, AWSError] = js.native
  /**
    * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is only supported for file gateways.
    */
  def describeSMBSettings(): Request[DescribeSMBSettingsOutput, AWSError] = js.native
  def describeSMBSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSMBSettingsOutput, Unit]): Request[DescribeSMBSettingsOutput, AWSError] = js.native
  /**
    * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is only supported for file gateways.
    */
  def describeSMBSettings(params: DescribeSMBSettingsInput): Request[DescribeSMBSettingsOutput, AWSError] = js.native
  def describeSMBSettings(
    params: DescribeSMBSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSMBSettingsOutput, Unit]
  ): Request[DescribeSMBSettingsOutput, AWSError] = js.native
  /**
    * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the cached volume and stored volume types.
    */
  def describeSnapshotSchedule(): Request[DescribeSnapshotScheduleOutput, AWSError] = js.native
  def describeSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotScheduleOutput, Unit]): Request[DescribeSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the cached volume and stored volume types.
    */
  def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput): Request[DescribeSnapshotScheduleOutput, AWSError] = js.native
  def describeSnapshotSchedule(
    params: DescribeSnapshotScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotScheduleOutput, Unit]
  ): Request[DescribeSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume ARNs. This operation is only supported in stored volume gateway type.
    */
  def describeStorediSCSIVolumes(): Request[DescribeStorediSCSIVolumesOutput, AWSError] = js.native
  def describeStorediSCSIVolumes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorediSCSIVolumesOutput, Unit]): Request[DescribeStorediSCSIVolumesOutput, AWSError] = js.native
  /**
    * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume ARNs. This operation is only supported in stored volume gateway type.
    */
  def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput): Request[DescribeStorediSCSIVolumesOutput, AWSError] = js.native
  def describeStorediSCSIVolumes(
    params: DescribeStorediSCSIVolumesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorediSCSIVolumesOutput, Unit]
  ): Request[DescribeStorediSCSIVolumesOutput, AWSError] = js.native
  /**
    * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only supported in the tape gateway type. If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual tapes found in the VTS associated with your account.
    */
  def describeTapeArchives(): Request[DescribeTapeArchivesOutput, AWSError] = js.native
  def describeTapeArchives(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapeArchivesOutput, Unit]): Request[DescribeTapeArchivesOutput, AWSError] = js.native
  /**
    * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only supported in the tape gateway type. If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual tapes found in the VTS associated with your account.
    */
  def describeTapeArchives(params: DescribeTapeArchivesInput): Request[DescribeTapeArchivesOutput, AWSError] = js.native
  def describeTapeArchives(
    params: DescribeTapeArchivesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapeArchivesOutput, Unit]
  ): Request[DescribeTapeArchivesOutput, AWSError] = js.native
  /**
    * Returns a list of virtual tape recovery points that are available for the specified tape gateway. A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway. This operation is only supported in the tape gateway type.
    */
  def describeTapeRecoveryPoints(): Request[DescribeTapeRecoveryPointsOutput, AWSError] = js.native
  def describeTapeRecoveryPoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapeRecoveryPointsOutput, Unit]): Request[DescribeTapeRecoveryPointsOutput, AWSError] = js.native
  /**
    * Returns a list of virtual tape recovery points that are available for the specified tape gateway. A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway. This operation is only supported in the tape gateway type.
    */
  def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput): Request[DescribeTapeRecoveryPointsOutput, AWSError] = js.native
  def describeTapeRecoveryPoints(
    params: DescribeTapeRecoveryPointsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapeRecoveryPointsOutput, Unit]
  ): Request[DescribeTapeRecoveryPointsOutput, AWSError] = js.native
  /**
    * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is not specified, returns a description of all virtual tapes associated with the specified gateway. This operation is only supported in the tape gateway type.
    */
  def describeTapes(): Request[DescribeTapesOutput, AWSError] = js.native
  def describeTapes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapesOutput, Unit]): Request[DescribeTapesOutput, AWSError] = js.native
  /**
    * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is not specified, returns a description of all virtual tapes associated with the specified gateway. This operation is only supported in the tape gateway type.
    */
  def describeTapes(params: DescribeTapesInput): Request[DescribeTapesOutput, AWSError] = js.native
  def describeTapes(
    params: DescribeTapesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTapesOutput, Unit]
  ): Request[DescribeTapesOutput, AWSError] = js.native
  /**
    * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume, cached volume and tape gateway types. The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload buffer space allocated and used.
    */
  def describeUploadBuffer(): Request[DescribeUploadBufferOutput, AWSError] = js.native
  def describeUploadBuffer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUploadBufferOutput, Unit]): Request[DescribeUploadBufferOutput, AWSError] = js.native
  /**
    * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume, cached volume and tape gateway types. The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload buffer space allocated and used.
    */
  def describeUploadBuffer(params: DescribeUploadBufferInput): Request[DescribeUploadBufferOutput, AWSError] = js.native
  def describeUploadBuffer(
    params: DescribeUploadBufferInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUploadBufferOutput, Unit]
  ): Request[DescribeUploadBufferOutput, AWSError] = js.native
  /**
    * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS Storage Gateway returns VTL device information. This operation is only supported in the tape gateway type.
    */
  def describeVTLDevices(): Request[DescribeVTLDevicesOutput, AWSError] = js.native
  def describeVTLDevices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVTLDevicesOutput, Unit]): Request[DescribeVTLDevicesOutput, AWSError] = js.native
  /**
    * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS Storage Gateway returns VTL device information. This operation is only supported in the tape gateway type.
    */
  def describeVTLDevices(params: DescribeVTLDevicesInput): Request[DescribeVTLDevicesOutput, AWSError] = js.native
  def describeVTLDevices(
    params: DescribeVTLDevicesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVTLDevicesOutput, Unit]
  ): Request[DescribeVTLDevicesOutput, AWSError] = js.native
  /**
    * Returns information about the working storage of a gateway. This operation is only supported in the stored volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use DescribeUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add upload buffer to a stored volume gateway.  The response includes disk IDs that are configured as working storage, and it includes the amount of working storage allocated and used.
    */
  def describeWorkingStorage(): Request[DescribeWorkingStorageOutput, AWSError] = js.native
  def describeWorkingStorage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkingStorageOutput, Unit]): Request[DescribeWorkingStorageOutput, AWSError] = js.native
  /**
    * Returns information about the working storage of a gateway. This operation is only supported in the stored volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use DescribeUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add upload buffer to a stored volume gateway.  The response includes disk IDs that are configured as working storage, and it includes the amount of working storage allocated and used.
    */
  def describeWorkingStorage(params: DescribeWorkingStorageInput): Request[DescribeWorkingStorageOutput, AWSError] = js.native
  def describeWorkingStorage(
    params: DescribeWorkingStorageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkingStorageOutput, Unit]
  ): Request[DescribeWorkingStorageOutput, AWSError] = js.native
  /**
    * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
    */
  def detachVolume(): Request[DetachVolumeOutput, AWSError] = js.native
  def detachVolume(callback: js.Function2[/* err */ AWSError, /* data */ DetachVolumeOutput, Unit]): Request[DetachVolumeOutput, AWSError] = js.native
  /**
    * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
    */
  def detachVolume(params: DetachVolumeInput): Request[DetachVolumeOutput, AWSError] = js.native
  def detachVolume(
    params: DetachVolumeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachVolumeOutput, Unit]
  ): Request[DetachVolumeOutput, AWSError] = js.native
  /**
    * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged, you can disable the gateway so you can recover virtual tapes. Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported in the tape gateway type.  Once a gateway is disabled it cannot be enabled. 
    */
  def disableGateway(): Request[DisableGatewayOutput, AWSError] = js.native
  def disableGateway(callback: js.Function2[/* err */ AWSError, /* data */ DisableGatewayOutput, Unit]): Request[DisableGatewayOutput, AWSError] = js.native
  /**
    * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged, you can disable the gateway so you can recover virtual tapes. Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported in the tape gateway type.  Once a gateway is disabled it cannot be enabled. 
    */
  def disableGateway(params: DisableGatewayInput): Request[DisableGatewayOutput, AWSError] = js.native
  def disableGateway(
    params: DisableGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableGatewayOutput, Unit]
  ): Request[DisableGatewayOutput, AWSError] = js.native
  /**
    * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that support the SMB file protocol.
    */
  def joinDomain(): Request[JoinDomainOutput, AWSError] = js.native
  def joinDomain(callback: js.Function2[/* err */ AWSError, /* data */ JoinDomainOutput, Unit]): Request[JoinDomainOutput, AWSError] = js.native
  /**
    * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that support the SMB file protocol.
    */
  def joinDomain(params: JoinDomainInput): Request[JoinDomainOutput, AWSError] = js.native
  def joinDomain(
    params: JoinDomainInput,
    callback: js.Function2[/* err */ AWSError, /* data */ JoinDomainOutput, Unit]
  ): Request[JoinDomainOutput, AWSError] = js.native
  /**
    * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling user account. This operation is only supported for file gateways.
    */
  def listFileShares(): Request[ListFileSharesOutput, AWSError] = js.native
  def listFileShares(callback: js.Function2[/* err */ AWSError, /* data */ ListFileSharesOutput, Unit]): Request[ListFileSharesOutput, AWSError] = js.native
  /**
    * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling user account. This operation is only supported for file gateways.
    */
  def listFileShares(params: ListFileSharesInput): Request[ListFileSharesOutput, AWSError] = js.native
  def listFileShares(
    params: ListFileSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFileSharesOutput, Unit]
  ): Request[ListFileSharesOutput, AWSError] = js.native
  /**
    * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by gateway Amazon Resource Name (ARN). By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you to optionally reduce the number of gateways returned in a response. If you have more gateways than are returned in a response (that is, the response returns only a truncated list of your gateways), the response contains a marker that you can specify in your next request to fetch the next page of gateways.
    */
  def listGateways(): Request[ListGatewaysOutput, AWSError] = js.native
  def listGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysOutput, Unit]): Request[ListGatewaysOutput, AWSError] = js.native
  /**
    * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by gateway Amazon Resource Name (ARN). By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you to optionally reduce the number of gateways returned in a response. If you have more gateways than are returned in a response (that is, the response returns only a truncated list of your gateways), the response contains a marker that you can specify in your next request to fetch the next page of gateways.
    */
  def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput, AWSError] = js.native
  def listGateways(
    params: ListGatewaysInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysOutput, Unit]
  ): Request[ListGatewaysOutput, AWSError] = js.native
  /**
    * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource Name (ARN) of the gateway in the body of the request. The request returns a list of all disks, specifying which are configured as working storage, cache storage, or stored volume or not configured at all. The response includes a DiskStatus field. This field can have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway), or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
    */
  def listLocalDisks(): Request[ListLocalDisksOutput, AWSError] = js.native
  def listLocalDisks(callback: js.Function2[/* err */ AWSError, /* data */ ListLocalDisksOutput, Unit]): Request[ListLocalDisksOutput, AWSError] = js.native
  /**
    * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource Name (ARN) of the gateway in the body of the request. The request returns a list of all disks, specifying which are configured as working storage, cache storage, or stored volume or not configured at all. The response includes a DiskStatus field. This field can have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway), or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
    */
  def listLocalDisks(params: ListLocalDisksInput): Request[ListLocalDisksOutput, AWSError] = js.native
  def listLocalDisks(
    params: ListLocalDisksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLocalDisksOutput, Unit]
  ): Request[ListLocalDisksOutput, AWSError] = js.native
  /**
    * Lists the tags that have been added to the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway type.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags that have been added to the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway type.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the operation lists all virtual tapes in both your VTL and VTS. This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can optionally specify the Limit parameter in the body to limit the number of tapes in the response. If the number of tapes returned in the response is truncated, the response includes a Marker element that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported in the tape gateway type.
    */
  def listTapes(): Request[ListTapesOutput, AWSError] = js.native
  def listTapes(callback: js.Function2[/* err */ AWSError, /* data */ ListTapesOutput, Unit]): Request[ListTapesOutput, AWSError] = js.native
  /**
    * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the operation lists all virtual tapes in both your VTL and VTS. This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can optionally specify the Limit parameter in the body to limit the number of tapes in the response. If the number of tapes returned in the response is truncated, the response includes a Marker element that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported in the tape gateway type.
    */
  def listTapes(params: ListTapesInput): Request[ListTapesOutput, AWSError] = js.native
  def listTapes(
    params: ListTapesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTapesOutput, Unit]
  ): Request[ListTapesOutput, AWSError] = js.native
  /**
    * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
    */
  def listVolumeInitiators(): Request[ListVolumeInitiatorsOutput, AWSError] = js.native
  def listVolumeInitiators(callback: js.Function2[/* err */ AWSError, /* data */ ListVolumeInitiatorsOutput, Unit]): Request[ListVolumeInitiatorsOutput, AWSError] = js.native
  /**
    * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
    */
  def listVolumeInitiators(params: ListVolumeInitiatorsInput): Request[ListVolumeInitiatorsOutput, AWSError] = js.native
  def listVolumeInitiators(
    params: ListVolumeInitiatorsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVolumeInitiatorsOutput, Unit]
  ): Request[ListVolumeInitiatorsOutput, AWSError] = js.native
  /**
    * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway type. Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume. To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.
    */
  def listVolumeRecoveryPoints(): Request[ListVolumeRecoveryPointsOutput, AWSError] = js.native
  def listVolumeRecoveryPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListVolumeRecoveryPointsOutput, Unit]): Request[ListVolumeRecoveryPointsOutput, AWSError] = js.native
  /**
    * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway type. Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume. To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.
    */
  def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput): Request[ListVolumeRecoveryPointsOutput, AWSError] = js.native
  def listVolumeRecoveryPoints(
    params: ListVolumeRecoveryPointsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVolumeRecoveryPointsOutput, Unit]
  ): Request[ListVolumeRecoveryPointsOutput, AWSError] = js.native
  /**
    * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the DescribeCachediSCSIVolumes API. The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can optionally specify the Limit field in the body to limit the number of volumes in the response. If the number of volumes returned in the response is truncated, the response includes a Marker field. You can use this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only supported in the cached volume and stored volume gateway types.
    */
  def listVolumes(): Request[ListVolumesOutput, AWSError] = js.native
  def listVolumes(callback: js.Function2[/* err */ AWSError, /* data */ ListVolumesOutput, Unit]): Request[ListVolumesOutput, AWSError] = js.native
  /**
    * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the DescribeCachediSCSIVolumes API. The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can optionally specify the Limit field in the body to limit the number of volumes in the response. If the number of volumes returned in the response is truncated, the response includes a Marker field. You can use this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only supported in the cached volume and stored volume gateway types.
    */
  def listVolumes(params: ListVolumesInput): Request[ListVolumesOutput, AWSError] = js.native
  def listVolumes(
    params: ListVolumesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVolumesOutput, Unit]
  ): Request[ListVolumesOutput, AWSError] = js.native
  /**
    * Sends you notification through CloudWatch Events when all files written to your file share have been uploaded to Amazon S3. AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file share up to that point in time have been uploaded to Amazon S3. These files include files written to the file share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file gateways. For more information, see Getting File Upload Notification in the Storage Gateway User Guide (https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification). 
    */
  def notifyWhenUploaded(): Request[NotifyWhenUploadedOutput, AWSError] = js.native
  def notifyWhenUploaded(callback: js.Function2[/* err */ AWSError, /* data */ NotifyWhenUploadedOutput, Unit]): Request[NotifyWhenUploadedOutput, AWSError] = js.native
  /**
    * Sends you notification through CloudWatch Events when all files written to your file share have been uploaded to Amazon S3. AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file share up to that point in time have been uploaded to Amazon S3. These files include files written to the file share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file gateways. For more information, see Getting File Upload Notification in the Storage Gateway User Guide (https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification). 
    */
  def notifyWhenUploaded(params: NotifyWhenUploadedInput): Request[NotifyWhenUploadedOutput, AWSError] = js.native
  def notifyWhenUploaded(
    params: NotifyWhenUploadedInput,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyWhenUploadedOutput, Unit]
  ): Request[NotifyWhenUploadedOutput, AWSError] = js.native
  /**
    * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations. When this API is called, it only initiates the refresh operation. When the API call completes and returns a success code, it doesn't necessarily mean that the file refresh has completed. You should use the refresh-complete notification to determine that the operation has completed before you check for new files on the gateway file share. You can subscribe to be notified through an CloudWatch event when your RefreshCache operation completes. 
    */
  def refreshCache(): Request[RefreshCacheOutput, AWSError] = js.native
  def refreshCache(callback: js.Function2[/* err */ AWSError, /* data */ RefreshCacheOutput, Unit]): Request[RefreshCacheOutput, AWSError] = js.native
  /**
    * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations. When this API is called, it only initiates the refresh operation. When the API call completes and returns a success code, it doesn't necessarily mean that the file refresh has completed. You should use the refresh-complete notification to determine that the operation has completed before you check for new files on the gateway file share. You can subscribe to be notified through an CloudWatch event when your RefreshCache operation completes. 
    */
  def refreshCache(params: RefreshCacheInput): Request[RefreshCacheOutput, AWSError] = js.native
  def refreshCache(
    params: RefreshCacheInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RefreshCacheOutput, Unit]
  ): Request[RefreshCacheOutput, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway types.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceOutput, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceOutput, Unit]): Request[RemoveTagsFromResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway types.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceInput): Request[RemoveTagsFromResourceOutput, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceOutput, Unit]
  ): Request[RemoveTagsFromResourceOutput, AWSError] = js.native
  /**
    * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks. This operation is only supported in the cached volume and tape types.  If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must configure at least one new cache disk for your gateway to function properly. 
    */
  def resetCache(): Request[ResetCacheOutput, AWSError] = js.native
  def resetCache(callback: js.Function2[/* err */ AWSError, /* data */ ResetCacheOutput, Unit]): Request[ResetCacheOutput, AWSError] = js.native
  /**
    * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks. This operation is only supported in the cached volume and tape types.  If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must configure at least one new cache disk for your gateway to function properly. 
    */
  def resetCache(params: ResetCacheInput): Request[ResetCacheOutput, AWSError] = js.native
  def resetCache(
    params: ResetCacheInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetCacheOutput, Unit]
  ): Request[ResetCacheOutput, AWSError] = js.native
  /**
    * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway, even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway type. Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must archive the tape again before you can retrieve it to another gateway. This operation is only supported in the tape gateway type.
    */
  def retrieveTapeArchive(): Request[RetrieveTapeArchiveOutput, AWSError] = js.native
  def retrieveTapeArchive(callback: js.Function2[/* err */ AWSError, /* data */ RetrieveTapeArchiveOutput, Unit]): Request[RetrieveTapeArchiveOutput, AWSError] = js.native
  /**
    * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway, even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway type. Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must archive the tape again before you can retrieve it to another gateway. This operation is only supported in the tape gateway type.
    */
  def retrieveTapeArchive(params: RetrieveTapeArchiveInput): Request[RetrieveTapeArchiveOutput, AWSError] = js.native
  def retrieveTapeArchive(
    params: RetrieveTapeArchiveInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RetrieveTapeArchiveOutput, Unit]
  ): Request[RetrieveTapeArchiveOutput, AWSError] = js.native
  /**
    * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway type. A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.  The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be retrieved to only a tape gateway. There is no charge for retrieving recovery points. 
    */
  def retrieveTapeRecoveryPoint(): Request[RetrieveTapeRecoveryPointOutput, AWSError] = js.native
  def retrieveTapeRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ RetrieveTapeRecoveryPointOutput, Unit]): Request[RetrieveTapeRecoveryPointOutput, AWSError] = js.native
  /**
    * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway type. A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.  The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be retrieved to only a tape gateway. There is no charge for retrieving recovery points. 
    */
  def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput): Request[RetrieveTapeRecoveryPointOutput, AWSError] = js.native
  def retrieveTapeRecoveryPoint(
    params: RetrieveTapeRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RetrieveTapeRecoveryPointOutput, Unit]
  ): Request[RetrieveTapeRecoveryPointOutput, AWSError] = js.native
  /**
    * Sets the password for your VM local console. When you log in to the local console for the first time, you log in to the VM with the default credentials. We recommend that you set a new password. You don't need to know the default password to set a new password.
    */
  def setLocalConsolePassword(): Request[SetLocalConsolePasswordOutput, AWSError] = js.native
  def setLocalConsolePassword(callback: js.Function2[/* err */ AWSError, /* data */ SetLocalConsolePasswordOutput, Unit]): Request[SetLocalConsolePasswordOutput, AWSError] = js.native
  /**
    * Sets the password for your VM local console. When you log in to the local console for the first time, you log in to the VM with the default credentials. We recommend that you set a new password. You don't need to know the default password to set a new password.
    */
  def setLocalConsolePassword(params: SetLocalConsolePasswordInput): Request[SetLocalConsolePasswordOutput, AWSError] = js.native
  def setLocalConsolePassword(
    params: SetLocalConsolePasswordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetLocalConsolePasswordOutput, Unit]
  ): Request[SetLocalConsolePasswordOutput, AWSError] = js.native
  /**
    * Sets the password for the guest user smbguest. The smbguest user is the user when the authentication method for the file share is set to GuestAccess.
    */
  def setSMBGuestPassword(): Request[SetSMBGuestPasswordOutput, AWSError] = js.native
  def setSMBGuestPassword(callback: js.Function2[/* err */ AWSError, /* data */ SetSMBGuestPasswordOutput, Unit]): Request[SetSMBGuestPasswordOutput, AWSError] = js.native
  /**
    * Sets the password for the guest user smbguest. The smbguest user is the user when the authentication method for the file share is set to GuestAccess.
    */
  def setSMBGuestPassword(params: SetSMBGuestPasswordInput): Request[SetSMBGuestPasswordOutput, AWSError] = js.native
  def setSMBGuestPassword(
    params: SetSMBGuestPasswordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetSMBGuestPasswordOutput, Unit]
  ): Request[SetSMBGuestPasswordOutput, AWSError] = js.native
  /**
    * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in the body of your request. The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the host VM.  If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to avoid unpredictable conditions.  After the gateway is shutdown, you cannot call any other API except StartGateway, DescribeGatewayInformation, and ListGateways. For more information, see ActivateGateway. Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.  When you make a shutdown request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to shut down. You can call the DescribeGatewayInformation API to check the status. For more information, see ActivateGateway.  If do not intend to use the gateway again, you must delete the gateway (using DeleteGateway) to no longer pay software charges associated with the gateway.
    */
  def shutdownGateway(): Request[ShutdownGatewayOutput, AWSError] = js.native
  def shutdownGateway(callback: js.Function2[/* err */ AWSError, /* data */ ShutdownGatewayOutput, Unit]): Request[ShutdownGatewayOutput, AWSError] = js.native
  /**
    * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in the body of your request. The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the host VM.  If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to avoid unpredictable conditions.  After the gateway is shutdown, you cannot call any other API except StartGateway, DescribeGatewayInformation, and ListGateways. For more information, see ActivateGateway. Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.  When you make a shutdown request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to shut down. You can call the DescribeGatewayInformation API to check the status. For more information, see ActivateGateway.  If do not intend to use the gateway again, you must delete the gateway (using DeleteGateway) to no longer pay software charges associated with the gateway.
    */
  def shutdownGateway(params: ShutdownGatewayInput): Request[ShutdownGatewayOutput, AWSError] = js.native
  def shutdownGateway(
    params: ShutdownGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ShutdownGatewayOutput, Unit]
  ): Request[ShutdownGatewayOutput, AWSError] = js.native
  /**
    * Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can then make other API calls, your applications can read from or write to the gateway's storage volumes and you will be able to take snapshot backups.  When you make a request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any additional API calls. For more information, see ActivateGateway.  To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def startGateway(): Request[StartGatewayOutput, AWSError] = js.native
  def startGateway(callback: js.Function2[/* err */ AWSError, /* data */ StartGatewayOutput, Unit]): Request[StartGatewayOutput, AWSError] = js.native
  /**
    * Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can then make other API calls, your applications can read from or write to the gateway's storage volumes and you will be able to take snapshot backups.  When you make a request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any additional API calls. For more information, see ActivateGateway.  To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def startGateway(params: StartGatewayInput): Request[StartGatewayOutput, AWSError] = js.native
  def startGateway(
    params: StartGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartGatewayOutput, Unit]
  ): Request[StartGatewayOutput, AWSError] = js.native
  /**
    * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains. By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have any limitations on its bandwidth usage and could potentially use the maximum available bandwidth. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def updateBandwidthRateLimit(): Request[UpdateBandwidthRateLimitOutput, AWSError] = js.native
  def updateBandwidthRateLimit(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBandwidthRateLimitOutput, Unit]): Request[UpdateBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains. By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have any limitations on its bandwidth usage and could potentially use the maximum available bandwidth. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput): Request[UpdateBandwidthRateLimitOutput, AWSError] = js.native
  def updateBandwidthRateLimit(
    params: UpdateBandwidthRateLimitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBandwidthRateLimitOutput, Unit]
  ): Request[UpdateBandwidthRateLimitOutput, AWSError] = js.native
  /**
    * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By default, a gateway does not have CHAP enabled; however, for added security, you might use it.  When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect with the new credentials. 
    */
  def updateChapCredentials(): Request[UpdateChapCredentialsOutput, AWSError] = js.native
  def updateChapCredentials(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChapCredentialsOutput, Unit]): Request[UpdateChapCredentialsOutput, AWSError] = js.native
  /**
    * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By default, a gateway does not have CHAP enabled; however, for added security, you might use it.  When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect with the new credentials. 
    */
  def updateChapCredentials(params: UpdateChapCredentialsInput): Request[UpdateChapCredentialsOutput, AWSError] = js.native
  def updateChapCredentials(
    params: UpdateChapCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChapCredentialsOutput, Unit]
  ): Request[UpdateChapCredentialsOutput, AWSError] = js.native
  /**
    * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.  For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway name. However, changing the name of the gateway has no effect on the gateway's ARN. 
    */
  def updateGatewayInformation(): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  def updateGatewayInformation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInformationOutput, Unit]): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  /**
    * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.  For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway name. However, changing the name of the gateway has no effect on the gateway's ARN. 
    */
  def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  def updateGatewayInformation(
    params: UpdateGatewayInformationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInformationOutput, Unit]
  ): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  /**
    * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in the STATE_RUNNING state.   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively. 
    */
  def updateGatewaySoftwareNow(): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  def updateGatewaySoftwareNow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewaySoftwareNowOutput, Unit]): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  /**
    * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in the STATE_RUNNING state.   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively. 
    */
  def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  def updateGatewaySoftwareNow(
    params: UpdateGatewaySoftwareNowInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewaySoftwareNowOutput, Unit]
  ): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  /**
    * Updates a gateway's weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway's time zone.
    */
  def updateMaintenanceStartTime(): Request[UpdateMaintenanceStartTimeOutput, AWSError] = js.native
  def updateMaintenanceStartTime(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceStartTimeOutput, Unit]): Request[UpdateMaintenanceStartTimeOutput, AWSError] = js.native
  /**
    * Updates a gateway's weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway's time zone.
    */
  def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput): Request[UpdateMaintenanceStartTimeOutput, AWSError] = js.native
  def updateMaintenanceStartTime(
    params: UpdateMaintenanceStartTimeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceStartTimeOutput, Unit]
  ): Request[UpdateMaintenanceStartTimeOutput, AWSError] = js.native
  /**
    * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.  To leave a file share field unchanged, set the corresponding input field to null.  Updates the following file share setting:   Default storage class for your S3 bucket   Metadata defaults for your S3 bucket   Allowed NFS clients for your file share   Squash settings   Write status of your file share    To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported in file gateways. 
    */
  def updateNFSFileShare(): Request[UpdateNFSFileShareOutput, AWSError] = js.native
  def updateNFSFileShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNFSFileShareOutput, Unit]): Request[UpdateNFSFileShareOutput, AWSError] = js.native
  /**
    * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.  To leave a file share field unchanged, set the corresponding input field to null.  Updates the following file share setting:   Default storage class for your S3 bucket   Metadata defaults for your S3 bucket   Allowed NFS clients for your file share   Squash settings   Write status of your file share    To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported in file gateways. 
    */
  def updateNFSFileShare(params: UpdateNFSFileShareInput): Request[UpdateNFSFileShareOutput, AWSError] = js.native
  def updateNFSFileShare(
    params: UpdateNFSFileShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNFSFileShareOutput, Unit]
  ): Request[UpdateNFSFileShareOutput, AWSError] = js.native
  /**
    * Updates a Server Message Block (SMB) file share.  To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported for file gateways.   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
    */
  def updateSMBFileShare(): Request[UpdateSMBFileShareOutput, AWSError] = js.native
  def updateSMBFileShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSMBFileShareOutput, Unit]): Request[UpdateSMBFileShareOutput, AWSError] = js.native
  /**
    * Updates a Server Message Block (SMB) file share.  To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported for file gateways.   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
    */
  def updateSMBFileShare(params: UpdateSMBFileShareInput): Request[UpdateSMBFileShareOutput, AWSError] = js.native
  def updateSMBFileShare(
    params: UpdateSMBFileShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSMBFileShareOutput, Unit]
  ): Request[UpdateSMBFileShareOutput, AWSError] = js.native
  /**
    * Updates the SMB security strategy on a file gateway. This action is only supported in file gateways.  This API is called Security level in the User Guide. A higher security level can affect performance of the gateway. 
    */
  def updateSMBSecurityStrategy(): Request[UpdateSMBSecurityStrategyOutput, AWSError] = js.native
  def updateSMBSecurityStrategy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSMBSecurityStrategyOutput, Unit]): Request[UpdateSMBSecurityStrategyOutput, AWSError] = js.native
  /**
    * Updates the SMB security strategy on a file gateway. This action is only supported in file gateways.  This API is called Security level in the User Guide. A higher security level can affect performance of the gateway. 
    */
  def updateSMBSecurityStrategy(params: UpdateSMBSecurityStrategyInput): Request[UpdateSMBSecurityStrategyOutput, AWSError] = js.native
  def updateSMBSecurityStrategy(
    params: UpdateSMBSecurityStrategyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSMBSecurityStrategyOutput, Unit]
  ): Request[UpdateSMBSecurityStrategyOutput, AWSError] = js.native
  /**
    * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached volume and stored volume gateway types. The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You can use this API to change the snapshot schedule configured for the volume. In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
    */
  def updateSnapshotSchedule(): Request[UpdateSnapshotScheduleOutput, AWSError] = js.native
  def updateSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotScheduleOutput, Unit]): Request[UpdateSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached volume and stored volume gateway types. The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You can use this API to change the snapshot schedule configured for the volume. In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
    */
  def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput): Request[UpdateSnapshotScheduleOutput, AWSError] = js.native
  def updateSnapshotSchedule(
    params: UpdateSnapshotScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotScheduleOutput, Unit]
  ): Request[UpdateSnapshotScheduleOutput, AWSError] = js.native
  /**
    * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium changer type for the tape gateway. This operation enables you to select a different type of medium changer after a tape gateway is activated. This operation is only supported in the tape gateway type.
    */
  def updateVTLDeviceType(): Request[UpdateVTLDeviceTypeOutput, AWSError] = js.native
  def updateVTLDeviceType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVTLDeviceTypeOutput, Unit]): Request[UpdateVTLDeviceTypeOutput, AWSError] = js.native
  /**
    * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium changer type for the tape gateway. This operation enables you to select a different type of medium changer after a tape gateway is activated. This operation is only supported in the tape gateway type.
    */
  def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput): Request[UpdateVTLDeviceTypeOutput, AWSError] = js.native
  def updateVTLDeviceType(
    params: UpdateVTLDeviceTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVTLDeviceTypeOutput, Unit]
  ): Request[UpdateVTLDeviceTypeOutput, AWSError] = js.native
}

