package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOperation extends js.Object {
  /**
    * Directs the specified job to invoke an AWS Lambda function on each object in the manifest.
    */
  var LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.undefined
  /**
    * Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.
    */
  var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.undefined
  /**
    * Directs the specified job to execute a PUT Object acl call on each object in the manifest.
    */
  var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.undefined
  /**
    * Directs the specified job to execute a PUT Copy object call on each object in the manifest.
    */
  var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.undefined
  /**
    * Directs the specified job to execute a PUT Object tagging call on each object in the manifest.
    */
  var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.undefined
}

object JobOperation {
  @scala.inline
  def apply(
    LambdaInvoke: LambdaInvokeOperation = null,
    S3InitiateRestoreObject: S3InitiateRestoreObjectOperation = null,
    S3PutObjectAcl: S3SetObjectAclOperation = null,
    S3PutObjectCopy: S3CopyObjectOperation = null,
    S3PutObjectTagging: S3SetObjectTaggingOperation = null
  ): JobOperation = {
    val __obj = js.Dynamic.literal()
    if (LambdaInvoke != null) __obj.updateDynamic("LambdaInvoke")(LambdaInvoke)
    if (S3InitiateRestoreObject != null) __obj.updateDynamic("S3InitiateRestoreObject")(S3InitiateRestoreObject)
    if (S3PutObjectAcl != null) __obj.updateDynamic("S3PutObjectAcl")(S3PutObjectAcl)
    if (S3PutObjectCopy != null) __obj.updateDynamic("S3PutObjectCopy")(S3PutObjectCopy)
    if (S3PutObjectTagging != null) __obj.updateDynamic("S3PutObjectTagging")(S3PutObjectTagging)
    __obj.asInstanceOf[JobOperation]
  }
}

