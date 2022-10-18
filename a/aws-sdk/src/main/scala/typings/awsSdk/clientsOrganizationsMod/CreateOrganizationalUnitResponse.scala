package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationalUnitResponse extends StObject {
  
  /**
    * A structure that contains details about the newly created OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.OrganizationalUnit] = js.undefined
}
object CreateOrganizationalUnitResponse {
  
  inline def apply(): CreateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationalUnitResponse]
  }
  
  extension [Self <: CreateOrganizationalUnitResponse](x: Self) {
    
    inline def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
