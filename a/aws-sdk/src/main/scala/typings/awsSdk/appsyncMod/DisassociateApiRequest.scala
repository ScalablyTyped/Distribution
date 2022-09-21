package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateApiRequest extends StObject {
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object DisassociateApiRequest {
  
  inline def apply(domainName: DomainName): DisassociateApiRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApiRequest]
  }
  
  extension [Self <: DisassociateApiRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
