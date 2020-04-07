package typings.awsSdk

import typings.awsSdk.elbv2Mod.TargetDescriptions
import typings.awsSdk.elbv2Mod.TargetGroupArn
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elbv2.DescribeTargetHealthInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTargetHealthInput extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn = js.native
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.native
}

object DescribeTargetHealthInput {
  @scala.inline
  def apply(
    TargetGroupArn: TargetGroupArn,
    $waiter: WaiterConfiguration = null,
    Targets: TargetDescriptions = null
  ): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
}

