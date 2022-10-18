package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationResponse extends StObject {
  
  /**
    * The updated status of scan types automatically enabled for new members of your Amazon Inspector organization.
    */
  var autoEnable: AutoEnable
}
object UpdateOrganizationConfigurationResponse {
  
  inline def apply(autoEnable: AutoEnable): UpdateOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(autoEnable = autoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationResponse]
  }
  
  extension [Self <: UpdateOrganizationConfigurationResponse](x: Self) {
    
    inline def setAutoEnable(value: AutoEnable): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
  }
}
