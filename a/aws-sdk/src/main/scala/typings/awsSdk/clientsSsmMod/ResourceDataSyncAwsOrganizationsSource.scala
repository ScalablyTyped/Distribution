package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncAwsOrganizationsSource extends StObject {
  
  /**
    * If an Amazon Web Services organization is present, this is either OrganizationalUnits or EntireOrganization. For OrganizationalUnits, the data is aggregated from a set of organization units. For EntireOrganization, the data is aggregated from the entire Amazon Web Services organization.
    */
  var OrganizationSourceType: ResourceDataSyncOrganizationSourceType
  
  /**
    * The Organizations organization units included in the sync.
    */
  var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.undefined
}
object ResourceDataSyncAwsOrganizationsSource {
  
  inline def apply(OrganizationSourceType: ResourceDataSyncOrganizationSourceType): ResourceDataSyncAwsOrganizationsSource = {
    val __obj = js.Dynamic.literal(OrganizationSourceType = OrganizationSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDataSyncAwsOrganizationsSource] (val x: Self) extends AnyVal {
    
    inline def setOrganizationSourceType(value: ResourceDataSyncOrganizationSourceType): Self = StObject.set(x, "OrganizationSourceType", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnits(value: ResourceDataSyncOrganizationalUnitList): Self = StObject.set(x, "OrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitsUndefined: Self = StObject.set(x, "OrganizationalUnits", js.undefined)
    
    inline def setOrganizationalUnitsVarargs(value: ResourceDataSyncOrganizationalUnit*): Self = StObject.set(x, "OrganizationalUnits", js.Array(value*))
  }
}
