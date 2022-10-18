package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningClaimRequest extends StObject {
  
  /**
    * The name of the provisioning template to use.
    */
  var templateName: TemplateName
}
object CreateProvisioningClaimRequest {
  
  inline def apply(templateName: TemplateName): CreateProvisioningClaimRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningClaimRequest]
  }
  
  extension [Self <: CreateProvisioningClaimRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
