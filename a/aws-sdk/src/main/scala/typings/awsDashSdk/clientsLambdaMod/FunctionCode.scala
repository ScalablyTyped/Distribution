package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCode extends js.Object {
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

object FunctionCode {
  @scala.inline
  def apply(
    S3Bucket: S3Bucket = null,
    S3Key: S3Key = null,
    S3ObjectVersion: S3ObjectVersion = null,
    ZipFile: _Blob = null
  ): FunctionCode = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion)
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCode]
  }
}

