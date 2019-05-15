package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMBFileShareInfo extends js.Object {
  /**
    * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.undefined
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
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  var Role: js.UndefOr[Role] = js.undefined
  /**
    * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission. For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html in the Storage Gateway User Guide.
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
}

object SMBFileShareInfo {
  @scala.inline
  def apply(
    AdminUserList: FileShareUserList = null,
    Authentication: Authentication = null,
    DefaultStorageClass: StorageClass = null,
    FileShareARN: FileShareARN = null,
    FileShareId: FileShareId = null,
    FileShareStatus: FileShareStatus = null,
    GatewayARN: GatewayARN = null,
    GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
    InvalidUserList: FileShareUserList = null,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    LocationARN: LocationARN = null,
    ObjectACL: ObjectACL = null,
    Path: Path = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    RequesterPays: js.UndefOr[Boolean] = js.undefined,
    Role: Role = null,
    SMBACLEnabled: js.UndefOr[Boolean] = js.undefined,
    Tags: Tags = null,
    ValidUserList: FileShareUserList = null
  ): SMBFileShareInfo = {
    val __obj = js.Dynamic.literal()
    if (AdminUserList != null) __obj.updateDynamic("AdminUserList")(AdminUserList)
    if (Authentication != null) __obj.updateDynamic("Authentication")(Authentication)
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass)
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    if (FileShareId != null) __obj.updateDynamic("FileShareId")(FileShareId)
    if (FileShareStatus != null) __obj.updateDynamic("FileShareStatus")(FileShareStatus)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled)
    if (InvalidUserList != null) __obj.updateDynamic("InvalidUserList")(InvalidUserList)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (LocationARN != null) __obj.updateDynamic("LocationARN")(LocationARN)
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (!js.isUndefined(SMBACLEnabled)) __obj.updateDynamic("SMBACLEnabled")(SMBACLEnabled)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (ValidUserList != null) __obj.updateDynamic("ValidUserList")(ValidUserList)
    __obj.asInstanceOf[SMBFileShareInfo]
  }
}

