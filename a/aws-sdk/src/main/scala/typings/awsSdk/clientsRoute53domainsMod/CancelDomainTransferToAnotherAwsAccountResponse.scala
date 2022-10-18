package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDomainTransferToAnotherAwsAccountResponse extends StObject {
  
  /**
    * The identifier that TransferDomainToAnotherAwsAccount returned to track the progress of the request. Because the transfer request was canceled, the value is no longer valid, and you can't use GetOperationDetail to query the operation status.
    */
  var OperationId: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.OperationId] = js.undefined
}
object CancelDomainTransferToAnotherAwsAccountResponse {
  
  inline def apply(): CancelDomainTransferToAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountResponse]
  }
  
  extension [Self <: CancelDomainTransferToAnotherAwsAccountResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
