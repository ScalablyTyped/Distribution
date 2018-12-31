package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/s3", "ManagedUpload")
@js.native
class ManagedUpload protected ()
  extends awsDashSdkLib.clientsS3Mod.S3Ns.ManagedUpload {
  /**
    * Creates a managed upload object with a set of configuration options.
    */
  def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
}

@JSImport("aws-sdk/clients/s3", "ManagedUpload")
@js.native
object ManagedUpload extends js.Object {
  /**
    * Default value: 10000
    */
  var maxTotalParts: scala.Double = js.native
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  var minPartSize: scala.Double = js.native
}

