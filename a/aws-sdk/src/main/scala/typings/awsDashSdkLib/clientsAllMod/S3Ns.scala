package typings
package awsDashSdkLib.clientsAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "S3")
@js.native
object S3Ns extends js.Object {
  @js.native
  class ManagedUpload protected ()
    extends awsDashSdkLib.clientsS3Mod.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
  }
  
  @js.native
  class PresignedPost ()
    extends awsDashSdkLib.clientsS3Mod.PresignedPost
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Types ()
    extends awsDashSdkLib.clientsS3Mod.Types {
    def this(options: awsDashSdkLib.clientsS3Mod.S3Ns.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
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
  
  @JSName("S3")
  @js.native
  object S3Ns extends js.Object {
    @js.native
    class ManagedUpload protected ()
      extends awsDashSdkLib.clientsS3Mod.S3Ns.ManagedUpload {
      /**
        * Creates a managed upload object with a set of configuration options.
        */
      def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
    }
    
    @js.native
    class PresignedPost ()
      extends awsDashSdkLib.clientsS3Mod.S3Ns.PresignedPost
    
    val TypesNs: this.type = js.native
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
  
}

