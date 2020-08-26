package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in list
  */
@js.native
trait ITreeNode extends js.Object {
  var id: Double | String = js.native
  var nodes: js.Array[ITreeNode] = js.native
  var title: String = js.native
}

object ITreeNode {
  @scala.inline
  def apply(id: Double | String, nodes: js.Array[ITreeNode], title: String): ITreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNode]
  }
  @scala.inline
  implicit class ITreeNodeOps[Self <: ITreeNode] (val x: Self) extends AnyVal {
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
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: ITreeNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[ITreeNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

