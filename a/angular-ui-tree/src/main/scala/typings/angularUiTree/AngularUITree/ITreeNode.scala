package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in list
  */
trait ITreeNode extends js.Object {
  var id: Double | String
  var nodes: js.Array[ITreeNode]
  var title: String
}

object ITreeNode {
  @scala.inline
  def apply(id: Double | String, nodes: js.Array[ITreeNode], title: String): ITreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNode]
  }
}

