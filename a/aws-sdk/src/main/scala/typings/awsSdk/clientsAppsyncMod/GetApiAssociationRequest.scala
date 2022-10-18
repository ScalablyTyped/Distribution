package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiAssociationRequest extends StObject {
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object GetApiAssociationRequest {
  
  inline def apply(domainName: DomainName): GetApiAssociationRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiAssociationRequest]
  }
  
  extension [Self <: GetApiAssociationRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
