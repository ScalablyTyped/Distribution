package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApiRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object AssociateApiRequest {
  
  inline def apply(apiId: String, domainName: DomainName): AssociateApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApiRequest]
  }
  
  extension [Self <: AssociateApiRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
