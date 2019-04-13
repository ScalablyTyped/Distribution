package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "S3")
@js.native
object S3Ns extends js.Object {
  @js.native
  class ManagedUpload protected ()
    extends awsDashSdkLib.clientsAllMod.S3Ns.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
  }
  
  @js.native
  class PresignedPost ()
    extends awsDashSdkLib.clientsAllMod.S3Ns.PresignedPost
  
  /* static members */
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
  
}

