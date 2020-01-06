package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTaggingRequest extends js.Object {
  /**
    * The bucket name containing the object for which to get the tagging information.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Object key for which to get the tagging information.
    */
  var Key: ObjectKey = js.native
  /**
    * The versionId of the object for which to get the tagging information.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object GetObjectTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, VersionId: ObjectVersionId = null): GetObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingRequest]
  }
}

