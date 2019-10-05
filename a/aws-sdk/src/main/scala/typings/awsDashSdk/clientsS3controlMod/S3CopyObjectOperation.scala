package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3CopyObjectOperation extends js.Object {
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.undefined
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.undefined
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
  /**
    * 
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.undefined
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.undefined
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.undefined
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.undefined
  var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.undefined
  /**
    * 
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.undefined
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.undefined
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.undefined
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.undefined
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
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
    if (AccessControlGrants != null) __obj.updateDynamic("AccessControlGrants")(AccessControlGrants)
    if (CannedAccessControlList != null) __obj.updateDynamic("CannedAccessControlList")(CannedAccessControlList.asInstanceOf[js.Any])
    if (MetadataDirective != null) __obj.updateDynamic("MetadataDirective")(MetadataDirective.asInstanceOf[js.Any])
    if (ModifiedSinceConstraint != null) __obj.updateDynamic("ModifiedSinceConstraint")(ModifiedSinceConstraint)
    if (NewObjectMetadata != null) __obj.updateDynamic("NewObjectMetadata")(NewObjectMetadata)
    if (NewObjectTagging != null) __obj.updateDynamic("NewObjectTagging")(NewObjectTagging)
    if (ObjectLockLegalHoldStatus != null) __obj.updateDynamic("ObjectLockLegalHoldStatus")(ObjectLockLegalHoldStatus.asInstanceOf[js.Any])
    if (ObjectLockMode != null) __obj.updateDynamic("ObjectLockMode")(ObjectLockMode.asInstanceOf[js.Any])
    if (ObjectLockRetainUntilDate != null) __obj.updateDynamic("ObjectLockRetainUntilDate")(ObjectLockRetainUntilDate)
    if (RedirectLocation != null) __obj.updateDynamic("RedirectLocation")(RedirectLocation)
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays)
    if (SSEAwsKmsKeyId != null) __obj.updateDynamic("SSEAwsKmsKeyId")(SSEAwsKmsKeyId)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (TargetKeyPrefix != null) __obj.updateDynamic("TargetKeyPrefix")(TargetKeyPrefix)
    if (TargetResource != null) __obj.updateDynamic("TargetResource")(TargetResource)
    if (UnModifiedSinceConstraint != null) __obj.updateDynamic("UnModifiedSinceConstraint")(UnModifiedSinceConstraint)
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
}

