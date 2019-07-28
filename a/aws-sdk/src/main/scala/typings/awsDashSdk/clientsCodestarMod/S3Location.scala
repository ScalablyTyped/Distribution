package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * The Amazon S3 object key where the source code files provided with the project request are stored.
    */
  var bucketKey: js.UndefOr[BucketKey] = js.undefined
  /**
    * The Amazon S3 bucket name where the source code files provided with the project request are stored.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(bucketKey: BucketKey = null, bucketName: BucketName = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucketKey != null) __obj.updateDynamic("bucketKey")(bucketKey)
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    __obj.asInstanceOf[S3Location]
  }
}

