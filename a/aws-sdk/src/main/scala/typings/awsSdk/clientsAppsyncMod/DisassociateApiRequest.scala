package typings.awsSdk.clientsAppsyncMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateApiRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
