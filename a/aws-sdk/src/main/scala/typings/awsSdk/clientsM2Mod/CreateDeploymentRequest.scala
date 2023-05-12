package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * The application identifier.
    */
  var applicationId: Identifier
  
  /**
    * The version of the application to deploy.
    */
  var applicationVersion: Version
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a deployment. The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response. The service also handles deleting the clientToken after it expires. 
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the runtime environment where you want to deploy this application.
    */
  var environmentId: Identifier
}
object CreateDeploymentRequest {
  
  inline def apply(applicationId: Identifier, applicationVersion: Version, environmentId: Identifier): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
