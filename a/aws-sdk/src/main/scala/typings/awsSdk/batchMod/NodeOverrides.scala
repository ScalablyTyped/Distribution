package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOverrides extends js.Object {
  /**
    * The node property overrides for the job.
    */
  var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.native
  /**
    * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are specified in the job definition. To use this override:   There must be at least one node range in your job definition that has an open upper boundary (such as : or n:).   The lower boundary of the node range specified in the job definition must be fewer than the number of nodes specified in the override.   The main node index specified in the job definition must be fewer than the number of nodes specified in the override.  
    */
  var numNodes: js.UndefOr[Integer] = js.native
}

object NodeOverrides {
  @scala.inline
  def apply(): NodeOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOverrides]
  }
  @scala.inline
  implicit class NodeOverridesOps[Self <: NodeOverrides] (val x: Self) extends AnyVal {
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
    def setNodePropertyOverridesVarargs(value: NodePropertyOverride*): Self = this.set("nodePropertyOverrides", js.Array(value :_*))
    @scala.inline
    def setNodePropertyOverrides(value: NodePropertyOverrides): Self = this.set("nodePropertyOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePropertyOverrides: Self = this.set("nodePropertyOverrides", js.undefined)
    @scala.inline
    def setNumNodes(value: Integer): Self = this.set("numNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumNodes: Self = this.set("numNodes", js.undefined)
  }
  
}

