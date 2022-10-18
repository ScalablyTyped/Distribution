package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * The AWS Organization ID to unshare the application from.
    */
  var OrganizationId: string
}
object UnshareApplicationRequest {
  
  inline def apply(ApplicationId: string, OrganizationId: string): UnshareApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareApplicationRequest]
  }
  
  extension [Self <: UnshareApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: string): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
