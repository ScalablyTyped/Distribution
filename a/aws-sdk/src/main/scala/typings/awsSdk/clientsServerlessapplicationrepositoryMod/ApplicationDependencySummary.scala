package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDependencySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the nested application.
    */
  var ApplicationId: string
  
  /**
    * The semantic version of the nested application.
    */
  var SemanticVersion: string
}
object ApplicationDependencySummary {
  
  inline def apply(ApplicationId: string, SemanticVersion: string): ApplicationDependencySummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDependencySummary]
  }
  
  extension [Self <: ApplicationDependencySummary](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
  }
}
