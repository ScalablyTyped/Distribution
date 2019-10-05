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
    EstimatedDiskUtilizationPercent: Int | scala.Double = null,
    NodeType: String = null,
    NumberOfNodes: Int | scala.Double = null
  ): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    if (EstimatedDiskUtilizationPercent != null) __obj.updateDynamic("EstimatedDiskUtilizationPercent")(EstimatedDiskUtilizationPercent.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigurationOption]
  }
}

