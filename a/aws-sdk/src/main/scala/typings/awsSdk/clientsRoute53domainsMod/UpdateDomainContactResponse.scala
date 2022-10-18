package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainContactResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: typings.awsSdk.clientsRoute53domainsMod.OperationId
}
object UpdateDomainContactResponse {
  
  inline def apply(OperationId: OperationId): UpdateDomainContactResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactResponse]
  }
  
  extension [Self <: UpdateDomainContactResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
