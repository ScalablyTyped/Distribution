package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * The Amazon S3 artifact bucket for an action's artifacts.
    */
  var bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The artifact name.
    */
  var key: js.UndefOr[S3Key] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(bucket: S3Bucket = null, key: S3Key = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[S3Location]
  }
}

