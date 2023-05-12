package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResendOperationAuthorizationRequest extends StObject {
  
  /**
    *  Operation ID. 
    */
  var OperationId: typings.awsSdk.clientsRoute53domainsMod.OperationId
}
object ResendOperationAuthorizationRequest {
  
  inline def apply(OperationId: OperationId): ResendOperationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResendOperationAuthorizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResendOperationAuthorizationRequest] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
