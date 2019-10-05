package typings.awsDashSdk.clientsS3Mod

import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.ManagedUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/s3", "ManagedUpload")
@js.native
class ManagedUpload protected ()
  extends typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload {
  /**
    * Creates a managed upload object with a set of configuration options.
    */
  def this(options: ManagedUploadOptions) = this()
}

/* static members */
@JSImport("aws-sdk/clients/s3", "ManagedUpload")
@js.native
object ManagedUpload extends js.Object {
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

