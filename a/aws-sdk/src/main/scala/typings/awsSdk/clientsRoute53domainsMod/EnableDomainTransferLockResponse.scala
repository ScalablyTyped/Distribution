package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDomainTransferLockResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.OperationId] = js.undefined
}
object EnableDomainTransferLockResponse {
  
  inline def apply(): EnableDomainTransferLockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableDomainTransferLockResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableDomainTransferLockResponse] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
