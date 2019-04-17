package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNFSFileShareInput extends js.Object {
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. 
    */
  var ClientList: js.UndefOr[FileShareClientList] = js.undefined
  /**
    * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
    */
  var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.ClientToken
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
    */
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
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
  var LocationARN: awsDashSdkLib.clientsStoragegatewayMod.LocationARN
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
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage. 
    */
  var Role: awsDashSdkLib.clientsStoragegatewayMod.Role
  /**
    * A value that maps a user to anonymous user. Valid options are the following:     RootSquash - Only root is mapped to anonymous user.    NoSquash - No one is mapped to anonymous user    AllSquash - Everyone is mapped to anonymous user.  
    */
  var Squash: js.UndefOr[Squash] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateNFSFileShareInput {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    LocationARN: LocationARN,
    Role: Role,
    ClientList: FileShareClientList = null,
    DefaultStorageClass: StorageClass = null,
    GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
    KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    NFSFileShareDefaults: NFSFileShareDefaults = null,
    ObjectACL: ObjectACL = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    RequesterPays: js.UndefOr[Boolean] = js.undefined,
    Squash: Squash = null,
    Tags: Tags = null
  ): CreateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken, GatewayARN = GatewayARN, LocationARN = LocationARN, Role = Role)
    if (ClientList != null) __obj.updateDynamic("ClientList")(ClientList)
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass)
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (NFSFileShareDefaults != null) __obj.updateDynamic("NFSFileShareDefaults")(NFSFileShareDefaults)
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays)
    if (Squash != null) __obj.updateDynamic("Squash")(Squash)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateNFSFileShareInput]
  }
}

