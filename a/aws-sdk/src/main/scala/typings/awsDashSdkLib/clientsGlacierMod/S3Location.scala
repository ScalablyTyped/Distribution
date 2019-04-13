package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[AccessControlPolicyList] = js.undefined
  /**
    * The name of the Amazon S3 bucket where the job results are stored.
    */
  var BucketName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The canned access control list (ACL) to apply to the job results.
    */
  var CannedACL: js.UndefOr[CannedACL] = js.undefined
  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  var Encryption: js.UndefOr[Encryption] = js.undefined
  /**
    * The prefix that is prepended to the results for this request.
    */
  var Prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The storage class used to store the job results.
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * The tag-set that is applied to the job results.
    */
  var Tagging: js.UndefOr[hashmap] = js.undefined
  /**
    * A map of metadata to store with the job results in Amazon S3.
    */
  var UserMetadata: js.UndefOr[hashmap] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(
    AccessControlList: AccessControlPolicyList = null,
    BucketName: java.lang.String = null,
    CannedACL: CannedACL = null,
    Encryption: Encryption = null,
    Prefix: java.lang.String = null,
    StorageClass: StorageClass = null,
    Tagging: hashmap = null,
    UserMetadata: hashmap = null
  ): S3Location = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList)
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName)
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging)
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[S3Location]
  }
}

