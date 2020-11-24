package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(targetNodes: String): NodePropertyOverride = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyOverride]
  }
  
  @scala.inline
  implicit class NodePropertyOverrideOps[Self <: NodePropertyOverride] (val x: Self) extends AnyVal {
    
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
    def setContainerOverrides(value: ContainerOverrides): Self = this.set("containerOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerOverrides: Self = this.set("containerOverrides", js.undefined)
  }
}
