package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3CopyObjectOperation extends js.Object {
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.native
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.native
  /**
    * 
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.native
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.native
  /**
    * 
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.native
  /**
    * 
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.native
  /**
    * 
    */
  var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.native
  /**
    * 
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.native
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.native
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.native
  /**
    * 
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.native
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.native
}

object S3CopyObjectOperation {
  @scala.inline
  def apply(
    AccessControlGrants: S3GrantList = null,
    CannedAccessControlList: S3CannedAccessControlList = null,
    MetadataDirective: S3MetadataDirective = null,
    ModifiedSinceConstraint: TimeStamp = null,
    NewObjectMetadata: S3ObjectMetadata = null,
    NewObjectTagging: S3TagSet = null,
    ObjectLockLegalHoldStatus: S3ObjectLockLegalHoldStatus = null,
    ObjectLockMode: S3ObjectLockMode = null,
    ObjectLockRetainUntilDate: TimeStamp = null,
    RedirectLocation: NonEmptyMaxLength2048String = null,
    RequesterPays: js.UndefOr[scala.Boolean] = js.undefined,
    SSEAwsKmsKeyId: KmsKeyArnString = null,
    StorageClass: S3StorageClass = null,
    TargetKeyPrefix: NonEmptyMaxLength1024String = null,
    TargetResource: S3BucketArnString = null,
    UnModifiedSinceConstraint: TimeStamp = null
  ): S3CopyObjectOperation = {
    val __obj = js.Dynamic.literal()
    if (AccessControlGrants != null) __obj.updateDynamic("AccessControlGrants")(AccessControlGrants.asInstanceOf[js.Any])
    if (CannedAccessControlList != null) __obj.updateDynamic("CannedAccessControlList")(CannedAccessControlList.asInstanceOf[js.Any])
    if (MetadataDirective != null) __obj.updateDynamic("MetadataDirective")(MetadataDirective.asInstanceOf[js.Any])
    if (ModifiedSinceConstraint != null) __obj.updateDynamic("ModifiedSinceConstraint")(ModifiedSinceConstraint.asInstanceOf[js.Any])
    if (NewObjectMetadata != null) __obj.updateDynamic("NewObjectMetadata")(NewObjectMetadata.asInstanceOf[js.Any])
    if (NewObjectTagging != null) __obj.updateDynamic("NewObjectTagging")(NewObjectTagging.asInstanceOf[js.Any])
    if (ObjectLockLegalHoldStatus != null) __obj.updateDynamic("ObjectLockLegalHoldStatus")(ObjectLockLegalHoldStatus.asInstanceOf[js.Any])
    if (ObjectLockMode != null) __obj.updateDynamic("ObjectLockMode")(ObjectLockMode.asInstanceOf[js.Any])
    if (ObjectLockRetainUntilDate != null) __obj.updateDynamic("ObjectLockRetainUntilDate")(ObjectLockRetainUntilDate.asInstanceOf[js.Any])
    if (RedirectLocation != null) __obj.updateDynamic("RedirectLocation")(RedirectLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays.asInstanceOf[js.Any])
    if (SSEAwsKmsKeyId != null) __obj.updateDynamic("SSEAwsKmsKeyId")(SSEAwsKmsKeyId.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (TargetKeyPrefix != null) __obj.updateDynamic("TargetKeyPrefix")(TargetKeyPrefix.asInstanceOf[js.Any])
    if (TargetResource != null) __obj.updateDynamic("TargetResource")(TargetResource.asInstanceOf[js.Any])
    if (UnModifiedSinceConstraint != null) __obj.updateDynamic("UnModifiedSinceConstraint")(UnModifiedSinceConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
}

