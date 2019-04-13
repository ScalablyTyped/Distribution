package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSummary extends js.Object {
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.undefined
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[InstancesCount] = js.undefined
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.undefined
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object StackSummary {
  @scala.inline
  def apply(
    AppsCount: js.UndefOr[Integer] = js.undefined,
    Arn: String = null,
    InstancesCount: InstancesCount = null,
    LayersCount: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    StackId: String = null
  ): StackSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AppsCount)) __obj.updateDynamic("AppsCount")(AppsCount)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (InstancesCount != null) __obj.updateDynamic("InstancesCount")(InstancesCount)
    if (!js.isUndefined(LayersCount)) __obj.updateDynamic("LayersCount")(LayersCount)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[StackSummary]
  }
}

