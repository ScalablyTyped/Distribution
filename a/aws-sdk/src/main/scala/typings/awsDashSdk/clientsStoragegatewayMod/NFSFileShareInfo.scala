package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NFSFileShareInfo extends js.Object {
  var ClientList: js.UndefOr[FileShareClientList] = js.undefined
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  var FileShareARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
  var FileShareId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareId] = js.undefined
  var FileShareStatus: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareStatus] = js.undefined
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  var LocationARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.LocationARN] = js.undefined
  var NFSFileShareDefaults: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.NFSFileShareDefaults] = js.undefined
  var ObjectACL: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.ObjectACL] = js.undefined
  var Path: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Path] = js.undefined
  /**
    * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  var Role: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Role] = js.undefined
  var Squash: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Squash] = js.undefined
  /**
    * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
}

object NFSFileShareInfo {
  @scala.inline
  def apply(
    ClientList: FileShareClientList = null,
    DefaultStorageClass: StorageClass = null,
    FileShareARN: FileShareARN = null,
    FileShareId: FileShareId = null,
    FileShareStatus: FileShareStatus = null,
    GatewayARN: GatewayARN = null,
    GuessMIMETypeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    LocationARN: LocationARN = null,
    NFSFileShareDefaults: NFSFileShareDefaults = null,
    ObjectACL: ObjectACL = null,
    Path: Path = null,
    ReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    RequesterPays: js.UndefOr[scala.Boolean] = js.undefined,
    Role: Role = null,
    Squash: Squash = null,
    Tags: Tags = null
  ): NFSFileShareInfo = {
    val __obj = js.Dynamic.literal()
    if (ClientList != null) __obj.updateDynamic("ClientList")(ClientList)
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass)
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    if (FileShareId != null) __obj.updateDynamic("FileShareId")(FileShareId)
    if (FileShareStatus != null) __obj.updateDynamic("FileShareStatus")(FileShareStatus)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (LocationARN != null) __obj.updateDynamic("LocationARN")(LocationARN)
    if (NFSFileShareDefaults != null) __obj.updateDynamic("NFSFileShareDefaults")(NFSFileShareDefaults)
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Squash != null) __obj.updateDynamic("Squash")(Squash)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[NFSFileShareInfo]
  }
}

