package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[Grants] = js.undefined
  /**
    * The name of the bucket where the restore results will be placed.
    */
  var BucketName: awsDashSdkLib.clientsS3Mod.BucketName
  /**
    * The canned ACL to apply to the restore results.
    */
  var CannedACL: js.UndefOr[ObjectCannedACL] = js.undefined
  /**
    * 
    */
  var Encryption: js.UndefOr[Encryption] = js.undefined
  /**
    * The prefix that is prepended to the restore results for this request.
    */
  var Prefix: LocationPrefix
  /**
    * The class of storage used to store the restore results.
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * The tag-set that is applied to the restore results.
    */
  var Tagging: js.UndefOr[Tagging] = js.undefined
  /**
    * A list of metadata to store with the restore results in S3.
    */
  var UserMetadata: js.UndefOr[UserMetadata] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(
    BucketName: BucketName,
    Prefix: LocationPrefix,
    AccessControlList: Grants = null,
    CannedACL: ObjectCannedACL = null,
    Encryption: Encryption = null,
    StorageClass: StorageClass = null,
    Tagging: Tagging = null,
    UserMetadata: UserMetadata = null
  ): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName, Prefix = Prefix)
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList)
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging)
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[S3Location]
  }
}

