package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/storagegateway", "StorageGateway")
@js.native
object StorageGatewayNs extends js.Object {
  trait ActivateGatewayInput extends js.Object {
    /**
      * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the activation key for your gateway in the query string parameter activationKey. It may also include other activation-related parameters, however, these are merely defaults -- the arguments you pass to the ActivateGateway API call determine the actual configuration of your gateway.  For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage Gateway User Guide.
      */
    var ActivationKey: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ActivationKey
    /**
      * The name you configured for your gateway.
      */
    var GatewayName: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayName
    /**
      * A value that indicates the region where you want to store your data. The gateway region specified must be the same region as the region in your Host header in the request. For more information about available regions and endpoints for AWS Storage Gateway, see Regions and Endpoints in the Amazon Web Services Glossary.  Valid Values: See AWS Storage Gateway Regions and Endpoints in the AWS General Reference. 
      */
    var GatewayRegion: RegionId
    /**
      * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
      */
    var GatewayTimezone: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayTimezone
    /**
      * A value that defines the type of gateway to activate. The type specified is critical to all later functions of the gateway and cannot be changed after activation. The default value is CACHED.   Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
      */
    var GatewayType: js.UndefOr[GatewayType] = js.undefined
    /**
      * The value that indicates the type of medium changer to use for tape gateway. This field is optional.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
      */
    var MediumChangerType: js.UndefOr[MediumChangerType] = js.undefined
    /**
      * A list of up to 10 tags that can be assigned to the gateway. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The value that indicates the type of tape drive to use for tape gateway. This field is optional.  Valid Values: "IBM-ULT3580-TD5" 
      */
    var TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined
  }
  
  trait ActivateGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait AddCacheInput extends js.Object {
    /**
      * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
      */
    var DiskIds: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DiskIds
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait AddCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait AddTagsToResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource you want to add tags to.
      */
    var ResourceARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ResourceARN
    /**
      * The key-value pair that represents the tag you want to add to the resource. The value can be an empty string.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
      */
    var Tags: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.Tags
  }
  
