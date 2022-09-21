package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceResponse extends StObject {
  
  /**
    * The unique ID of the asynchronous operation that this request started. You can use it combined with the ListOperations call to track the operation's progress.
    */
  var OperationId: UUID
  
  /**
    * A description of the App Runner service that this request just deleted.
    */
  var Service: typings.awsSdk.apprunnerMod.Service
}
object DeleteServiceResponse {
  
  inline def apply(OperationId: UUID, Service: Service): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceResponse]
  }
  
  extension [Self <: DeleteServiceResponse](x: Self) {
    
    inline def setOperationId(value: UUID): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
