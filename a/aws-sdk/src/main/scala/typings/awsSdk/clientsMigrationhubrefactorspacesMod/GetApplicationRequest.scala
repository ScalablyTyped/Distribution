package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * The ID of the environment. 
    */
  var EnvironmentIdentifier: EnvironmentId
}
object GetApplicationRequest {
  
  inline def apply(ApplicationIdentifier: ApplicationId, EnvironmentIdentifier: EnvironmentId): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRequest]
  }
  
  extension [Self <: GetApplicationRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
  }
}
