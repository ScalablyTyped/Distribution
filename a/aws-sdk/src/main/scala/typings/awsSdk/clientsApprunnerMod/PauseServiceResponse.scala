package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseServiceResponse extends StObject {
  
  /**
    * The unique ID of the asynchronous operation that this request started. You can use it combined with the ListOperations call to track the operation's progress.
    */
  var OperationId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A description of the App Runner service that this request just paused.
    */
  var Service: typings.awsSdk.clientsApprunnerMod.Service
}
object PauseServiceResponse {
  
  inline def apply(Service: Service): PauseServiceResponse = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PauseServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: UUID): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
