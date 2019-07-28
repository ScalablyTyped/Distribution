package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * Amazon S3 bucket name.
    */
  var bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * Amazon S3 bucket key.
    */
  var key: js.UndefOr[KeyName] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(bucket: BucketName = null, key: KeyName = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[S3Location]
  }
}

