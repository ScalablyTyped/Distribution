package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRescoreExecutionPlanRequest extends StObject {
  
  /**
    * The identifier of the rescore execution plan that you want to get information on.
    */
  var Id: RescoreExecutionPlanId
}
object DescribeRescoreExecutionPlanRequest {
  
  inline def apply(Id: RescoreExecutionPlanId): DescribeRescoreExecutionPlanRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRescoreExecutionPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRescoreExecutionPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RescoreExecutionPlanId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
