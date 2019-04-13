package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Destination extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  /**
    * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object S3Destination {
  @scala.inline
  def apply(bucketName: BucketName = null, prefix: Prefix = null): S3Destination = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[S3Destination]
  }
}

