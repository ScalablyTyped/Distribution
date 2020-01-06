package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SignedObject extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.native
  /**
    * Key name that uniquely identifies a signed code image in your bucket.
    */
  var key: js.UndefOr[typings.awsDashSdk.clientsSignerMod.key] = js.native
}

object S3SignedObject {
  @scala.inline
  def apply(bucketName: BucketName = null, key: key = null): S3SignedObject = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SignedObject]
  }
}

