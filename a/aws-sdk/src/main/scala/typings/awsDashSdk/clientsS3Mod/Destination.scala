package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object.
    */
  var AccessControlTranslation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AccessControlTranslation] = js.undefined
  /**
    * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by specifying the AccessControlTranslation property, this is the account ID of the destination bucket owner. For more information, see Cross-Region Replication Additional Configuration: Change Replica Owner in the Amazon Simple Storage Service Developer Guide.
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule. A replication configuration can replicate objects to only one destination bucket. If there are multiple rules in your replication configuration, all rules must specify the same destination bucket.
    */
  var Bucket: BucketName
  /**
    * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EncryptionConfiguration] = js.undefined
  /**
    *  The storage class to use when replicating objects, such as standard or reduced redundancy. By default, Amazon S3 uses the storage class of the source object to create the object replica.  For valid values, see the StorageClass element of the PUT Bucket replication action in the Amazon Simple Storage Service API Reference.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.undefined
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

