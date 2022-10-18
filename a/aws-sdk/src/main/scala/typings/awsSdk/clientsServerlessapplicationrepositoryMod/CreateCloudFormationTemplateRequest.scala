package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCloudFormationTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.undefined
}
object CreateCloudFormationTemplateRequest {
  
  inline def apply(ApplicationId: string): CreateCloudFormationTemplateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationTemplateRequest]
  }
  
  extension [Self <: CreateCloudFormationTemplateRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
  }
}
