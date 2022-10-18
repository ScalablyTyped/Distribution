package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePublicDnsNamespaceResponse extends StObject {
  
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.OperationId] = js.undefined
}
object UpdatePublicDnsNamespaceResponse {
  
  inline def apply(): UpdatePublicDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePublicDnsNamespaceResponse]
  }
  
  extension [Self <: UpdatePublicDnsNamespaceResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
