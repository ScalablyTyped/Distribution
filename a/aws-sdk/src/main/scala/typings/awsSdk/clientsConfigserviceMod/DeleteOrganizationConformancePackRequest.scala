package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrganizationConformancePackRequest extends StObject {
  
  /**
    * The name of organization conformance pack that you want to delete.
    */
  var OrganizationConformancePackName: typings.awsSdk.clientsConfigserviceMod.OrganizationConformancePackName
}
object DeleteOrganizationConformancePackRequest {
  
  inline def apply(OrganizationConformancePackName: OrganizationConformancePackName): DeleteOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationConformancePackRequest]
  }
  
  extension [Self <: DeleteOrganizationConformancePackRequest](x: Self) {
    
    inline def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
  }
}
