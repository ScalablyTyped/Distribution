package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRescoreExecutionPlanRequest extends StObject {
  
  /**
    * The identifier of the rescore execution plan that you want to delete.
    */
  var Id: RescoreExecutionPlanId
}
object DeleteRescoreExecutionPlanRequest {
  
  inline def apply(Id: RescoreExecutionPlanId): DeleteRescoreExecutionPlanRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRescoreExecutionPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRescoreExecutionPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RescoreExecutionPlanId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
