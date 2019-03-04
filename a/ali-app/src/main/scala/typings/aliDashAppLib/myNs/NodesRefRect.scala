package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesRefRect extends RectArea {
  /** 节点的dataset */
  var dataset: js.Any
  /** 节点的ID */
  var id: java.lang.String
}

object NodesRefRect {
  @scala.inline
  def apply(
    bottom: scala.Double,
    dataset: js.Any,
    height: scala.Double,
    id: java.lang.String,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal(bottom = bottom, dataset = dataset, height = height, id = id, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[NodesRefRect]
  }
}

