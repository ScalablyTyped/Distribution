package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmValidationSpecification extends js.Object {
  /**
    * An array of AlgorithmValidationProfile objects, each of which specifies a training job and batch transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var ValidationProfiles: AlgorithmValidationProfiles
  /**
    * The IAM roles that Amazon SageMaker uses to run the training jobs.
    */
  var ValidationRole: RoleArn
}

object AlgorithmValidationSpecification {
  @scala.inline
  def apply(ValidationProfiles: AlgorithmValidationProfiles, ValidationRole: RoleArn): AlgorithmValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles, ValidationRole = ValidationRole)
  
    __obj.asInstanceOf[AlgorithmValidationSpecification]
  }
}

