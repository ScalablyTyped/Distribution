package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Storage extends js.Object {
  /**
    * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance in Best Practices for Managing AWS Access Keys.
    */
  var AWSAccessKeyId: js.UndefOr[String] = js.undefined
  /**
    * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * The beginning of the file name of the AMI.
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
    */
  var UploadPolicy: js.UndefOr[_Blob] = js.undefined
  /**
    * The signature of the JSON document.
    */
  var UploadPolicySignature: js.UndefOr[String] = js.undefined
}

object S3Storage {
  @scala.inline
  def apply(
    AWSAccessKeyId: String = null,
    Bucket: String = null,
    Prefix: String = null,
    UploadPolicy: _Blob = null,
    UploadPolicySignature: String = null
  ): S3Storage = {
    val __obj = js.Dynamic.literal()
    if (AWSAccessKeyId != null) __obj.updateDynamic("AWSAccessKeyId")(AWSAccessKeyId)
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (UploadPolicy != null) __obj.updateDynamic("UploadPolicy")(UploadPolicy.asInstanceOf[js.Any])
    if (UploadPolicySignature != null) __obj.updateDynamic("UploadPolicySignature")(UploadPolicySignature)
    __obj.asInstanceOf[S3Storage]
  }
}

