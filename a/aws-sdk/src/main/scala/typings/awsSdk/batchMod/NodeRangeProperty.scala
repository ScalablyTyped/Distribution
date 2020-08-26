package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRangeProperty extends js.Object {
  /**
    * The container details for the node range.
    */
  var container: js.UndefOr[ContainerProperties] = js.native
  /**
    * The range of nodes, using node index values. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the 0:10 properties.
    */
  var targetNodes: String = js.native
}

object NodeRangeProperty {
  @scala.inline
  def apply(targetNodes: String): NodeRangeProperty = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRangeProperty]
  }
  @scala.inline
  implicit class NodeRangePropertyOps[Self <: NodeRangeProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetNodes(value: String): Self = this.set("targetNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ContainerProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
  }
  
}

