package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedResourceSummary extends StObject {
  
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Type of resource associated with a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ResourceType] = js.undefined
}
object ManagedResourceSummary {
  
  inline def apply(): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedResourceSummary]
  }
  
  extension [Self <: ManagedResourceSummary](x: Self) {
    
    inline def setAssociationCount(value: BoxLong): Self = StObject.set(x, "AssociationCount", value.asInstanceOf[js.Any])
    
    inline def setAssociationCountUndefined: Self = StObject.set(x, "AssociationCount", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
