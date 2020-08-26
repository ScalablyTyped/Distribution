package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventSourceInfo extends js.Object {
  var cloneModel: js.Any = js.native
  var index: Double = js.native
  var nodeScope: ITreeNodeScope = js.native
  var nodesScope: ITreeNodeScope = js.native
}

object IEventSourceInfo {
  @scala.inline
  def apply(cloneModel: js.Any, index: Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
    val __obj = js.Dynamic.literal(cloneModel = cloneModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nodeScope = nodeScope.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventSourceInfo]
  }
  @scala.inline
  implicit class IEventSourceInfoOps[Self <: IEventSourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloneModel(value: js.Any): Self = this.set("cloneModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeScope(value: ITreeNodeScope): Self = this.set("nodeScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesScope(value: ITreeNodeScope): Self = this.set("nodesScope", value.asInstanceOf[js.Any])
  }
  
}

