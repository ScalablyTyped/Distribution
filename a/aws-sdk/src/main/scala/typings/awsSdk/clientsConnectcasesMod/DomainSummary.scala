package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  var domainArn: DomainArn
  
  /**
    * The unique identifier of the domain.
    */
  var domainId: DomainId
  
  /**
    * The name of the domain.
    */
  var name: DomainName
}
object DomainSummary {
  
  inline def apply(domainArn: DomainArn, domainId: DomainId, name: DomainName): DomainSummary = {
    val __obj = js.Dynamic.literal(domainArn = domainArn.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  
  extension [Self <: DomainSummary](x: Self) {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "domainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
