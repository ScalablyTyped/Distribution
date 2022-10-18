package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptDomainTransferFromAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain that was specified when another Amazon Web Services account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * The password that was returned by the TransferDomainToAnotherAwsAccount request. 
    */
  var Password: String
}
object AcceptDomainTransferFromAnotherAwsAccountRequest {
  
  inline def apply(DomainName: DomainName, Password: String): AcceptDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountRequest]
  }
  
  extension [Self <: AcceptDomainTransferFromAnotherAwsAccountRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
