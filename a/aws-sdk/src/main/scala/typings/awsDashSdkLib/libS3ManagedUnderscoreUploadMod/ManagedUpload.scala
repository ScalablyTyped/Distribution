package typings
package awsDashSdkLib.libS3ManagedUnderscoreUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
@js.native
class ManagedUpload protected () extends js.Object {
  /**
       * Creates a managed upload object with a set of configuration options.
       */
  def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
  /**
       * Aborts a managed upload, including all concurrent upload requests.
       */
  def abort(): scala.Unit = js.native
  /**
       * Adds a listener that is triggered when theuploader has uploaded more data.
       *
       * @param {string} event - httpUploadProgress: triggered when the uploader has uploaded more data.
       * @param {function} listener - Callback to run when the uploader has uploaded more data.
       */
  @JSName("on")
  def on_httpUploadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
    listener: js.Function1[
      /* progress */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.Progress, 
      scala.Unit
    ]
  ): js.Any = js.native
  /**
       * Returns a 'thenable' promise.
       */
  def promise(): js.Promise[awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData] = js.native
  /**
       * Initiates the managed upload for the payload.
       */
  def send(): scala.Unit = js.native
  /**
       * Initiates the managed upload for the payload.
       */
  def send(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

@JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
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

