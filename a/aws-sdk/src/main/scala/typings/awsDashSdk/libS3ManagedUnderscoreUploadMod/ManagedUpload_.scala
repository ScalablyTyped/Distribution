package typings.awsDashSdk.libS3ManagedUnderscoreUploadMod

import typings.awsDashSdk.awsDashSdkStrings.httpUploadProgress
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.ManagedUploadOptions
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.Progress
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.SendData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
@js.native
class ManagedUpload_ protected () extends js.Object {
  /**
    * Creates a managed upload object with a set of configuration options.
    */
  def this(options: ManagedUploadOptions) = this()
  /**
    * Aborts a managed upload, including all concurrent upload requests.
    */
  def abort(): Unit = js.native
  /**
    * Adds a listener that is triggered when theuploader has uploaded more data.
    *
    * @param {string} event - httpUploadProgress: triggered when the uploader has uploaded more data.
    * @param {function} listener - Callback to run when the uploader has uploaded more data.
    */
  @JSName("on")
  def on_httpUploadProgress(event: httpUploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): js.Any = js.native
  /**
    * Returns a 'thenable' promise.
    */
  def promise(): js.Promise[SendData] = js.native
  /**
    * Initiates the managed upload for the payload.
    */
  def send(): Unit = js.native
  def send(callback: js.Function2[/* err */ AWSError, /* data */ SendData, Unit]): Unit = js.native
}

