package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationalUnitScope extends StObject {
  
  /**
    * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If true, the administrator can manage all OUs within the organization. You can either enable management of all OUs through this operation, or you can specify OUs to manage in OrganizationalUnitScope$OrganizationalUnits. You cannot specify both.
    */
  var AllOrganizationalUnitsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value that excludes the OUs in OrganizationalUnitScope$OrganizationalUnits from the administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs listed in OrganizationalUnitScope$OrganizationalUnits. You can either specify a list of OUs to exclude by OrganizationalUnitScope$OrganizationalUnits, or you can enable management of all OUs by OrganizationalUnitScope$AllOrganizationalUnitsEnabled. You cannot specify both.
    */
  var ExcludeSpecifiedOrganizationalUnits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot apply policies to, based on the value of OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits. If OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits is set to true, then the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this list. If OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits is set to false, then the Firewall Manager administrator can only apply policies to the OUs in this list.
    */
  var OrganizationalUnits: js.UndefOr[OrganizationalUnitIdList] = js.undefined
}
object OrganizationalUnitScope {
  
  inline def apply(): OrganizationalUnitScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalUnitScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationalUnitScope] (val x: Self) extends AnyVal {
    
    inline def setAllOrganizationalUnitsEnabled(value: Boolean): Self = StObject.set(x, "AllOrganizationalUnitsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAllOrganizationalUnitsEnabledUndefined: Self = StObject.set(x, "AllOrganizationalUnitsEnabled", js.undefined)
    
    inline def setExcludeSpecifiedOrganizationalUnits(value: Boolean): Self = StObject.set(x, "ExcludeSpecifiedOrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setExcludeSpecifiedOrganizationalUnitsUndefined: Self = StObject.set(x, "ExcludeSpecifiedOrganizationalUnits", js.undefined)
    
    inline def setOrganizationalUnits(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitsUndefined: Self = StObject.set(x, "OrganizationalUnits", js.undefined)
    
    inline def setOrganizationalUnitsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnits", js.Array(value*))
  }
}
