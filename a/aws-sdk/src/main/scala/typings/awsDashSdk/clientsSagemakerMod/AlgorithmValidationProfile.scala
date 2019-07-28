package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmValidationProfile extends js.Object {
  /**
    * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ProfileName: EntityName
  /**
    * The TrainingJobDefinition object that describes the training job that Amazon SageMaker runs to validate your algorithm.
    */
  var TrainingJobDefinition: typings.awsDashSdk.clientsSagemakerMod.TrainingJobDefinition
  /**
    * The TransformJobDefinition object that describes the transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var TransformJobDefinition: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TransformJobDefinition] = js.undefined
}

object AlgorithmValidationProfile {
  @scala.inline
  def apply(
    ProfileName: EntityName,
    TrainingJobDefinition: TrainingJobDefinition,
    TransformJobDefinition: TransformJobDefinition = null
  ): AlgorithmValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName, TrainingJobDefinition = TrainingJobDefinition)
    if (TransformJobDefinition != null) __obj.updateDynamic("TransformJobDefinition")(TransformJobDefinition)
    __obj.asInstanceOf[AlgorithmValidationProfile]
  }
}

