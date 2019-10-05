package typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
@js.native
object ^ extends js.Object {
  /**
    * Default value: 10000
    */
  var maxTotalParts: Double = js.native
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  var minPartSize: Double = js.native
}

