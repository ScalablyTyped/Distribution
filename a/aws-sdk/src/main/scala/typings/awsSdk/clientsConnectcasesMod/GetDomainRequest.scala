package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
}
object GetDomainRequest {
  
  inline def apply(domainId: DomainId): GetDomainRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainRequest]
  }
  
  extension [Self <: GetDomainRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
  }
}
