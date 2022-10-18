package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDomainTransferLockRequest extends StObject {
  
  /**
    * The name of the domain that you want to remove the transfer lock for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object DisableDomainTransferLockRequest {
  
  inline def apply(DomainName: DomainName): DisableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainTransferLockRequest]
  }
  
  extension [Self <: DisableDomainTransferLockRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
