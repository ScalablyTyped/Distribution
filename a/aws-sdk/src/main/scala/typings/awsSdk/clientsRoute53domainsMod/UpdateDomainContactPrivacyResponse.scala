package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainContactPrivacyResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: typings.awsSdk.clientsRoute53domainsMod.OperationId
}
object UpdateDomainContactPrivacyResponse {
  
  inline def apply(OperationId: OperationId): UpdateDomainContactPrivacyResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactPrivacyResponse]
  }
  
  extension [Self <: UpdateDomainContactPrivacyResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
