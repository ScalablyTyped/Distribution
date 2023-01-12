package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDomainAutoRenewRequest extends StObject {
  
  /**
    * The name of the domain that you want to disable automatic renewal for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object DisableDomainAutoRenewRequest {
  
  inline def apply(DomainName: DomainName): DisableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainAutoRenewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableDomainAutoRenewRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
