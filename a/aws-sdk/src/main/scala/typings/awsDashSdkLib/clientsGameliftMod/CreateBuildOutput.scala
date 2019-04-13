package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBuildOutput extends js.Object {
  /**
    * The newly created build record, including a unique build ID and status. 
    */
  var Build: js.UndefOr[Build] = js.undefined
  /**
    * Amazon S3 location for your game build file, including bucket name and key.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  /**
    * This element is returned only when the operation is called without a storage location. It contains credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have a limited life span. To refresh these credentials, call RequestUploadCredentials. 
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
}

object CreateBuildOutput {
  @scala.inline
  def apply(Build: Build = null, StorageLocation: S3Location = null, UploadCredentials: AwsCredentials = null): CreateBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (Build != null) __obj.updateDynamic("Build")(Build)
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation)
    if (UploadCredentials != null) __obj.updateDynamic("UploadCredentials")(UploadCredentials)
    __obj.asInstanceOf[CreateBuildOutput]
  }
}

