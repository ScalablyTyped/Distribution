package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceResponse extends StObject {
  
  /**
    * The unique ID of the asynchronous operation that this request started. You can use it combined with the ListOperations call to track the operation's progress.
    */
  var OperationId: UUID
  
  /**
    * A description of the App Runner service updated by this request. All configuration values in the returned Service structure reflect configuration changes that are being applied by this request.
    */
  var Service: typings.awsSdk.clientsApprunnerMod.Service
}
object UpdateServiceResponse {
  
  inline def apply(OperationId: UUID, Service: Service): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: UUID): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
