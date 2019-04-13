package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * The S3 bucket.
    */
  var bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The S3 key.
    */
  var key: js.UndefOr[S3Key] = js.undefined
  /**
    * The S3 bucket version.
    */
  var version: js.UndefOr[S3Version] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(bucket: S3Bucket = null, key: S3Key = null, version: S3Version = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (key != null) __obj.updateDynamic("key")(key)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[S3Location]
  }
}

