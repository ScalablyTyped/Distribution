package typings.awsSdk

import typings.awsSdk.elbv2Mod.TargetDescriptions
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

