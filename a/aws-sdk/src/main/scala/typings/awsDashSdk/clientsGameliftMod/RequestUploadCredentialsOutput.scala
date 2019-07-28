package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestUploadCredentialsOutput extends js.Object {
  /**
    * Amazon S3 path and key, identifying where the game build files are stored.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  /**
    * AWS credentials required when uploading a game build to the storage location. These credentials have a limited lifespan and are valid only for the build they were issued for.
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
}

object RequestUploadCredentialsOutput {
  @scala.inline
  def apply(StorageLocation: S3Location = null, UploadCredentials: AwsCredentials = null): RequestUploadCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation)
    if (UploadCredentials != null) __obj.updateDynamic("UploadCredentials")(UploadCredentials)
    __obj.asInstanceOf[RequestUploadCredentialsOutput]
  }
}

