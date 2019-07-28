package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageLocationResultMessage extends js.Object {
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.S3Bucket] = js.undefined
}

object CreateStorageLocationResultMessage {
  @scala.inline
  def apply(S3Bucket: S3Bucket = null): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
}

