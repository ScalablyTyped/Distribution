package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDomainTransferLockRequest extends StObject {
  
  /**
    * The name of the domain that you want to set the transfer lock for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object EnableDomainTransferLockRequest {
  
  inline def apply(DomainName: DomainName): EnableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDomainTransferLockRequest]
  }
  
  extension [Self <: EnableDomainTransferLockRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
