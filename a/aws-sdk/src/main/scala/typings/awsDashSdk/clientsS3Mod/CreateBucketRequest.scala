package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketRequest extends js.Object {
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.undefined
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var CreateBucketConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CreateBucketConfiguration] = js.undefined
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantFullControl] = js.undefined
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantRead] = js.undefined
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantReadACP] = js.undefined
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.
    */
  var GrantWrite: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantWrite] = js.undefined
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantWriteACP] = js.undefined
  /**
    * Specifies whether you want Amazon S3 object lock to be enabled for the new bucket.
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockEnabledForBucket] = js.undefined
}

object CreateBucketRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ACL: BucketCannedACL = null,
    CreateBucketConfiguration: CreateBucketConfiguration = null,
    GrantFullControl: GrantFullControl = null,
    GrantRead: GrantRead = null,
    GrantReadACP: GrantReadACP = null,
    GrantWrite: GrantWrite = null,
    GrantWriteACP: GrantWriteACP = null,
    ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket] = js.undefined
  ): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration)
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl)
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead)
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP)
    if (GrantWrite != null) __obj.updateDynamic("GrantWrite")(GrantWrite)
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP)
    if (!js.isUndefined(ObjectLockEnabledForBucket)) __obj.updateDynamic("ObjectLockEnabledForBucket")(ObjectLockEnabledForBucket)
    __obj.asInstanceOf[CreateBucketRequest]
  }
}

