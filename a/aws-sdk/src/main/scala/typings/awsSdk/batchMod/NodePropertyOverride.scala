package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePropertyOverride extends js.Object {
  /**
    * The overrides that should be sent to a node range.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.native
  /**
    * The range of nodes, using node index values, with which to override. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range.
    */
  var targetNodes: String = js.native
}

object NodePropertyOverride {
  @scala.inline
  def apply(targetNodes: String, containerOverrides: ContainerOverrides = null): NodePropertyOverride = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes.asInstanceOf[js.Any])
    if (containerOverrides != null) __obj.updateDynamic("containerOverrides")(containerOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyOverride]
  }
}

