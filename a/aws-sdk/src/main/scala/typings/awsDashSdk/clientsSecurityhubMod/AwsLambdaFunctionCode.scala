package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionCode extends js.Object {
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionCode {
  @scala.inline
  def apply(
    S3Bucket: NonEmptyString = null,
    S3Key: NonEmptyString = null,
    S3ObjectVersion: NonEmptyString = null,
    ZipFile: NonEmptyString = null
  ): AwsLambdaFunctionCode = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion.asInstanceOf[js.Any])
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionCode]
  }
}

