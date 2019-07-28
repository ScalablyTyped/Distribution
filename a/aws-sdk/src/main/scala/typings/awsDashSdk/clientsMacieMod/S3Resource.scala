package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Resource extends js.Object {
  /**
    * The name of the S3 bucket.
    */
  var bucketName: BucketName
  /**
    * The prefix of the S3 bucket. 
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object S3Resource {
  @scala.inline
  def apply(bucketName: BucketName, prefix: Prefix = null): S3Resource = {
    val __obj = js.Dynamic.literal(bucketName = bucketName)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[S3Resource]
  }
}

