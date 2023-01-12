package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationSummary extends StObject {
  
  /**
    * The time when the operation ended. It's in the Unix time stamp format.
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique ID of this operation. It's unique in the scope of the App Runner service.
    */
  var Id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time when the operation started. It's in the Unix time stamp format.
    */
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the operation.
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner service).
    */
  var TargetArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The type of operation. It indicates a specific action that occured.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
  
  /**
    * The time when the operation was last updated. It's in the Unix time stamp format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object OperationSummary {
  
  inline def apply(): OperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationSummary] (val x: Self) extends AnyVal {
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "EndedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "EndedAt", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetArn(value: AppRunnerResourceArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    
    inline def setType(value: OperationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
