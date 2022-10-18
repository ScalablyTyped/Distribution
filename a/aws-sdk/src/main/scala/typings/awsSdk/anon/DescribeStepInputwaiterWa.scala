package typings.awsSdk.anon

import typings.awsSdk.clientsEmrMod.ClusterId
import typings.awsSdk.clientsEmrMod.StepId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeStepInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeStepInputwaiterWa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * The identifier of the step to describe.
    */
  var StepId: typings.awsSdk.clientsEmrMod.StepId
}
object DescribeStepInputwaiterWa {
  
  inline def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInputwaiterWa = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepId = StepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStepInputwaiterWa]
  }
  
  extension [Self <: DescribeStepInputwaiterWa](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setStepId(value: StepId): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
  }
}
