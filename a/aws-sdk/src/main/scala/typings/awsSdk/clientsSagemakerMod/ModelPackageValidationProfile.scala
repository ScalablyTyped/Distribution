package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageValidationProfile extends StObject {
  
  /**
    * The name of the profile for the model package.
    */
  var ProfileName: EntityName
  
  /**
    * The TransformJobDefinition object that describes the transform job used for the validation of the model package.
    */
  var TransformJobDefinition: typings.awsSdk.clientsSagemakerMod.TransformJobDefinition
}
object ModelPackageValidationProfile {
  
  inline def apply(ProfileName: EntityName, TransformJobDefinition: TransformJobDefinition): ModelPackageValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TransformJobDefinition = TransformJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageValidationProfile]
  }
  
  extension [Self <: ModelPackageValidationProfile](x: Self) {
    
    inline def setProfileName(value: EntityName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setTransformJobDefinition(value: TransformJobDefinition): Self = StObject.set(x, "TransformJobDefinition", value.asInstanceOf[js.Any])
  }
}
