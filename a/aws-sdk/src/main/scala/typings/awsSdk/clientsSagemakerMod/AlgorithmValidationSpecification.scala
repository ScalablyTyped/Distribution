package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmValidationSpecification extends StObject {
  
  /**
    * An array of AlgorithmValidationProfile objects, each of which specifies a training job and batch transform job that SageMaker runs to validate your algorithm.
    */
  var ValidationProfiles: AlgorithmValidationProfiles
  
  /**
    * The IAM roles that SageMaker uses to run the training jobs.
    */
  var ValidationRole: RoleArn
}
object AlgorithmValidationSpecification {
  
  inline def apply(ValidationProfiles: AlgorithmValidationProfiles, ValidationRole: RoleArn): AlgorithmValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles.asInstanceOf[js.Any], ValidationRole = ValidationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmValidationSpecification]
  }
  
  extension [Self <: AlgorithmValidationSpecification](x: Self) {
    
    inline def setValidationProfiles(value: AlgorithmValidationProfiles): Self = StObject.set(x, "ValidationProfiles", value.asInstanceOf[js.Any])
    
    inline def setValidationProfilesVarargs(value: AlgorithmValidationProfile*): Self = StObject.set(x, "ValidationProfiles", js.Array(value*))
    
    inline def setValidationRole(value: RoleArn): Self = StObject.set(x, "ValidationRole", value.asInstanceOf[js.Any])
  }
}
