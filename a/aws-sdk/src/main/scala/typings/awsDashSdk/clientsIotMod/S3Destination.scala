package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Destination extends js.Object {
  /**
    * The S3 bucket that contains the updated firmware.
    */
  var bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The S3 prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object S3Destination {
  @scala.inline
  def apply(bucket: S3Bucket = null, prefix: Prefix = null): S3Destination = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[S3Destination]
  }
}

