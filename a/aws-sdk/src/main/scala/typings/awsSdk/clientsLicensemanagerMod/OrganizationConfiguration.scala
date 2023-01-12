package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConfiguration extends StObject {
  
  /**
    * Enables Organizations integration.
    */
  var EnableIntegration: Boolean
}
object OrganizationConfiguration {
  
  inline def apply(EnableIntegration: Boolean): OrganizationConfiguration = {
    val __obj = js.Dynamic.literal(EnableIntegration = EnableIntegration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnableIntegration(value: Boolean): Self = StObject.set(x, "EnableIntegration", value.asInstanceOf[js.Any])
  }
}
