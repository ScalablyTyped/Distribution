package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDomainAutoRenewRequest extends StObject {
  
  /**
    * The name of the domain that you want to enable automatic renewal for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object EnableDomainAutoRenewRequest {
  
  inline def apply(DomainName: DomainName): EnableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDomainAutoRenewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableDomainAutoRenewRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
