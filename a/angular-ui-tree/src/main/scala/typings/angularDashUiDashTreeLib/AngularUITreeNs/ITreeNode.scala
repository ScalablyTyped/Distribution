package typings
package angularDashUiDashTreeLib.AngularUITreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in list
  */
trait ITreeNode extends js.Object {
  var id: scala.Double | java.lang.String
  var nodes: js.Array[ITreeNode]
  var title: java.lang.String
}

object ITreeNode {
  @scala.inline
  def apply(id: scala.Double | java.lang.String, nodes: js.Array[ITreeNode], title: java.lang.String): ITreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes, title = title)
  
    __obj.asInstanceOf[ITreeNode]
  }
}

