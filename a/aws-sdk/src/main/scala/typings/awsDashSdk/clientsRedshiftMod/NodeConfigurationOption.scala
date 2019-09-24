package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeConfigurationOption extends js.Object {
  /**
    * The estimated disk utilizaton percentage.
    */
  var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * The node type, such as, "ds2.8xlarge".
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The number of nodes.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.undefined
}

object NodeConfigurationOption {
  @scala.inline
  def apply(
    EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.undefined,
    NodeType: String = null,
    NumberOfNodes: js.UndefOr[Integer] = js.undefined
  ): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EstimatedDiskUtilizationPercent)) __obj.updateDynamic("EstimatedDiskUtilizationPercent")(EstimatedDiskUtilizationPercent)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    __obj.asInstanceOf[NodeConfigurationOption]
  }
}

