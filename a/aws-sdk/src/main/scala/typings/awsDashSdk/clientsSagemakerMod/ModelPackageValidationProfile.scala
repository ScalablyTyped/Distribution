package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageValidationProfile extends js.Object {
  /**
    * The name of the profile for the model package.
    */
  var ProfileName: EntityName = js.native
  /**
    * The TransformJobDefinition object that describes the transform job used for the validation of the model package.
    */
  var TransformJobDefinition: typings.awsDashSdk.clientsSagemakerMod.TransformJobDefinition = js.native
}

object ModelPackageValidationProfile {
  @scala.inline
  def apply(ProfileName: EntityName, TransformJobDefinition: TransformJobDefinition): ModelPackageValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TransformJobDefinition = TransformJobDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelPackageValidationProfile]
  }
}

