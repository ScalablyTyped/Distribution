package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPackageValidationProfile extends js.Object {
  /**
    * The name of the profile for the model package.
    */
  var ProfileName: EntityName
  /**
    * The TransformJobDefinition object that describes the transform job used for the validation of the model package.
    */
  var TransformJobDefinition: typings.awsDashSdk.clientsSagemakerMod.TransformJobDefinition
}

object ModelPackageValidationProfile {
  @scala.inline
  def apply(ProfileName: EntityName, TransformJobDefinition: TransformJobDefinition): ModelPackageValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName, TransformJobDefinition = TransformJobDefinition)
  
    __obj.asInstanceOf[ModelPackageValidationProfile]
  }
}

