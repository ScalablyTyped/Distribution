package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Resource extends js.Object {
  /**
    * The name of the S3 bucket.
    */
  var bucketName: BucketName = js.native
  /**
    * The prefix of the S3 bucket. 
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3Resource {
  @scala.inline
  def apply(bucketName: BucketName, prefix: Prefix = null): S3Resource = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Resource]
  }
}

