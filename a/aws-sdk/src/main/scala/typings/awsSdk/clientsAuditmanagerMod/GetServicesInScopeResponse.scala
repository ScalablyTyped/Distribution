package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServicesInScopeResponse extends StObject {
  
  /**
    *  The metadata that's associated with the Amazon Web Service. 
    */
  var serviceMetadata: js.UndefOr[ServiceMetadataList] = js.undefined
}
object GetServicesInScopeResponse {
  
  inline def apply(): GetServicesInScopeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServicesInScopeResponse]
  }
  
  extension [Self <: GetServicesInScopeResponse](x: Self) {
    
    inline def setServiceMetadata(value: ServiceMetadataList): Self = StObject.set(x, "serviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "serviceMetadata", js.undefined)
    
    inline def setServiceMetadataVarargs(value: ServiceMetadata*): Self = StObject.set(x, "serviceMetadata", js.Array(value*))
  }
}
