package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationalUnitResponse extends StObject {
  
  /**
    * A structure that contains the details about the specified OU, including its new name.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.OrganizationalUnit] = js.undefined
}
object UpdateOrganizationalUnitResponse {
  
  inline def apply(): UpdateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOrganizationalUnitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrganizationalUnitResponse] (val x: Self) extends AnyVal {
    
    inline def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
