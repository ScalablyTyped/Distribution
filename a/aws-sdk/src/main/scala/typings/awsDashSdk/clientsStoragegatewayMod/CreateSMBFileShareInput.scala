package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSMBFileShareInput extends js.Object {
  /**
    * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.undefined
  /**
    * The authentication method that users use to access the file share. Valid values are ActiveDirectory or GuestAccess. The default is ActiveDirectory.
    */
  var Authentication: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Authentication] = js.undefined
  /**
    * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
    */
  var ClientToken: typings.awsDashSdk.clientsStoragegatewayMod.ClientToken
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
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
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  /**
    * The ARN of the backed storage used for storing file data. 
    */
  var LocationARN: typings.awsDashSdk.clientsStoragegatewayMod.LocationARN
  /**
    * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
    */
  var ObjectACL: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.ObjectACL] = js.undefined
  /**
    * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage. 
    */
  var Role: typings.awsDashSdk.clientsStoragegatewayMod.Role
  /**
    * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file and directory permissions to the POSIX permissions. For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html in the Storage Gateway User Guide.
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
}

object CreateSMBFileShareInput {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    LocationARN: LocationARN,
    Role: Role,
    AdminUserList: FileShareUserList = null,
    Authentication: Authentication = null,
    DefaultStorageClass: StorageClass = null,
    GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
    InvalidUserList: FileShareUserList = null,
    KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    ObjectACL: ObjectACL = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    RequesterPays: js.UndefOr[Boolean] = js.undefined,
    SMBACLEnabled: js.UndefOr[Boolean] = js.undefined,
    Tags: Tags = null,
    ValidUserList: FileShareUserList = null
  ): CreateSMBFileShareInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken, GatewayARN = GatewayARN, LocationARN = LocationARN, Role = Role)
    if (AdminUserList != null) __obj.updateDynamic("AdminUserList")(AdminUserList)
    if (Authentication != null) __obj.updateDynamic("Authentication")(Authentication)
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass)
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled)
    if (InvalidUserList != null) __obj.updateDynamic("InvalidUserList")(InvalidUserList)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays)
    if (!js.isUndefined(SMBACLEnabled)) __obj.updateDynamic("SMBACLEnabled")(SMBACLEnabled)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (ValidUserList != null) __obj.updateDynamic("ValidUserList")(ValidUserList)
    __obj.asInstanceOf[CreateSMBFileShareInput]
  }
}

