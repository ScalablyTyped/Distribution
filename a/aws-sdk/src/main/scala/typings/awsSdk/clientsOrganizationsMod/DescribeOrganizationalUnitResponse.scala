package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationalUnitResponse extends StObject {
  
  /**
    * A structure that contains details about the specified OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.OrganizationalUnit] = js.undefined
}
object DescribeOrganizationalUnitResponse {
  
  inline def apply(): DescribeOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationalUnitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationalUnitResponse] (val x: Self) extends AnyVal {
    
    inline def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
