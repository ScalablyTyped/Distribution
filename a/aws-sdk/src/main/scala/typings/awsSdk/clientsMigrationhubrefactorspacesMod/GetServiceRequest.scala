package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * The ID of the environment.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The ID of the service.
    */
  var ServiceIdentifier: ServiceId
}
object GetServiceRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    ServiceIdentifier: ServiceId
  ): GetServiceRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], ServiceIdentifier = ServiceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceRequest]
  }
  
  extension [Self <: GetServiceRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceId): Self = StObject.set(x, "ServiceIdentifier", value.asInstanceOf[js.Any])
  }
}
