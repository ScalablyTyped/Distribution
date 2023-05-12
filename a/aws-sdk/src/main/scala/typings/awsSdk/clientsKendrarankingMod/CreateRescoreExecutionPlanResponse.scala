package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRescoreExecutionPlanResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rescore execution plan.
    */
  var Arn: RescoreExecutionPlanArn
  
  /**
    * The identifier of the rescore execution plan.
    */
  var Id: RescoreExecutionPlanId
}
object CreateRescoreExecutionPlanResponse {
  
  inline def apply(Arn: RescoreExecutionPlanArn, Id: RescoreExecutionPlanId): CreateRescoreExecutionPlanResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRescoreExecutionPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRescoreExecutionPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RescoreExecutionPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: RescoreExecutionPlanId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