  trait AddTagsToResourceOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource you want to add tags to.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
  }
  
  trait AddUploadBufferInput extends js.Object {
    /**
      * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
      */
    var DiskIds: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DiskIds
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait AddUploadBufferOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait AddWorkingStorageInput extends js.Object {
    /**
      * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
      */
    var DiskIds: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DiskIds
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait AddWorkingStorageOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait AttachVolumeInput extends js.Object {
    /**
      * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This value is only required when you are attaching a stored volume.
      */
    var DiskId: js.UndefOr[DiskId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway.  Valid Values: A valid IP address.
      */
    var NetworkInterfaceId: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.NetworkInterfaceId
    /**
      * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
      */
    var TargetName: js.UndefOr[TargetName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait AttachVolumeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name for the initiator that was used to connect to the target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume that was attached to the gateway.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait CachediSCSIVolume extends js.Object {
    /**
      * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
      */
    var CreatedDate: js.UndefOr[CreatedDate] = js.undefined
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * If the cached volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not included.
      */
    var SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
      */
    var TargetName: js.UndefOr[TargetName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the storage volume.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * A value that indicates whether a storage volume is attached to or detached from a gateway. For more information, see Moving Your Volumes to a Different Gateway.
      */
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined
    /**
      * The unique identifier of the volume, e.g. vol-AE4B946D.
      */
    var VolumeId: js.UndefOr[VolumeId] = js.undefined
    /**
      * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the cached volume is not restoring or bootstrapping.
      */
    var VolumeProgress: js.UndefOr[DoubleObject] = js.undefined
    /**
      * The size, in bytes, of the volume capacity.
      */
    var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * One of the VolumeStatus values that indicates the state of the storage volume.
      */
    var VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined
    /**
      * One of the VolumeType enumeration values that describes the type of the volume.
      */
    var VolumeType: js.UndefOr[VolumeType] = js.undefined
    /**
      * The size of the data stored on the volume in bytes.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
      */
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined
    /**
      * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
      */
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined
  }
  
  trait CancelArchivalInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The Amazon Resource Name (ARN) of the virtual tape you want to cancel archiving for.
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait CancelArchivalOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape for which archiving was canceled.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait CancelRetrievalInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The Amazon Resource Name (ARN) of the virtual tape you want to cancel retrieval for.
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait CancelRetrievalOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape for which retrieval was canceled.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait ChapInfo extends js.Object {
    /**
      * The iSCSI initiator that connects to the target.
      */
    var InitiatorName: js.UndefOr[IqnName] = js.undefined
    /**
      * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
      */
    var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined
    /**
      * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).
      */
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateCachediSCSIVolumeInput extends js.Object {
    /**
      * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.
      */
    var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ClientToken
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway.  Valid Values: A valid IP address.
      */
    var NetworkInterfaceId: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.NetworkInterfaceId
    /**
      * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The VolumeSizeInBytes value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
      */
    var SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
      */
    var TargetName: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TargetName
    /**
      * The size of the volume in bytes.
      */
    var VolumeSizeInBytes: long
  }
  
  trait CreateCachediSCSIVolumeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the configured volume.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait CreateNFSFileShareInput extends js.Object {
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. 
      */
    var ClientList: js.UndefOr[FileShareClientList] = js.undefined
    /**
      * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
      */
    var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ClientToken
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The ARN of the backed storage used for storing file data. 
      */
    var LocationARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.LocationARN
    /**
      * File share default values. Optional.
      */
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
      */
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage. 
      */
    var Role: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.Role
    /**
      * A value that maps a user to anonymous user. Valid options are the following:     RootSquash - Only root is mapped to anonymous user.    NoSquash - No one is mapped to anonymous user    AllSquash - Everyone is mapped to anonymous user.  
      */
    var Squash: js.UndefOr[Squash] = js.undefined
    /**
      * A list of up to 10 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateNFSFileShareOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the newly created file share. 
      */
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  }
  
  trait CreateSMBFileShareInput extends js.Object {
    /**
      * The authentication method that users use to access the file share. Valid values are ActiveDirectory or GuestAccess. The default is ActiveDirectory.
      */
    var Authentication: js.UndefOr[Authentication] = js.undefined
    /**
      * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
      */
    var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ClientToken
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The ARN of the backed storage used for storing file data. 
      */
    var LocationARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.LocationARN
    /**
      * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
      */
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage. 
      */
    var Role: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.Role
    /**
      * A list of up to 10 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
  }
  
  trait CreateSMBFileShareOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the newly created file share. 
      */
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  }
  
  trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
    /**
      * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field
      */
    var SnapshotDescription: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.SnapshotDescription
    /**
      * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
    /**
      * The ID of the snapshot.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * The time the volume was created from the recovery point.
      */
    var VolumeRecoveryPointTime: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateSnapshotInput extends js.Object {
    /**
      * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field
      */
    var SnapshotDescription: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.SnapshotDescription
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait CreateSnapshotOutput extends js.Object {
    /**
      * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon Elastic Compute Cloud API DescribeSnapshots) or creating a volume from a snapshot (CreateStorediSCSIVolume).
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait CreateStorediSCSIVolumeInput extends js.Object {
    /**
      * The unique identifier for the gateway local disk that is configured as a stored volume. Use ListLocalDisks to list disk IDs for a gateway.
      */
    var DiskId: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DiskId
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway.  Valid Values: A valid IP address.
      */
    var NetworkInterfaceId: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.NetworkInterfaceId
    /**
      * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.  Valid Values: true, false
      */
    var PreserveExistingData: scala.Boolean
    /**
      * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
      */
    var TargetName: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TargetName
  }
  
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the configured volume.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * The size of the volume in bytes.
      */
    var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
  }
  
  trait CreateTapeWithBarcodeInput extends js.Object {
    /**
      * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS Key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
      */
    var PoolId: js.UndefOr[PoolId] = js.undefined
    /**
      * The barcode that you want to assign to the tape.  Barcodes cannot be reused. This includes barcodes used for tapes that have been deleted. 
      */
    var TapeBarcode: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeBarcode
    /**
      * The size, in bytes, of the virtual tape that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
      */
    var TapeSizeInBytes: TapeSize
  }
  
  trait CreateTapeWithBarcodeOutput extends js.Object {
    /**
      * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait CreateTapesInput extends js.Object {
    /**
      * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.  Using the same ClientToken prevents creating the tape multiple times. 
      */
    var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ClientToken
    /**
      * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The number of virtual tapes that you want to create.
      */
    var NumTapesToCreate: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.NumTapesToCreate
    /**
      * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class you chose when you created the tape. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive). Valid values: "GLACIER", "DEEP_ARCHIVE"
      */
    var PoolId: js.UndefOr[PoolId] = js.undefined
    /**
      * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode unique.  The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z. 
      */
    var TapeBarcodePrefix: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeBarcodePrefix
    /**
      * The size, in bytes, of the virtual tapes that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
      */
    var TapeSizeInBytes: TapeSize
  }
  
  trait CreateTapesOutput extends js.Object {
    /**
      * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
      */
    var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
  }
  
  trait DeleteBandwidthRateLimitInput extends js.Object {
    /**
      * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: Upload, Download, All.
      */
    var BandwidthType: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.BandwidthType
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DeleteBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait DeleteChapCredentialsInput extends js.Object {
    /**
      * The iSCSI initiator that connects to the target.
      */
    var InitiatorName: IqnName
    /**
      * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
      */
    var TargetARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TargetARN
  }
  
  trait DeleteChapCredentialsOutput extends js.Object {
    /**
      * The iSCSI initiator that connects to the target.
      */
    var InitiatorName: js.UndefOr[IqnName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
  }
  
  trait DeleteFileShareInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the file share to be deleted. 
      */
    var FileShareARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARN
    /**
      * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload process, and the file share enters the FORCE_DELETING status.
      */
    var ForceDelete: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait DeleteFileShareOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deleted file share. 
      */
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  }
  
  trait DeleteGatewayInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DeleteGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait DeleteSnapshotScheduleInput extends js.Object {
    /**
      * The volume which snapshot schedule to delete.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait DeleteSnapshotScheduleOutput extends js.Object {
    /**
      * The volume which snapshot schedule was deleted.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait DeleteTapeArchiveInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait DeleteTapeArchiveOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape that was deleted from the virtual tape shelf (VTS).
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait DeleteTapeInput extends js.Object {
    /**
      * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The Amazon Resource Name (ARN) of the virtual tape to delete.
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait DeleteTapeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deleted virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait DeleteVolumeInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait DeleteVolumeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the storage volume that was deleted. It is the same ARN you provided in the request.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait DescribeBandwidthRateLimitInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeBandwidthRateLimitOutput extends js.Object {
    /**
      * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the download rate limit is not set.
      */
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
    /**
      * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the upload rate limit is not set.
      */
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeCacheOutput extends js.Object {
    /**
      * The amount of cache in bytes allocated to the a gateway.
      */
    var CacheAllocatedInBytes: js.UndefOr[long] = js.undefined
    /**
      * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
      */
    var CacheDirtyPercentage: js.UndefOr[double] = js.undefined
    /**
      * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
      */
    var CacheHitPercentage: js.UndefOr[double] = js.undefined
    /**
      * 
      */
    var CacheMissPercentage: js.UndefOr[double] = js.undefined
    /**
      * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
      */
    var CacheUsedPercentage: js.UndefOr[double] = js.undefined
    /**
      * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
      */
    var DiskIds: js.UndefOr[DiskIds] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    /**
      * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the specified cached volumes must from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
      */
    var VolumeARNs: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARNs
  }
  
  trait DescribeCachediSCSIVolumesOutput extends js.Object {
    /**
      * An array of objects where each object contains metadata about one cached volume.
      */
    var CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes] = js.undefined
  }
  
  trait DescribeChapCredentialsInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
      */
    var TargetARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TargetARN
  }
  
  trait DescribeChapCredentialsOutput extends js.Object {
    /**
      * An array of ChapInfo objects that represent CHAP credentials. Each object in the array contains CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned. CHAP credential information is provided in a JSON object with the following fields:    InitiatorName: The iSCSI initiator that connects to the target.    SecretToAuthenticateInitiator: The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.    SecretToAuthenticateTarget: The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).    TargetARN: The Amazon Resource Name (ARN) of the storage volume.  
      */
    var ChapCredentials: js.UndefOr[ChapCredentials] = js.undefined
  }
  
  trait DescribeGatewayInformationInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
      */
    var GatewayId: js.UndefOr[GatewayId] = js.undefined
    /**
      * The name you configured for your gateway.
      */
    var GatewayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A NetworkInterface array that contains descriptions of the gateway network interfaces.
      */
    var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces] = js.undefined
    /**
      * A value that indicates the operating state of the gateway.
      */
    var GatewayState: js.UndefOr[GatewayState] = js.undefined
    /**
      * A value that indicates the time zone configured for the gateway.
      */
    var GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined
    /**
      * The type of the gateway.
      */
    var GatewayType: js.UndefOr[GatewayType] = js.undefined
    /**
      * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response.
      */
    var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate] = js.undefined
    /**
      * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
      */
    var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate] = js.undefined
    /**
      * A list of up to 10 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DescribeMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    /**
      * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents Saturday. The day of week is in the time zone of the gateway.
      */
    var DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The hour component of the maintenance start time represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
      */
    var HourOfDay: js.UndefOr[HourOfDay] = js.undefined
    /**
      * The minute component of the maintenance start time represented as mm, where mm is the minute (0 to 59). The minute of the hour is in the time zone of the gateway.
      */
    var MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined
    /**
      * A value that indicates the time zone that is set for the gateway. The start time and day of week specified should be in the time zone of the gateway.
      */
    var Timezone: js.UndefOr[GatewayTimezone] = js.undefined
  }
  
  trait DescribeNFSFileSharesInput extends js.Object {
    /**
      * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
      */
    var FileShareARNList: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARNList
  }
  
  trait DescribeNFSFileSharesOutput extends js.Object {
    /**
      * An array containing a description for each requested file share. 
      */
    var NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList] = js.undefined
  }
  
  trait DescribeSMBFileSharesInput extends js.Object {
    /**
      * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
      */
    var FileShareARNList: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARNList
  }
  
  trait DescribeSMBFileSharesOutput extends js.Object {
    /**
      * An array containing a description for each requested file share. 
      */
    var SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList] = js.undefined
  }
  
  trait DescribeSMBSettingsInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeSMBSettingsOutput extends js.Object {
    /**
      * The name of the domain that the gateway is joined to.
      */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
      */
    var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DescribeSnapshotScheduleInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait DescribeSnapshotScheduleOutput extends js.Object {
    /**
      * The snapshot description.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The number of hours between snapshots.
      */
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined
    /**
      * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
      */
    var StartAt: js.UndefOr[HourOfDay] = js.undefined
    /**
      * A value that indicates the time zone of the gateway.
      */
    var Timezone: js.UndefOr[GatewayTimezone] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume that was specified in the request.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait DescribeStorediSCSIVolumesInput extends js.Object {
    /**
      * An array of strings where each string represents the Amazon Resource Name (ARN) of a stored volume. All of the specified stored volumes must from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
      */
    var VolumeARNs: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARNs
  }
  
  trait DescribeStorediSCSIVolumesOutput extends js.Object {
    /**
      * Describes a single unit of output from DescribeStorediSCSIVolumes. The following fields are returned:    ChapEnabled: Indicates whether mutual CHAP is enabled for the iSCSI target.    LunNumber: The logical disk number.    NetworkInterfaceId: The network interface ID of the stored volume that initiator use to map the stored volume as an iSCSI target.    NetworkInterfacePort: The port used to communicate with iSCSI targets.    PreservedExistingData: Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.    SourceSnapshotId: If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not included.    StorediSCSIVolumes: An array of StorediSCSIVolume objects where each object contains metadata about one stored volume.    TargetARN: The Amazon Resource Name (ARN) of the volume target.    VolumeARN: The Amazon Resource Name (ARN) of the stored volume.    VolumeDiskId: The disk ID of the local disk that was specified in the CreateStorediSCSIVolume operation.    VolumeId: The unique identifier of the storage volume, e.g. vol-1122AABB.    VolumeiSCSIAttributes: An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.    VolumeProgress: Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the stored volume is not restoring or bootstrapping.    VolumeSizeInBytes: The size of the volume in bytes.    VolumeStatus: One of the VolumeStatus values that indicates the state of the volume.    VolumeType: One of the enumeration values describing the type of the volume. Currently, on STORED volumes are supported.  
      */
    var StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes] = js.undefined
  }
  
  trait DescribeTapeArchivesInput extends js.Object {
    /**
      * Specifies that the number of virtual tapes descried be limited to the specified number.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * An opaque string that indicates the position at which to begin describing virtual tapes.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
      */
    var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
  }
  
  trait DescribeTapeArchivesOutput extends js.Object {
    /**
      * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape barcode.
      */
    var TapeArchives: js.UndefOr[TapeArchives] = js.undefined
  }
  
  trait DescribeTapeRecoveryPointsInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * Specifies that the number of virtual tape recovery points that are described be limited to the specified number.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * An opaque string that indicates the position at which to begin describing the virtual tape recovery points.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  trait DescribeTapeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * An opaque string that indicates the position at which the virtual tape recovery points that were listed for description ended. Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there are no more recovery points to describe, this field does not appear in the response.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of TapeRecoveryPointInfos that are available for the specified gateway.
      */
    var TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos] = js.undefined
  }
  
  trait DescribeTapesInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * Specifies that the number of virtual tapes described be limited to the specified number.  Amazon Web Services may impose its own limit, if this field is not set. 
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * A marker value, obtained in a previous call to DescribeTapes. This marker indicates which page of results to retrieve.  If not specified, the first page of results is retrieved.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the specified gateway.
      */
    var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
  }
  
  trait DescribeTapesOutput extends js.Object {
    /**
      * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of results. If a response does not contain a marker, then there are no more results to be retrieved.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of virtual tape descriptions.
      */
    var Tapes: js.UndefOr[Tapes] = js.undefined
  }
  
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeUploadBufferOutput extends js.Object {
    /**
      * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
      */
    var DiskIds: js.UndefOr[DiskIds] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The total number of bytes allocated in the gateway's as upload buffer.
      */
    var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined
    /**
      * The total number of bytes being used in the gateway's upload buffer.
      */
    var UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined
  }
  
  trait DescribeVTLDevicesInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * Specifies that the number of VTL devices described be limited to the specified number.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * An opaque string that indicates the position at which to begin describing the VTL devices.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.  All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will contain all devices on the specified gateway. 
      */
    var VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined
  }
  
  trait DescribeVTLDevicesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * An opaque string that indicates the position at which the VTL devices that were fetched for description ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL devices to describe, this field does not appear in the response.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
      */
    var VTLDevices: js.UndefOr[VTLDevices] = js.undefined
  }
  
  trait DescribeWorkingStorageInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DescribeWorkingStorageOutput extends js.Object {
    /**
      * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
      */
    var DiskIds: js.UndefOr[DiskIds] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
      */
    var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined
    /**
      * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
      */
    var WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined
  }
  
  trait DetachVolumeInput extends js.Object {
    /**
      * Set to true to forcibly remove the iSCSI connection of the target volume and detach the volume. The default is false. If this value is set to false, you must manually disconnect the iSCSI connection from the target volume.
      */
    var ForceDetach: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait DetachVolumeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume that was detached.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait DeviceiSCSIAttributes extends js.Object {
    /**
      * Indicates whether mutual CHAP is enabled for the iSCSI target.
      */
    var ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The network interface identifier of the VTL device.
      */
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
    /**
      * The port used to communicate with iSCSI VTL device targets.
      */
    var NetworkInterfacePort: js.UndefOr[integer] = js.undefined
    /**
      * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or media changer target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
  }
  
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait DisableGatewayOutput extends js.Object {
    /**
      * The unique Amazon Resource Name (ARN) of the disabled gateway.
      */
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait Disk extends js.Object {
    /**
      * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId. 
      */
    var DiskAllocationResource: js.UndefOr[java.lang.String] = js.undefined
    var DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined
    var DiskAttributeList: js.UndefOr[DiskAttributeList] = js.undefined
    /**
      * The unique device ID or other distinguishing data that identifies a local disk.
      */
    var DiskId: js.UndefOr[DiskId] = js.undefined
    /**
      * The device node of a local disk as assigned by the virtualization environment.
      */
    var DiskNode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The path of a local disk in the gateway virtual machine (VM).
      */
    var DiskPath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The local disk size in bytes.
      */
    var DiskSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * A value that represents the status of a local disk.
      */
    var DiskStatus: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait FileShareInfo extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    var FileShareId: js.UndefOr[FileShareId] = js.undefined
    var FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined
    var FileShareType: js.UndefOr[FileShareType] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait GatewayInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
      */
    var GatewayId: js.UndefOr[GatewayId] = js.undefined
    /**
      * The name of the gateway.
      */
    var GatewayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The state of the gateway. Valid Values: DISABLED or ACTIVE
      */
    var GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined
    /**
      * The type of the gateway.
      */
    var GatewayType: js.UndefOr[GatewayType] = js.undefined
  }
  
  trait JoinDomainInput extends js.Object {
    /**
      * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
      */
    var DomainControllers: js.UndefOr[Hosts] = js.undefined
    /**
      * The name of the domain that you want the gateway to join.
      */
    var DomainName: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DomainName
    /**
      * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The organizational unit (OU) is a container with an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
      */
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    /**
      * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
      */
    var Password: DomainUserPassword
    /**
      * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
      */
    var UserName: DomainUserName
  }
  
  trait JoinDomainOutput extends js.Object {
    /**
      * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
      */
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait ListFileSharesInput extends js.Object {
    /**
      * The Amazon resource Name (ARN) of the gateway whose file shares you want to list. If this field is not present, all file shares under your account are listed.
      */
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The maximum number of file shares to return in the response. The value must be an integer with a value greater than zero. Optional.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * Opaque pagination token returned from a previous ListFileShares operation. If present, Marker specifies where to continue the list from after a previous call to ListFileShares. Optional.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListFileSharesOutput extends js.Object {
    /**
      * An array of information about the file gateway's file shares. 
      */
    var FileShareInfoList: js.UndefOr[FileShareInfoList] = js.undefined
    /**
      * If the request includes Marker, the response returns that value in this field. 
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares. 
      */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListGatewaysInput extends js.Object {
    /**
      * Specifies that the list of gateways returned be limited to the specified number of items.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * An opaque string that indicates the position at which to begin the returned list of gateways.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListGatewaysOutput extends js.Object {
    /**
      * An array of GatewayInfo objects.
      */
    var Gateways: js.UndefOr[Gateways] = js.undefined
    /**
      * Use the marker in your next request to fetch the next set of gateways in the list. If there are no more gateways to list, this field does not appear in the response.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListLocalDisksInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait ListLocalDisksOutput extends js.Object {
    /**
      * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
      */
    var Disks: js.UndefOr[Disks] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait ListTagsForResourceInput extends js.Object {
    /**
      * Specifies that the list of tags returned be limited to the specified number of items.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * An opaque string that indicates the position at which to begin returning the list of tags.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource for which you want to list tags.
      */
    var ResourceARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ResourceARN
  }
  
  trait ListTagsForResourceOutput extends js.Object {
    /**
      * An opaque string that indicates the position at which to stop returning the list of tags.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * he Amazon Resource Name (ARN) of the resource for which you want to list tags.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * An array that contains the tags for the specified resource.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ListTapesInput extends js.Object {
    /**
      * An optional number limit for the tapes in the list returned by this call.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * A string that indicates the position at which to begin the returned list of tapes.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
  }
  
  trait ListTapesOutput extends js.Object {
    /**
      * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in the response body.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    var TapeInfos: js.UndefOr[TapeInfos] = js.undefined
  }
  
  trait ListVolumeInitiatorsInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes for the gateway.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait ListVolumeInitiatorsOutput extends js.Object {
    /**
      * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
      */
    var Initiators: js.UndefOr[Initiators] = js.undefined
  }
  
  trait ListVolumeRecoveryPointsInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait ListVolumeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * An array of VolumeRecoveryPointInfo objects.
      */
    var VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos] = js.undefined
  }
  
  trait ListVolumesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * Specifies that the list of volumes returned be limited to the specified number of items.
      */
    var Limit: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * A string that indicates the position at which to begin the returned list of volumes. Obtain the marker from the response of a previous List iSCSI Volumes request.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListVolumesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to list, this field does not appear in the response body.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * An array of VolumeInfo objects, where each object describes an iSCSI volume. If no volumes are defined for the gateway, then VolumeInfos is an empty array "[]".
      */
    var VolumeInfos: js.UndefOr[VolumeInfos] = js.undefined
  }
  
  trait NFSFileShareDefaults extends js.Object {
    /**
      * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all directories inside the file share. The default value is 0777.
      */
    var DirectoryMode: js.UndefOr[PermissionMode] = js.undefined
    /**
      * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file share. The default value is 0666. 
      */
    var FileMode: js.UndefOr[PermissionMode] = js.undefined
    /**
      * The default group ID for the file share (unless the files have another group ID specified). The default value is nfsnobody. 
      */
    var GroupId: js.UndefOr[PermissionId] = js.undefined
    /**
      * The default owner ID for files in the file share (unless the files have another owner ID specified). The default value is nfsnobody. 
      */
    var OwnerId: js.UndefOr[PermissionId] = js.undefined
  }
  
  trait NFSFileShareInfo extends js.Object {
    var ClientList: js.UndefOr[FileShareClientList] = js.undefined
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    var FileShareId: js.UndefOr[FileShareId] = js.undefined
    var FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
      */
    var KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    var LocationARN: js.UndefOr[LocationARN] = js.undefined
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    var Path: js.UndefOr[Path] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    var Role: js.UndefOr[Role] = js.undefined
    var Squash: js.UndefOr[Squash] = js.undefined
    /**
      * A list of up to 10 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait NetworkInterface extends js.Object {
    /**
      * The Internet Protocol version 4 (IPv4) address of the interface.
      */
    var Ipv4Address: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Internet Protocol version 6 (IPv6) address of the interface. Currently not supported.
      */
    var Ipv6Address: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Media Access Control (MAC) address of the interface.  This is currently unsupported and will not be returned in output. 
      */
    var MacAddress: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait NotifyWhenUploadedInput extends js.Object {
    var FileShareARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARN
  }
  
  trait NotifyWhenUploadedOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    var NotificationId: js.UndefOr[NotificationId] = js.undefined
  }
  
  trait RefreshCacheInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the file share you want to refresh.
      */
    var FileShareARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARN
    /**
      * A comma-separated list of the paths of folders to refresh in the cache. The default is ["/"]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If Recursive is set to "true", the entire S3 bucket that the file share has access to is refreshed.
      */
    var FolderList: js.UndefOr[FolderList] = js.undefined
    /**
      * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each folder that is listed in FolderList is recursively updated. Otherwise, subfolders listed in FolderList are not refreshed. Only objects that are in folders listed directly under FolderList are found and used for the update. The default is "true".
      */
    var Recursive: js.UndefOr[Boolean] = js.undefined
  }
  
  trait RefreshCacheOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    var NotificationId: js.UndefOr[NotificationId] = js.undefined
  }
  
  trait RemoveTagsFromResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
      */
    var ResourceARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.ResourceARN
    /**
      * The keys of the tags you want to remove from the specified resource. A tag is composed of a key/value pair.
      */
    var TagKeys: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TagKeys
  }
  
  trait RemoveTagsFromResourceOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource that the tags were removed from.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
  }
  
  trait ResetCacheInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait ResetCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait RetrieveTapeArchiveInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the ListGateways operation to return a list of gateways for your account and region. You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait RetrieveTapeArchiveOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the retrieved virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait RetrieveTapeRecoveryPointInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The Amazon Resource Name (ARN) of the virtual tape for which you want to retrieve the recovery point.
      */
    var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TapeARN
  }
  
  trait RetrieveTapeRecoveryPointOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape for which the recovery point was retrieved.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
  }
  
  trait SMBFileShareInfo extends js.Object {
    var Authentication: js.UndefOr[Authentication] = js.undefined
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    var FileShareId: js.UndefOr[FileShareId] = js.undefined
    var FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined
    /**
      * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
      */
    var KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    var LocationARN: js.UndefOr[LocationARN] = js.undefined
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    /**
      * The file share path used by the SMB client to identify the mount point.
      */
    var Path: js.UndefOr[Path] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    var Role: js.UndefOr[Role] = js.undefined
    /**
      * A list of up to 10 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
  }
  
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The password you want to set for your VM local console.
      */
    var LocalConsolePassword: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.LocalConsolePassword
  }
  
  trait SetLocalConsolePasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait SetSMBGuestPasswordInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
      */
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The password that you want to set for your SMB Server.
      */
    var Password: SMBGuestPassword
  }
  
  trait SetSMBGuestPasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait ShutdownGatewayInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait ShutdownGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait StartGatewayInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait StartGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait StorediSCSIVolume extends js.Object {
    /**
      * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
      */
    var CreatedDate: js.UndefOr[CreatedDate] = js.undefined
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.  Valid Values: true, false
      */
    var PreservedExistingData: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not included.
      */
    var SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
      */
    var TargetName: js.UndefOr[TargetName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the storage volume.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway. For more information, see Moving Your Volumes to a Different Gateway.
      */
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined
    /**
      * The ID of the local disk that was specified in the CreateStorediSCSIVolume operation.
      */
    var VolumeDiskId: js.UndefOr[DiskId] = js.undefined
    /**
      * The unique identifier of the volume, e.g. vol-AE4B946D.
      */
    var VolumeId: js.UndefOr[VolumeId] = js.undefined
    /**
      * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the stored volume is not restoring or bootstrapping.
      */
    var VolumeProgress: js.UndefOr[DoubleObject] = js.undefined
    /**
      * The size of the volume in bytes.
      */
    var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * One of the VolumeStatus values that indicates the state of the storage volume.
      */
    var VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined
    /**
      * One of the VolumeType enumeration values describing the type of the volume.
      */
    var VolumeType: js.UndefOr[VolumeType] = js.undefined
    /**
      * The size of the data stored on the volume in bytes.   This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
      */
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined
    /**
      * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
      */
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * Tag key (String). The key can't start with aws:. 
      */
    var Key: TagKey
    /**
      * Value of the tag key.
      */
    var Value: TagValue
  }
  
  trait Tape extends js.Object {
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
      */
    var PoolId: js.UndefOr[PoolId] = js.undefined
    /**
      * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
      */
    var Progress: js.UndefOr[DoubleObject] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
    /**
      * The barcode that identifies a specific virtual tape.
      */
    var TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined
    /**
      * The date the virtual tape was created.
      */
    var TapeCreatedDate: js.UndefOr[Time] = js.undefined
    /**
      * The size, in bytes, of the virtual tape capacity.
      */
    var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
    /**
      * The current state of the virtual tape.
      */
    var TapeStatus: js.UndefOr[TapeStatus] = js.undefined
    /**
      * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
      */
    var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
    /**
      * The virtual tape library (VTL) device that the virtual tape is associated with.
      */
    var VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined
  }
  
  trait TapeArchive extends js.Object {
    /**
      * The time that the archiving of the virtual tape was completed. The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
      */
    var CompletionTime: js.UndefOr[Time] = js.undefined
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class that is associated with the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
      */
    var PoolId: js.UndefOr[PoolId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to. The virtual tape is retrieved from the virtual tape shelf (VTS).
      */
    var RetrievedTo: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an archived virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
    /**
      * The barcode that identifies the archived virtual tape.
      */
    var TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined
    /**
      * The date the virtual tape was created.
      */
    var TapeCreatedDate: js.UndefOr[Time] = js.undefined
    /**
      * The size, in bytes, of the archived virtual tape.
      */
    var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
    /**
      * The current state of the archived virtual tape.
      */
    var TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined
    /**
      * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
      */
    var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
  }
  
  trait TapeInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and region.
      */
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
      */
    var PoolId: js.UndefOr[PoolId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of a virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
    /**
      * The barcode that identifies a specific virtual tape.
      */
    var TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined
    /**
      * The size, in bytes, of a virtual tape.
      */
    var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
    /**
      * The status of the tape.
      */
    var TapeStatus: js.UndefOr[TapeStatus] = js.undefined
  }
  
  trait TapeRecoveryPointInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the virtual tape.
      */
    var TapeARN: js.UndefOr[TapeARN] = js.undefined
    /**
      * The time when the point-in-time view of the virtual tape was replicated for later recovery. The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
      */
    var TapeRecoveryPointTime: js.UndefOr[Time] = js.undefined
    /**
      * The size, in bytes, of the virtual tapes to recover.
      */
    var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
    /**
      * The status of the virtual tapes.
      */
    var TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Activates the gateway you previously deployed on your host. In the activation process, you specify information such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account; for more information, see UpdateGatewayInformation.  You must turn on the gateway VM before you can activate your gateway. 
      */
    def activateGateway(): awsDashSdkLib.libRequestMod.Request[ActivateGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activateGateway(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivateGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivateGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Activates the gateway you previously deployed on your host. In the activation process, you specify information such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account; for more information, see UpdateGatewayInformation.  You must turn on the gateway VM before you can activate your gateway. 
      */
    def activateGateway(params: ActivateGatewayInput): awsDashSdkLib.libRequestMod.Request[ActivateGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activateGateway(
      params: ActivateGatewayInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivateGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivateGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached volume, tape and file gateway type (see Storage Gateway Concepts). In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or more disk IDs that you want to configure as cache.
      */
    def addCache(): awsDashSdkLib.libRequestMod.Request[AddCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addCache(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddCacheOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached volume, tape and file gateway type (see Storage Gateway Concepts). In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or more disk IDs that you want to configure as cache.
      */
    def addCache(params: AddCacheInput): awsDashSdkLib.libRequestMod.Request[AddCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addCache(
      params: AddCacheInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddCacheOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team. Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway resources:   Storage gateways of all types   Storage volumes   Virtual tapes   NFS and SMB file shares   You can create a maximum of 10 tags for each resource. Virtual tapes and storage volumes that are recovered to a new gateway maintain their tags.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team. Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway resources:   Storage gateways of all types   Storage volumes   Virtual tapes   NFS and SMB file shares   You can create a maximum of 10 tags for each resource. Virtual tapes and storage volumes that are recovered to a new gateway maintain their tags.
      */
    def addTagsToResource(params: AddTagsToResourceInput): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported for the stored volume, cached volume and tape gateway types. In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and one or more disk IDs that you want to configure as upload buffer.
      */
    def addUploadBuffer(): awsDashSdkLib.libRequestMod.Request[AddUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addUploadBuffer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddUploadBufferOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported for the stored volume, cached volume and tape gateway types. In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and one or more disk IDs that you want to configure as upload buffer.
      */
    def addUploadBuffer(params: AddUploadBufferInput): awsDashSdkLib.libRequestMod.Request[AddUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addUploadBuffer(
      params: AddUploadBufferInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddUploadBufferOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use AddUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to add upload buffer to a stored volume gateway.  In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and one or more disk IDs that you want to configure as working storage.
      */
    def addWorkingStorage(): awsDashSdkLib.libRequestMod.Request[AddWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addWorkingStorage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddWorkingStorageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use AddUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to add upload buffer to a stored volume gateway.  In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and one or more disk IDs that you want to configure as working storage.
      */
    def addWorkingStorage(params: AddWorkingStorageInput): awsDashSdkLib.libRequestMod.Request[AddWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addWorkingStorage(
      params: AddWorkingStorageInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddWorkingStorageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
      */
    def attachVolume(): awsDashSdkLib.libRequestMod.Request[AttachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
      */
    def attachVolume(params: AttachVolumeInput): awsDashSdkLib.libRequestMod.Request[AttachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachVolume(
      params: AttachVolumeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated. This operation is only supported in the tape gateway type.
      */
    def cancelArchival(): awsDashSdkLib.libRequestMod.Request[CancelArchivalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelArchival(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelArchivalOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelArchivalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated. This operation is only supported in the tape gateway type.
      */
    def cancelArchival(params: CancelArchivalInput): awsDashSdkLib.libRequestMod.Request[CancelArchivalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelArchival(
      params: CancelArchivalInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelArchivalOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelArchivalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
      */
    def cancelRetrieval(): awsDashSdkLib.libRequestMod.Request[CancelRetrievalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelRetrieval(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelRetrievalOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelRetrievalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
      */
    def cancelRetrieval(params: CancelRetrievalInput): awsDashSdkLib.libRequestMod.Request[CancelRetrievalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelRetrieval(
      params: CancelRetrievalInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelRetrievalOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelRetrievalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached volume gateway type.  Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache operation to add cache storage to a gateway.   In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target. Optionally, you can provide the ARN for an existing volume as the SourceVolumeARN for this cached volume, which creates an exact copy of the existing volume’s latest recovery point. The VolumeSizeInBytes value must be equal to or larger than the size of the copied volume, in bytes.
      */
    def createCachediSCSIVolume(): awsDashSdkLib.libRequestMod.Request[CreateCachediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCachediSCSIVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCachediSCSIVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCachediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached volume gateway type.  Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache operation to add cache storage to a gateway.   In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target. Optionally, you can provide the ARN for an existing volume as the SourceVolumeARN for this cached volume, which creates an exact copy of the existing volume’s latest recovery point. The VolumeSizeInBytes value must be equal to or larger than the size of the copied volume, in bytes.
      */
    def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput): awsDashSdkLib.libRequestMod.Request[CreateCachediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCachediSCSIVolume(
      params: CreateCachediSCSIVolumeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCachediSCSIVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCachediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS interface. This operation is only supported for file gateways.  File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share. Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateway does not support creating hard or symbolic links on a file share. 
      */
    def createNFSFileShare(): awsDashSdkLib.libRequestMod.Request[CreateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNFSFileShare(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNFSFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS interface. This operation is only supported for file gateways.  File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share. Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateway does not support creating hard or symbolic links on a file share. 
      */
    def createNFSFileShare(params: CreateNFSFileShareInput): awsDashSdkLib.libRequestMod.Request[CreateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNFSFileShare(
      params: CreateNFSFileShareInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNFSFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB interface. This operation is only supported for file gateways.  File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
      */
    def createSMBFileShare(): awsDashSdkLib.libRequestMod.Request[CreateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSMBFileShare(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSMBFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB interface. This operation is only supported for file gateways.  File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
      */
    def createSMBFileShare(params: CreateSMBFileShareInput): awsDashSdkLib.libRequestMod.Request[CreateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSMBFileShare(
      params: CreateSMBFileShareInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSMBFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a snapshot of a volume. AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad-hoc basis. This API enables you to take ad-hoc snapshot. For more information, see Editing a Snapshot Schedule. In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or DeleteSnapshot in the EC2 API reference.   Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note on the Welcome page. 
      */
    def createSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a snapshot of a volume. AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad-hoc basis. This API enables you to take ad-hoc snapshot. For more information, see Editing a Snapshot Schedule. In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or DeleteSnapshot in the EC2 API reference.   Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note on the Welcome page. 
      */
    def createSnapshot(params: CreateSnapshotInput): awsDashSdkLib.libRequestMod.Request[CreateSnapshotOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      params: CreateSnapshotInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached volume gateway type. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot. To get a list of volume recovery point for cached volume gateway, use ListVolumeRecoveryPoints. In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume by providing its Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute Cloud API Reference. 
      */
    def createSnapshotFromVolumeRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotFromVolumeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotFromVolumeRecoveryPoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotFromVolumeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotFromVolumeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached volume gateway type. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot. To get a list of volume recovery point for cached volume gateway, use ListVolumeRecoveryPoints. In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume by providing its Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a volume from a snapshot.  To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute Cloud API Reference. 
      */
    def createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[CreateSnapshotFromVolumeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotFromVolumeRecoveryPoint(
      params: CreateSnapshotFromVolumeRecoveryPointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotFromVolumeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotFromVolumeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type. The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty gateway volume, then any existing data on the disk is erased. In the request you must specify the gateway and the disk information on which you are creating the volume. In response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
      */
    def createStorediSCSIVolume(): awsDashSdkLib.libRequestMod.Request[CreateStorediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStorediSCSIVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStorediSCSIVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStorediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type. The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty gateway volume, then any existing data on the disk is erased. In the request you must specify the gateway and the disk information on which you are creating the volume. In response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
      */
    def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput): awsDashSdkLib.libRequestMod.Request[CreateStorediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStorediSCSIVolume(
      params: CreateStorediSCSIVolumeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStorediSCSIVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStorediSCSIVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on deleted tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache operation to add cache storage to a gateway. 
      */
    def createTapeWithBarcode(): awsDashSdkLib.libRequestMod.Request[CreateTapeWithBarcodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTapeWithBarcode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTapeWithBarcodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTapeWithBarcodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on deleted tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache operation to add cache storage to a gateway. 
      */
    def createTapeWithBarcode(params: CreateTapeWithBarcodeInput): awsDashSdkLib.libRequestMod.Request[CreateTapeWithBarcodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTapeWithBarcode(
      params: CreateTapeWithBarcodeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTapeWithBarcodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTapeWithBarcodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache operation to add cache storage to a gateway.  
      */
    def createTapes(): awsDashSdkLib.libRequestMod.Request[CreateTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTapes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTapesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation is only supported in the tape gateway type.  Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache operation to add cache storage to a gateway.  
      */
    def createTapes(params: CreateTapesInput): awsDashSdkLib.libRequestMod.Request[CreateTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTapes(
      params: CreateTapesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTapesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def deleteBandwidthRateLimit(): awsDashSdkLib.libRequestMod.Request[DeleteBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBandwidthRateLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput): awsDashSdkLib.libRequestMod.Request[DeleteBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBandwidthRateLimit(
      params: DeleteBandwidthRateLimitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator pair.
      */
    def deleteChapCredentials(): awsDashSdkLib.libRequestMod.Request[DeleteChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChapCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator pair.
      */
    def deleteChapCredentials(params: DeleteChapCredentialsInput): awsDashSdkLib.libRequestMod.Request[DeleteChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChapCredentials(
      params: DeleteChapCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a file share from a file gateway. This operation is only supported for file gateways.
      */
    def deleteFileShare(): awsDashSdkLib.libRequestMod.Request[DeleteFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFileShare(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a file share from a file gateway. This operation is only supported for file gateways.
      */
    def deleteFileShare(params: DeleteFileShareInput): awsDashSdkLib.libRequestMod.Request[DeleteFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFileShare(
      params: DeleteFileShareInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from your host computer. After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next step is to remove it from your environment.  You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription, you can delete your snapshots using the Amazon EC2 console. For more information, see the  AWS Storage Gateway Detail Page.  
      */
    def deleteGateway(): awsDashSdkLib.libRequestMod.Request[DeleteGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGateway(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from your host computer. After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next step is to remove it from your environment.  You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription, you can delete your snapshots using the Amazon EC2 console. For more information, see the  AWS Storage Gateway Detail Page.  
      */
    def deleteGateway(params: DeleteGatewayInput): awsDashSdkLib.libRequestMod.Request[DeleteGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGateway(
      params: DeleteGatewayInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot of a volume. You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to delete a snapshot schedule for a volume. For more information, see Working with Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.  To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API Reference. 
      */
    def deleteSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot of a volume. You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to delete a snapshot schedule for a volume. For more information, see Working with Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.  To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API Reference. 
      */
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotSchedule(
      params: DeleteSnapshotScheduleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
      */
    def deleteTape(): awsDashSdkLib.libRequestMod.Request[DeleteTapeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTape(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTapeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTapeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
      */
    def deleteTape(params: DeleteTapeInput): awsDashSdkLib.libRequestMod.Request[DeleteTapeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTape(
      params: DeleteTapeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTapeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTapeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the tape gateway type.
      */
    def deleteTapeArchive(): awsDashSdkLib.libRequestMod.Request[DeleteTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTapeArchive(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTapeArchiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the tape gateway type.
      */
    def deleteTapeArchive(params: DeleteTapeArchiveInput): awsDashSdkLib.libRequestMod.Request[DeleteTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTapeArchive(
      params: DeleteTapeArchiveInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTapeArchiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You can reuse the local disk to create another storage volume.  Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query snapshots on the volume you are deleting and check the snapshot status. For more information, go to DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference. In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
      */
    def deleteVolume(): awsDashSdkLib.libRequestMod.Request[DeleteVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You can reuse the local disk to create another storage volume.  Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query snapshots on the volume you are deleting and check the snapshot status. For more information, go to DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference. In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
      */
    def deleteVolume(params: DeleteVolumeInput): awsDashSdkLib.libRequestMod.Request[DeleteVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVolume(
      params: DeleteVolumeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth rate limiting is in effect. This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def describeBandwidthRateLimit(): awsDashSdkLib.libRequestMod.Request[DescribeBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBandwidthRateLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth rate limiting is in effect. This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput): awsDashSdkLib.libRequestMod.Request[DescribeBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBandwidthRateLimit(
      params: DescribeBandwidthRateLimitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and file gateway types. The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and used.
      */
    def describeCache(): awsDashSdkLib.libRequestMod.Request[DescribeCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCache(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and file gateway types. The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and used.
      */
    def describeCache(params: DescribeCacheInput): awsDashSdkLib.libRequestMod.Request[DescribeCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCache(
      params: DescribeCacheInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the gateway volumes specified in the request. This operation is only supported in the cached volume gateway types. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume Amazon Resource Name (ARN).
      */
    def describeCachediSCSIVolumes(): awsDashSdkLib.libRequestMod.Request[DescribeCachediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCachediSCSIVolumes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCachediSCSIVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCachediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the gateway volumes specified in the request. This operation is only supported in the cached volume gateway types. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume Amazon Resource Name (ARN).
      */
    def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput): awsDashSdkLib.libRequestMod.Request[DescribeCachediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCachediSCSIVolumes(
      params: DescribeCachediSCSIVolumesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCachediSCSIVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCachediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified iSCSI target, one for each target-initiator pair.
      */
    def describeChapCredentials(): awsDashSdkLib.libRequestMod.Request[DescribeChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChapCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified iSCSI target, one for each target-initiator pair.
      */
    def describeChapCredentials(params: DescribeChapCredentialsInput): awsDashSdkLib.libRequestMod.Request[DescribeChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChapCredentials(
      params: DescribeChapCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def describeGatewayInformation(): awsDashSdkLib.libRequestMod.Request[DescribeGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGatewayInformation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGatewayInformationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def describeGatewayInformation(params: DescribeGatewayInformationInput): awsDashSdkLib.libRequestMod.Request[DescribeGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGatewayInformation(
      params: DescribeGatewayInformationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGatewayInformationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone.
      */
    def describeMaintenanceStartTime(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceStartTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceStartTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone.
      */
    def describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceStartTime(
      params: DescribeMaintenanceStartTimeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceStartTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is only supported for file gateways.
      */
    def describeNFSFileShares(): awsDashSdkLib.libRequestMod.Request[DescribeNFSFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNFSFileShares(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNFSFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNFSFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is only supported for file gateways.
      */
    def describeNFSFileShares(params: DescribeNFSFileSharesInput): awsDashSdkLib.libRequestMod.Request[DescribeNFSFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNFSFileShares(
      params: DescribeNFSFileSharesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNFSFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNFSFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is only supported for file gateways.
      */
    def describeSMBFileShares(): awsDashSdkLib.libRequestMod.Request[DescribeSMBFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSMBFileShares(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSMBFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSMBFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is only supported for file gateways.
      */
    def describeSMBFileShares(params: DescribeSMBFileSharesInput): awsDashSdkLib.libRequestMod.Request[DescribeSMBFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSMBFileShares(
      params: DescribeSMBFileSharesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSMBFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSMBFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is only supported for file gateways.
      */
    def describeSMBSettings(): awsDashSdkLib.libRequestMod.Request[DescribeSMBSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSMBSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSMBSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSMBSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is only supported for file gateways.
      */
    def describeSMBSettings(params: DescribeSMBSettingsInput): awsDashSdkLib.libRequestMod.Request[DescribeSMBSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSMBSettings(
      params: DescribeSMBSettingsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSMBSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSMBSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the cached volume and stored volume types.
      */
    def describeSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the cached volume and stored volume types.
      */
    def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotSchedule(
      params: DescribeSnapshotScheduleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume ARNs. This operation is only supported in stored volume gateway type.
      */
    def describeStorediSCSIVolumes(): awsDashSdkLib.libRequestMod.Request[DescribeStorediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStorediSCSIVolumes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStorediSCSIVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStorediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by volume ARNs. This operation is only supported in stored volume gateway type.
      */
    def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput): awsDashSdkLib.libRequestMod.Request[DescribeStorediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStorediSCSIVolumes(
      params: DescribeStorediSCSIVolumesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStorediSCSIVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStorediSCSIVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only supported in the tape gateway type. If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual tapes found in the VTS associated with your account.
      */
    def describeTapeArchives(): awsDashSdkLib.libRequestMod.Request[DescribeTapeArchivesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapeArchives(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapeArchivesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapeArchivesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only supported in the tape gateway type. If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual tapes found in the VTS associated with your account.
      */
    def describeTapeArchives(params: DescribeTapeArchivesInput): awsDashSdkLib.libRequestMod.Request[DescribeTapeArchivesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapeArchives(
      params: DescribeTapeArchivesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapeArchivesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapeArchivesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of virtual tape recovery points that are available for the specified tape gateway. A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway. This operation is only supported in the tape gateway type.
      */
    def describeTapeRecoveryPoints(): awsDashSdkLib.libRequestMod.Request[DescribeTapeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapeRecoveryPoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapeRecoveryPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of virtual tape recovery points that are available for the specified tape gateway. A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway. This operation is only supported in the tape gateway type.
      */
    def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput): awsDashSdkLib.libRequestMod.Request[DescribeTapeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapeRecoveryPoints(
      params: DescribeTapeRecoveryPointsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapeRecoveryPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is not specified, returns a description of all virtual tapes associated with the specified gateway. This operation is only supported in the tape gateway type.
      */
    def describeTapes(): awsDashSdkLib.libRequestMod.Request[DescribeTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is not specified, returns a description of all virtual tapes associated with the specified gateway. This operation is only supported in the tape gateway type.
      */
    def describeTapes(params: DescribeTapesInput): awsDashSdkLib.libRequestMod.Request[DescribeTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTapes(
      params: DescribeTapesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTapesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume, cached volume and tape gateway types. The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload buffer space allocated and used.
      */
    def describeUploadBuffer(): awsDashSdkLib.libRequestMod.Request[DescribeUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUploadBuffer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUploadBufferOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume, cached volume and tape gateway types. The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload buffer space allocated and used.
      */
    def describeUploadBuffer(params: DescribeUploadBufferInput): awsDashSdkLib.libRequestMod.Request[DescribeUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUploadBuffer(
      params: DescribeUploadBufferInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUploadBufferOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUploadBufferOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS Storage Gateway returns VTL device information. This operation is only supported in the tape gateway type.
      */
    def describeVTLDevices(): awsDashSdkLib.libRequestMod.Request[DescribeVTLDevicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVTLDevices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVTLDevicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVTLDevicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS Storage Gateway returns VTL device information. This operation is only supported in the tape gateway type.
      */
    def describeVTLDevices(params: DescribeVTLDevicesInput): awsDashSdkLib.libRequestMod.Request[DescribeVTLDevicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVTLDevices(
      params: DescribeVTLDevicesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVTLDevicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVTLDevicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the working storage of a gateway. This operation is only supported in the stored volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use DescribeUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add upload buffer to a stored volume gateway.  The response includes disk IDs that are configured as working storage, and it includes the amount of working storage allocated and used.
      */
    def describeWorkingStorage(): awsDashSdkLib.libRequestMod.Request[DescribeWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkingStorage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkingStorageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the working storage of a gateway. This operation is only supported in the stored volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use DescribeUploadBuffer instead.  Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add upload buffer to a stored volume gateway.  The response includes disk IDs that are configured as working storage, and it includes the amount of working storage allocated and used.
      */
    def describeWorkingStorage(params: DescribeWorkingStorageInput): awsDashSdkLib.libRequestMod.Request[DescribeWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkingStorage(
      params: DescribeWorkingStorageInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkingStorageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkingStorageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
      */
    def detachVolume(): awsDashSdkLib.libRequestMod.Request[DetachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching and attaching a volume enables you to recover your data from one gateway to a different gateway without creating a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an Amazon EC2 instance.
      */
    def detachVolume(params: DetachVolumeInput): awsDashSdkLib.libRequestMod.Request[DetachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachVolume(
      params: DetachVolumeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachVolumeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachVolumeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged, you can disable the gateway so you can recover virtual tapes. Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported in the tape gateway type.  Once a gateway is disabled it cannot be enabled. 
      */
    def disableGateway(): awsDashSdkLib.libRequestMod.Request[DisableGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableGateway(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged, you can disable the gateway so you can recover virtual tapes. Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported in the tape gateway type.  Once a gateway is disabled it cannot be enabled. 
      */
    def disableGateway(params: DisableGatewayInput): awsDashSdkLib.libRequestMod.Request[DisableGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableGateway(
      params: DisableGatewayInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that support the SMB file protocol.
      */
    def joinDomain(): awsDashSdkLib.libRequestMod.Request[JoinDomainOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def joinDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ JoinDomainOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[JoinDomainOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that support the SMB file protocol.
      */
    def joinDomain(params: JoinDomainInput): awsDashSdkLib.libRequestMod.Request[JoinDomainOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def joinDomain(
      params: JoinDomainInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ JoinDomainOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[JoinDomainOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling user account. This operation is only supported for file gateways.
      */
    def listFileShares(): awsDashSdkLib.libRequestMod.Request[ListFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFileShares(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling user account. This operation is only supported for file gateways.
      */
    def listFileShares(params: ListFileSharesInput): awsDashSdkLib.libRequestMod.Request[ListFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFileShares(
      params: ListFileSharesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFileSharesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFileSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by gateway Amazon Resource Name (ARN). By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you to optionally reduce the number of gateways returned in a response. If you have more gateways than are returned in a response (that is, the response returns only a truncated list of your gateways), the response contains a marker that you can specify in your next request to fetch the next page of gateways.
      */
    def listGateways(): awsDashSdkLib.libRequestMod.Request[ListGatewaysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGateways(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGatewaysOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGatewaysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by gateway Amazon Resource Name (ARN). By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you to optionally reduce the number of gateways returned in a response. If you have more gateways than are returned in a response (that is, the response returns only a truncated list of your gateways), the response contains a marker that you can specify in your next request to fetch the next page of gateways.
      */
    def listGateways(params: ListGatewaysInput): awsDashSdkLib.libRequestMod.Request[ListGatewaysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGateways(
      params: ListGatewaysInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGatewaysOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGatewaysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource Name (ARN) of the gateway in the body of the request. The request returns a list of all disks, specifying which are configured as working storage, cache storage, or stored volume or not configured at all. The response includes a DiskStatus field. This field can have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway), or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
      */
    def listLocalDisks(): awsDashSdkLib.libRequestMod.Request[ListLocalDisksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLocalDisks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLocalDisksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLocalDisksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource Name (ARN) of the gateway in the body of the request. The request returns a list of all disks, specifying which are configured as working storage, cache storage, or stored volume or not configured at all. The response includes a DiskStatus field. This field can have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway), or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
      */
    def listLocalDisks(params: ListLocalDisksInput): awsDashSdkLib.libRequestMod.Request[ListLocalDisksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLocalDisks(
      params: ListLocalDisksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLocalDisksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLocalDisksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that have been added to the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway type.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that have been added to the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway type.
      */
    def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the operation lists all virtual tapes in both your VTL and VTS. This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can optionally specify the Limit parameter in the body to limit the number of tapes in the response. If the number of tapes returned in the response is truncated, the response includes a Marker element that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported in the tape gateway type.
      */
    def listTapes(): awsDashSdkLib.libRequestMod.Request[ListTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTapes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTapesOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the operation lists all virtual tapes in both your VTL and VTS. This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can optionally specify the Limit parameter in the body to limit the number of tapes in the response. If the number of tapes returned in the response is truncated, the response includes a Marker element that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported in the tape gateway type.
      */
    def listTapes(params: ListTapesInput): awsDashSdkLib.libRequestMod.Request[ListTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTapes(
      params: ListTapesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTapesOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTapesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
      */
    def listVolumeInitiators(): awsDashSdkLib.libRequestMod.Request[ListVolumeInitiatorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumeInitiators(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumeInitiatorsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumeInitiatorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
      */
    def listVolumeInitiators(params: ListVolumeInitiatorsInput): awsDashSdkLib.libRequestMod.Request[ListVolumeInitiatorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumeInitiators(
      params: ListVolumeInitiatorsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumeInitiatorsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumeInitiatorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway type. Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume. To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.
      */
    def listVolumeRecoveryPoints(): awsDashSdkLib.libRequestMod.Request[ListVolumeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumeRecoveryPoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumeRecoveryPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway type. Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume. To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.
      */
    def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput): awsDashSdkLib.libRequestMod.Request[ListVolumeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumeRecoveryPoints(
      params: ListVolumeRecoveryPointsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumeRecoveryPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumeRecoveryPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the DescribeCachediSCSIVolumes API. The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can optionally specify the Limit field in the body to limit the number of volumes in the response. If the number of volumes returned in the response is truncated, the response includes a Marker field. You can use this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only supported in the cached volume and stored volume gateway types.
      */
    def listVolumes(): awsDashSdkLib.libRequestMod.Request[ListVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the DescribeCachediSCSIVolumes API. The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can optionally specify the Limit field in the body to limit the number of volumes in the response. If the number of volumes returned in the response is truncated, the response includes a Marker field. You can use this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only supported in the cached volume and stored volume gateway types.
      */
    def listVolumes(params: ListVolumesInput): awsDashSdkLib.libRequestMod.Request[ListVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVolumes(
      params: ListVolumesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVolumesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVolumesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded to Amazon S3. AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file gateways. For more information, see Getting File Upload Notification in the Storage Gateway User Guide (https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification). 
      */
    def notifyWhenUploaded(): awsDashSdkLib.libRequestMod.Request[NotifyWhenUploadedOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def notifyWhenUploaded(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotifyWhenUploadedOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotifyWhenUploadedOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded to Amazon S3. AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file gateways. For more information, see Getting File Upload Notification in the Storage Gateway User Guide (https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification). 
      */
    def notifyWhenUploaded(params: NotifyWhenUploadedInput): awsDashSdkLib.libRequestMod.Request[NotifyWhenUploadedOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def notifyWhenUploaded(
      params: NotifyWhenUploadedInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotifyWhenUploadedOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotifyWhenUploadedOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations.
      */
    def refreshCache(): awsDashSdkLib.libRequestMod.Request[RefreshCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshCache(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations.
      */
    def refreshCache(params: RefreshCacheInput): awsDashSdkLib.libRequestMod.Request[RefreshCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshCache(
      params: RefreshCacheInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway types.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the specified resource. This operation is only supported in the cached volume, stored volume and tape gateway types.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks. This operation is only supported in the cached volume and tape types.  If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must configure at least one new cache disk for your gateway to function properly. 
      */
    def resetCache(): awsDashSdkLib.libRequestMod.Request[ResetCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetCache(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks. This operation is only supported in the cached volume and tape types.  If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must configure at least one new cache disk for your gateway to function properly. 
      */
    def resetCache(params: ResetCacheInput): awsDashSdkLib.libRequestMod.Request[ResetCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetCache(
      params: ResetCacheInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway, even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway type. Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must archive the tape again before you can retrieve it to another gateway. This operation is only supported in the tape gateway type.
      */
    def retrieveTapeArchive(): awsDashSdkLib.libRequestMod.Request[RetrieveTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveTapeArchive(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveTapeArchiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway, even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway type. Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must archive the tape again before you can retrieve it to another gateway. This operation is only supported in the tape gateway type.
      */
    def retrieveTapeArchive(params: RetrieveTapeArchiveInput): awsDashSdkLib.libRequestMod.Request[RetrieveTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveTapeArchive(
      params: RetrieveTapeArchiveInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveTapeArchiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveTapeArchiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway type. A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.  The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be retrieved to only a tape gateway. There is no charge for retrieving recovery points. 
      */
    def retrieveTapeRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[RetrieveTapeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveTapeRecoveryPoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveTapeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveTapeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway type. A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.  The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be retrieved to only a tape gateway. There is no charge for retrieving recovery points. 
      */
    def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[RetrieveTapeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveTapeRecoveryPoint(
      params: RetrieveTapeRecoveryPointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveTapeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveTapeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the password for your VM local console. When you log in to the local console for the first time, you log in to the VM with the default credentials. We recommend that you set a new password. You don't need to know the default password to set a new password.
      */
    def setLocalConsolePassword(): awsDashSdkLib.libRequestMod.Request[SetLocalConsolePasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLocalConsolePassword(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLocalConsolePasswordOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLocalConsolePasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the password for your VM local console. When you log in to the local console for the first time, you log in to the VM with the default credentials. We recommend that you set a new password. You don't need to know the default password to set a new password.
      */
    def setLocalConsolePassword(params: SetLocalConsolePasswordInput): awsDashSdkLib.libRequestMod.Request[SetLocalConsolePasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLocalConsolePassword(
      params: SetLocalConsolePasswordInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLocalConsolePasswordOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLocalConsolePasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the password for the guest user smbguest. The smbguest user is the user when the authentication method for the file share is set to GuestAccess.
      */
    def setSMBGuestPassword(): awsDashSdkLib.libRequestMod.Request[SetSMBGuestPasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setSMBGuestPassword(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSMBGuestPasswordOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSMBGuestPasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the password for the guest user smbguest. The smbguest user is the user when the authentication method for the file share is set to GuestAccess.
      */
    def setSMBGuestPassword(params: SetSMBGuestPasswordInput): awsDashSdkLib.libRequestMod.Request[SetSMBGuestPasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setSMBGuestPassword(
      params: SetSMBGuestPasswordInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSMBGuestPasswordOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSMBGuestPasswordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in the body of your request. The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the host VM.  If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to avoid unpredictable conditions.  After the gateway is shutdown, you cannot call any other API except StartGateway, DescribeGatewayInformation, and ListGateways. For more information, see ActivateGateway. Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.  When you make a shutdown request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to shut down. You can call the DescribeGatewayInformation API to check the status. For more information, see ActivateGateway.  If do not intend to use the gateway again, you must delete the gateway (using DeleteGateway) to no longer pay software charges associated with the gateway.
      */
    def shutdownGateway(): awsDashSdkLib.libRequestMod.Request[ShutdownGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def shutdownGateway(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ShutdownGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ShutdownGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in the body of your request. The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the host VM.  If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to avoid unpredictable conditions.  After the gateway is shutdown, you cannot call any other API except StartGateway, DescribeGatewayInformation, and ListGateways. For more information, see ActivateGateway. Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.  When you make a shutdown request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to shut down. You can call the DescribeGatewayInformation API to check the status. For more information, see ActivateGateway.  If do not intend to use the gateway again, you must delete the gateway (using DeleteGateway) to no longer pay software charges associated with the gateway.
      */
    def shutdownGateway(params: ShutdownGatewayInput): awsDashSdkLib.libRequestMod.Request[ShutdownGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def shutdownGateway(
      params: ShutdownGatewayInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ShutdownGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ShutdownGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can then make other API calls, your applications can read from or write to the gateway's storage volumes and you will be able to take snapshot backups.  When you make a request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any additional API calls. For more information, see ActivateGateway.  To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def startGateway(): awsDashSdkLib.libRequestMod.Request[StartGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startGateway(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can then make other API calls, your applications can read from or write to the gateway's storage volumes and you will be able to take snapshot backups.  When you make a request, you will get a 200 OK success response immediately. However, it might take some time for the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any additional API calls. For more information, see ActivateGateway.  To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def startGateway(params: StartGatewayInput): awsDashSdkLib.libRequestMod.Request[StartGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startGateway(
      params: StartGatewayInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartGatewayOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartGatewayOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains. By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have any limitations on its bandwidth usage and could potentially use the maximum available bandwidth. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def updateBandwidthRateLimit(): awsDashSdkLib.libRequestMod.Request[UpdateBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBandwidthRateLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains. By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have any limitations on its bandwidth usage and could potentially use the maximum available bandwidth. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
      */
    def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput): awsDashSdkLib.libRequestMod.Request[UpdateBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBandwidthRateLimit(
      params: UpdateBandwidthRateLimitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBandwidthRateLimitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBandwidthRateLimitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By default, a gateway does not have CHAP enabled; however, for added security, you might use it.  When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect with the new credentials. 
      */
    def updateChapCredentials(): awsDashSdkLib.libRequestMod.Request[UpdateChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChapCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By default, a gateway does not have CHAP enabled; however, for added security, you might use it.  When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect with the new credentials. 
      */
    def updateChapCredentials(params: UpdateChapCredentialsInput): awsDashSdkLib.libRequestMod.Request[UpdateChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChapCredentials(
      params: UpdateChapCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChapCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChapCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.  For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway name. However, changing the name of the gateway has no effect on the gateway's ARN. 
      */
    def updateGatewayInformation(): awsDashSdkLib.libRequestMod.Request[UpdateGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGatewayInformation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGatewayInformationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.  For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway name. However, changing the name of the gateway has no effect on the gateway's ARN. 
      */
    def updateGatewayInformation(params: UpdateGatewayInformationInput): awsDashSdkLib.libRequestMod.Request[UpdateGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGatewayInformation(
      params: UpdateGatewayInformationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGatewayInformationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayInformationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in the STATE_RUNNING state.   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively. 
      */
    def updateGatewaySoftwareNow(): awsDashSdkLib.libRequestMod.Request[UpdateGatewaySoftwareNowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGatewaySoftwareNow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGatewaySoftwareNowOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGatewaySoftwareNowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in the STATE_RUNNING state.   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively. 
      */
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): awsDashSdkLib.libRequestMod.Request[UpdateGatewaySoftwareNowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGatewaySoftwareNow(
      params: UpdateGatewaySoftwareNowInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGatewaySoftwareNowOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGatewaySoftwareNowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a gateway's weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway's time zone.
      */
    def updateMaintenanceStartTime(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceStartTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceStartTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a gateway's weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway's time zone.
      */
    def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceStartTime(
      params: UpdateMaintenanceStartTimeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceStartTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceStartTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.  To leave a file share field unchanged, set the corresponding input field to null.  Updates the following file share setting:   Default storage class for your S3 bucket   Metadata defaults for your S3 bucket   Allowed NFS clients for your file share   Squash settings   Write status of your file share    To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported in file gateways. 
      */
    def updateNFSFileShare(): awsDashSdkLib.libRequestMod.Request[UpdateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNFSFileShare(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNFSFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.  To leave a file share field unchanged, set the corresponding input field to null.  Updates the following file share setting:   Default storage class for your S3 bucket   Metadata defaults for your S3 bucket   Allowed NFS clients for your file share   Squash settings   Write status of your file share    To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported in file gateways. 
      */
    def updateNFSFileShare(params: UpdateNFSFileShareInput): awsDashSdkLib.libRequestMod.Request[UpdateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNFSFileShare(
      params: UpdateNFSFileShareInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNFSFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNFSFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Server Message Block (SMB) file share.  To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported for file gateways.   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
      */
    def updateSMBFileShare(): awsDashSdkLib.libRequestMod.Request[UpdateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSMBFileShare(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSMBFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Server Message Block (SMB) file share.  To leave a file share field unchanged, set the corresponding input field to null. This operation is only supported for file gateways.   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share. Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  File gateways don't support creating hard or symbolic links on a file share. 
      */
    def updateSMBFileShare(params: UpdateSMBFileShareInput): awsDashSdkLib.libRequestMod.Request[UpdateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSMBFileShare(
      params: UpdateSMBFileShareInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSMBFileShareOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSMBFileShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached volume and stored volume gateway types. The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You can use this API to change the snapshot schedule configured for the volume. In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
      */
    def updateSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[UpdateSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSnapshotSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached volume and stored volume gateway types. The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You can use this API to change the snapshot schedule configured for the volume. In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
      */
    def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput): awsDashSdkLib.libRequestMod.Request[UpdateSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSnapshotSchedule(
      params: UpdateSnapshotScheduleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSnapshotScheduleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSnapshotScheduleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium changer type for the tape gateway. This operation enables you to select a different type of medium changer after a tape gateway is activated. This operation is only supported in the tape gateway type.
      */
    def updateVTLDeviceType(): awsDashSdkLib.libRequestMod.Request[UpdateVTLDeviceTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVTLDeviceType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVTLDeviceTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVTLDeviceTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium changer type for the tape gateway. This operation enables you to select a different type of medium changer after a tape gateway is activated. This operation is only supported in the tape gateway type.
      */
    def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput): awsDashSdkLib.libRequestMod.Request[UpdateVTLDeviceTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVTLDeviceType(
      params: UpdateVTLDeviceTypeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVTLDeviceTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVTLDeviceTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateBandwidthRateLimitInput extends js.Object {
    /**
      * The average download bandwidth rate limit in bits per second.
      */
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
    /**
      * The average upload bandwidth rate limit in bits per second.
      */
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait UpdateBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait UpdateChapCredentialsInput extends js.Object {
    /**
      * The iSCSI initiator that connects to the target.
      */
    var InitiatorName: IqnName
    /**
      * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
      */
    var SecretToAuthenticateInitiator: ChapSecret
    /**
      * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client). Byte constraints: Minimum bytes of 12. Maximum bytes of 16.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
      */
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return the TargetARN for specified VolumeARN.
      */
    var TargetARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.TargetARN
  }
  
  trait UpdateChapCredentialsOutput extends js.Object {
    /**
      * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
      */
    var InitiatorName: js.UndefOr[IqnName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
  }
  
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    var GatewayName: js.UndefOr[GatewayName] = js.undefined
    /**
      * A value that indicates the time zone of the gateway.
      */
    var GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined
  }
  
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The name you configured for your gateway.
      */
    var GatewayName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
  }
  
  trait UpdateGatewaySoftwareNowOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    /**
      * The maintenance start time day of the week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
      */
    var DayOfWeek: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DayOfWeek
    var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.GatewayARN
    /**
      * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
      */
    var HourOfDay: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.HourOfDay
    /**
      * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
      */
    var MinuteOfHour: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.MinuteOfHour
  }
  
  trait UpdateMaintenanceStartTimeOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  }
  
  trait UpdateNFSFileShareInput extends js.Object {
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks.
      */
    var ClientList: js.UndefOr[FileShareClientList] = js.undefined
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the file share to be updated. 
      */
    var FileShareARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARN
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional. 
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * The default values for the file share. Optional.
      */
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
      */
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    /**
      * The user mapped to anonymous user. Valid options are the following:    RootSquash - Only root is mapped to anonymous user.    NoSquash - No one is mapped to anonymous user    AllSquash - Everyone is mapped to anonymous user.  
      */
    var Squash: js.UndefOr[Squash] = js.undefined
  }
  
  trait UpdateNFSFileShareOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the updated file share. 
      */
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  }
  
  trait UpdateSMBFileShareInput extends js.Object {
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
      */
    var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
      */
    var FileShareARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.FileShareARN
    /**
      * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
      */
    var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined
    /**
      * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
      */
    var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
      */
    var KMSKey: js.UndefOr[KMSKey] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
      */
    var ObjectACL: js.UndefOr[ObjectACL] = js.undefined
    /**
      * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
      */
    var ReadOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that sets the access control list permission for objects in the Amazon S3 bucket that a file gateway puts objects into. The default value is private.
      */
    var RequesterPays: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
      */
    var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
  }
  
  trait UpdateSMBFileShareOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the updated SMB file share. 
      */
    var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  }
  
  trait UpdateSnapshotScheduleInput extends js.Object {
    /**
      * Optional description of the snapshot that overwrites the existing description.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Frequency of snapshots. Specify the number of hours between snapshots.
      */
    var RecurrenceInHours: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.RecurrenceInHours
    /**
      * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
      */
    var StartAt: HourOfDay
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
      */
    var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VolumeARN
  }
  
  trait UpdateSnapshotScheduleOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  }
  
  trait UpdateVTLDeviceTypeInput extends js.Object {
    /**
      * The type of medium changer you want to select.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
      */
    var DeviceType: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.DeviceType
    /**
      * The Amazon Resource Name (ARN) of the medium changer you want to select.
      */
    var VTLDeviceARN: awsDashSdkLib.clientsStoragegatewayMod.StorageGatewayNs.VTLDeviceARN
  }
  
  trait UpdateVTLDeviceTypeOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the medium changer you have selected.
      */
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined
  }
  
  trait VTLDevice extends js.Object {
    /**
      * A list of iSCSI information about a VTL device.
      */
    var DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes] = js.undefined
    /**
      * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
      */
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined
    /**
      * Specifies the model number of device that the VTL device emulates.
      */
    var VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier] = js.undefined
    /**
      * Specifies the type of device that the VTL device emulates.
      */
    var VTLDeviceType: js.UndefOr[VTLDeviceType] = js.undefined
    /**
      * Specifies the vendor of the device that the VTL device object emulates.
      */
    var VTLDeviceVendor: js.UndefOr[VTLDeviceVendor] = js.undefined
  }
  
  trait VolumeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    /**
      * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
      */
    var GatewayId: js.UndefOr[GatewayId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB   Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * One of the VolumeStatus values that indicates the state of the storage volume. 
      */
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined
    /**
      * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
      */
    var VolumeId: js.UndefOr[VolumeId] = js.undefined
    /**
      * The size of the volume in bytes. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
      */
    var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * One of the VolumeType enumeration values describing the type of the volume.
      */
    var VolumeType: js.UndefOr[VolumeType] = js.undefined
  }
  
  trait VolumeRecoveryPointInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the volume target.
      */
    var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    /**
      * The time the recovery point was taken.
      */
    var VolumeRecoveryPointTime: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The size of the volume in bytes.
      */
    var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * The size of the data stored on the volume in bytes.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
      */
    var VolumeUsageInBytes: js.UndefOr[long] = js.undefined
  }
  
  trait VolumeiSCSIAttributes extends js.Object {
    /**
      * Indicates whether mutual CHAP is enabled for the iSCSI target.
      */
    var ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The logical disk number.
      */
    var LunNumber: js.UndefOr[PositiveIntObject] = js.undefined
    /**
      * The network interface identifier.
      */
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
    /**
      * The port used to communicate with iSCSI targets.
      */
    var NetworkInterfacePort: js.UndefOr[integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the volume target.
      */
    var TargetARN: js.UndefOr[TargetARN] = js.undefined
  }
  
  trait _FileShareType extends js.Object
  
  trait _ObjectACL extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ActivationKey = java.lang.String
  type Authentication = java.lang.String
  type BandwidthDownloadRateLimit = scala.Double
  type BandwidthType = java.lang.String
  type BandwidthUploadRateLimit = scala.Double
  type Boolean = scala.Boolean
  type CachediSCSIVolumes = js.Array[CachediSCSIVolume]
  type ChapCredentials = js.Array[ChapInfo]
  type ChapSecret = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type CreatedDate = stdLib.Date
  type DayOfWeek = scala.Double
  type Description = java.lang.String
  type DeviceType = java.lang.String
  type DiskAllocationType = java.lang.String
  type DiskAttribute = java.lang.String
  type DiskAttributeList = js.Array[DiskAttribute]
  type DiskId = java.lang.String
  type DiskIds = js.Array[DiskId]
  type Disks = js.Array[Disk]
  type DomainName = java.lang.String
  type DomainUserName = java.lang.String
  type DomainUserPassword = java.lang.String
  type DoubleObject = scala.Double
  type FileShareARN = java.lang.String
  type FileShareARNList = js.Array[FileShareARN]
  type FileShareClientList = js.Array[IPV4AddressCIDR]
  type FileShareId = java.lang.String
  type FileShareInfoList = js.Array[FileShareInfo]
  type FileShareStatus = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NFS
    - awsDashSdkLib.awsDashSdkLibStrings.SMB
    - java.lang.String
  */
  type FileShareType = _FileShareType | java.lang.String
  type FileShareUser = java.lang.String
  type FileShareUserList = js.Array[FileShareUser]
  type Folder = java.lang.String
  type FolderList = js.Array[Folder]
  type GatewayARN = java.lang.String
  type GatewayId = java.lang.String
  type GatewayName = java.lang.String
  type GatewayNetworkInterfaces = js.Array[NetworkInterface]
  type GatewayOperationalState = java.lang.String
  type GatewayState = java.lang.String
  type GatewayTimezone = java.lang.String
  type GatewayType = java.lang.String
  type Gateways = js.Array[GatewayInfo]
  type Host = java.lang.String
  type Hosts = js.Array[Host]
  type HourOfDay = scala.Double
  type IPV4AddressCIDR = java.lang.String
  type Initiator = java.lang.String
  type Initiators = js.Array[Initiator]
  type IqnName = java.lang.String
  type KMSKey = java.lang.String
  type LastSoftwareUpdate = java.lang.String
  type LocalConsolePassword = java.lang.String
  type LocationARN = java.lang.String
  type Marker = java.lang.String
  type MediumChangerType = java.lang.String
  type MinuteOfHour = scala.Double
  type NFSFileShareInfoList = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId = java.lang.String
  type NextUpdateAvailabilityDate = java.lang.String
  type NotificationId = java.lang.String
  type NumTapesToCreate = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - java.lang.String
  */
  type ObjectACL = _ObjectACL | java.lang.String
  type OrganizationalUnit = java.lang.String
  type Path = java.lang.String
  type PermissionId = scala.Double
  type PermissionMode = java.lang.String
  type PoolId = java.lang.String
  type PositiveIntObject = scala.Double
  type RecurrenceInHours = scala.Double
  type RegionId = java.lang.String
  type ResourceARN = java.lang.String
  type Role = java.lang.String
  type SMBFileShareInfoList = js.Array[SMBFileShareInfo]
  type SMBGuestPassword = java.lang.String
  type SnapshotDescription = java.lang.String
  type SnapshotId = java.lang.String
  type Squash = java.lang.String
  type StorageClass = java.lang.String
  type StorediSCSIVolumes = js.Array[StorediSCSIVolume]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TapeARN = java.lang.String
  type TapeARNs = js.Array[TapeARN]
  type TapeArchiveStatus = java.lang.String
  type TapeArchives = js.Array[TapeArchive]
  type TapeBarcode = java.lang.String
  type TapeBarcodePrefix = java.lang.String
  type TapeDriveType = java.lang.String
  type TapeInfos = js.Array[TapeInfo]
  type TapeRecoveryPointInfos = js.Array[TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus = java.lang.String
  type TapeSize = scala.Double
  type TapeStatus = java.lang.String
  type TapeUsage = scala.Double
  type Tapes = js.Array[Tape]
  type TargetARN = java.lang.String
  type TargetName = java.lang.String
  type Time = stdLib.Date
  type VTLDeviceARN = java.lang.String
  type VTLDeviceARNs = js.Array[VTLDeviceARN]
  type VTLDeviceProductIdentifier = java.lang.String
  type VTLDeviceType = java.lang.String
  type VTLDeviceVendor = java.lang.String
  type VTLDevices = js.Array[VTLDevice]
  type VolumeARN = java.lang.String
  type VolumeARNs = js.Array[VolumeARN]
  type VolumeAttachmentStatus = java.lang.String
  type VolumeId = java.lang.String
  type VolumeInfos = js.Array[VolumeInfo]
  type VolumeRecoveryPointInfos = js.Array[VolumeRecoveryPointInfo]
  type VolumeStatus = java.lang.String
  type VolumeType = java.lang.String
  type VolumeUsedInBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-06-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type double = scala.Double
  type integer = scala.Double
  type long = scala.Double
}

