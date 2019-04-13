package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRangeProperty extends js.Object {
  /**
    * The container details for the node range.
    */
  var container: js.UndefOr[ContainerProperties] = js.undefined
  /**
    * The range of nodes, using node index values. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the 0:10 properties. 
    */
  var targetNodes: String
}

object NodeRangeProperty {
  @scala.inline
  def apply(targetNodes: String, container: ContainerProperties = null): NodeRangeProperty = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes)
    if (container != null) __obj.updateDynamic("container")(container)
    __obj.asInstanceOf[NodeRangeProperty]
  }
}

