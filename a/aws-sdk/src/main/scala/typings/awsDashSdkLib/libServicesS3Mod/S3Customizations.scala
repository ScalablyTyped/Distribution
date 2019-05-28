package typings
package awsDashSdkLib.libServicesS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/s3", "S3Customizations")
@js.native
class S3Customizations ()
  extends awsDashSdkLib.libServiceMod.Service {
  /**
    * Get the form fields and target URL for direct POST uploading.
    */
  def createPresignedPost(params: awsDashSdkLib.libS3PresignedUnderscorePostMod.PresignedPostNs.Params): awsDashSdkLib.clientsS3Mod.PresignedPost = js.native
  /**
    * Get the form fields and target URL for direct POST uploading.
    */
  def createPresignedPost(
    params: awsDashSdkLib.libS3PresignedUnderscorePostMod.PresignedPostNs.Params,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* data */ awsDashSdkLib.clientsS3Mod.PresignedPost, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get a pre-signed URL for a given operation name.
    */
  def getSignedUrl(operation: java.lang.String, params: js.Any): java.lang.String = js.native
  /**
    * Get a pre-signed URL for a given operation name.
    */
  def getSignedUrl(
    operation: java.lang.String,
    params: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Uploads an arbitrarily sized buffer, blob, or stream, using intelligent
    * concurrent handling of parts if the payload is large enough. You can
    * configure the concurrent queue size by setting `options`. Note that this
    * is the only operation for which the SDK can retry requests with stream
    * bodies.
    */
  def upload(params: awsDashSdkLib.clientsS3Mod.PutObjectRequest): awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUpload = js.native
  def upload(
    params: awsDashSdkLib.clientsS3Mod.PutObjectRequest,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* data */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData, 
      scala.Unit
    ]
  ): awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUpload = js.native
  def upload(
    params: awsDashSdkLib.clientsS3Mod.PutObjectRequest,
    options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions
  ): awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUpload = js.native
  def upload(
    params: awsDashSdkLib.clientsS3Mod.PutObjectRequest,
    options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* data */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData, 
      scala.Unit
    ]
  ): awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUpload = js.native
}

/* static members */
@JSImport("aws-sdk/lib/services/s3", "S3Customizations")
@js.native
object S3Customizations extends js.Object {
  var ManagedUpload: awsDashSdkLib.TypeofClassManagedUpload = js.native
}

