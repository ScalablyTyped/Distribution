package typings.awsSdk.anon

import typings.awsSdk.elbv2Mod.TargetDescription
import typings.awsSdk.elbv2Mod.TargetDescriptions
import typings.awsSdk.elbv2Mod.TargetGroupArn
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elbv2.DescribeTargetHealthInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeTargetHealthInput extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn
  
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.undefined
}
object DescribeTargetHealthInput {
  
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
  
  @scala.inline
  implicit class DescribeTargetHealthInputMutableBuilder[Self <: DescribeTargetHealthInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
