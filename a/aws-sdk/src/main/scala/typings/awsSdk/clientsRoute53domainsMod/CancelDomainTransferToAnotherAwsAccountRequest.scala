package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDomainTransferToAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain for which you want to cancel the transfer to another Amazon Web Services account.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object CancelDomainTransferToAnotherAwsAccountRequest {
  
  inline def apply(DomainName: DomainName): CancelDomainTransferToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountRequest]
  }
  
  extension [Self <: CancelDomainTransferToAnotherAwsAccountRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
