package typings.awsDashSdk.libServicesS3Mod

import typings.awsDashSdk.TypeofClassManagedUpload
import typings.awsDashSdk.clientsS3Mod.PresignedPost
import typings.awsDashSdk.clientsS3Mod.PutObjectRequest
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData
import typings.awsDashSdk.libS3PresignedUnderscorePostMod.PresignedPostNs.Params
import typings.awsDashSdk.libServiceMod.Service
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/s3", "S3Customizations")
@js.native
class S3Customizations () extends Service {
  /**
    * Get the form fields and target URL for direct POST uploading.
    */
  def createPresignedPost(params: Params): PresignedPost = js.native
  /**
    * Get the form fields and target URL for direct POST uploading.
    */
  def createPresignedPost(params: Params, callback: js.Function2[/* err */ Error, /* data */ PresignedPost, Unit]): Unit = js.native
  /**
    * Get a pre-signed URL for a given operation name.
    */
  def getSignedUrl(operation: String, params: js.Any): String = js.native
  /**
    * Get a pre-signed URL for a given operation name.
    */
  def getSignedUrl(operation: String, params: js.Any, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = js.native
  /**
    * Uploads an arbitrarily sized buffer, blob, or stream, using intelligent
    * concurrent handling of parts if the payload is large enough. You can
    * configure the concurrent queue size by setting `options`. Note that this
    * is the only operation for which the SDK can retry requests with stream
    * bodies.
    */
  def upload(params: PutObjectRequest): ManagedUpload = js.native
  def upload(params: PutObjectRequest, callback: js.Function2[/* err */ Error, /* data */ SendData, Unit]): ManagedUpload = js.native
  def upload(params: PutObjectRequest, options: ManagedUploadOptions): ManagedUpload = js.native
  def upload(
    params: PutObjectRequest,
    options: ManagedUploadOptions,
    callback: js.Function2[/* err */ Error, /* data */ SendData, Unit]
  ): ManagedUpload = js.native
}

/* static members */
@JSImport("aws-sdk/lib/services/s3", "S3Customizations")
@js.native
object S3Customizations extends js.Object {
  var ManagedUpload: TypeofClassManagedUpload = js.native
}

