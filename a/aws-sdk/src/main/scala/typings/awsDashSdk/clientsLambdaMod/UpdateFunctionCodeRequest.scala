package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFunctionCodeRequest extends js.Object {
  /**
    * Set to true to validate the request parameters and access permissions without modifying the function code.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsDashSdk.clientsLambdaMod.FunctionName
  /**
    * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.S3Bucket] = js.undefined
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.S3Key] = js.undefined
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.S3ObjectVersion] = js.undefined
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.undefined
}

object UpdateFunctionCodeRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Publish: js.UndefOr[Boolean] = js.undefined,
    RevisionId: String = null,
    S3Bucket: S3Bucket = null,
    S3Key: S3Key = null,
    S3ObjectVersion: S3ObjectVersion = null,
    ZipFile: _Blob = null
  ): UpdateFunctionCodeRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Publish)) __obj.updateDynamic("Publish")(Publish)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion)
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeRequest]
  }
}

