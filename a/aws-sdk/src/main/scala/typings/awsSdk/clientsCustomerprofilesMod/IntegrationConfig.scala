package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationConfig extends StObject {
  
  /**
    * Configuration data for APPFLOW_INTEGRATION workflow type.
    */
  var AppflowIntegration: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.AppflowIntegration] = js.undefined
}
object IntegrationConfig {
  
  inline def apply(): IntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegrationConfig] (val x: Self) extends AnyVal {
    
    inline def setAppflowIntegration(value: AppflowIntegration): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
