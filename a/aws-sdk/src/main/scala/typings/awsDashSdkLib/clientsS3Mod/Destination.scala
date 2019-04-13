package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * A container for information about access control for replicas.  Use this element only in a cross-account scenario where source and destination bucket owners are not the same to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. 
    */
  var AccessControlTranslation: js.UndefOr[AccessControlTranslation] = js.undefined
  /**
    * The account ID of the destination bucket. Currently, Amazon S3 verifies this value only if Access Control Translation is enabled.  In a cross-account scenario, if you change replica ownership to the AWS account that owns the destination bucket by adding the AccessControlTranslation element, this is the account ID of the owner of the destination bucket. 
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule.   If there are multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects to only one destination bucket. 
    */
  var Bucket: BucketName
  /**
    * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element. 
    */
  var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /**
    *  The class of storage used to store the object. By default Amazon S3 uses storage class of the source object when creating a replica. 
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
}

object Destination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    AccessControlTranslation: AccessControlTranslation = null,
    Account: AccountId = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    StorageClass: StorageClass = null
  ): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (AccessControlTranslation != null) __obj.updateDynamic("AccessControlTranslation")(AccessControlTranslation)
    if (Account != null) __obj.updateDynamic("Account")(Account)
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

