package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Cases domain.
    */
  var domainArn: DomainArn
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The status of the domain.
    */
  var domainStatus: DomainStatus
}
object CreateDomainResponse {
  
  inline def apply(domainArn: DomainArn, domainId: DomainId, domainStatus: DomainStatus): CreateDomainResponse = {
    val __obj = js.Dynamic.literal(domainArn = domainArn.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  extension [Self <: CreateDomainResponse](x: Self) {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "domainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
  }
}
