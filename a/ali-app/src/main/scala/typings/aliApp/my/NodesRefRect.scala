package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesRefRect extends RectArea {
  /** 节点的dataset */
  var dataset: js.Any = js.native
  /** 节点的ID */
  var id: String = js.native
}

object NodesRefRect {
  @scala.inline
  def apply(
    bottom: Double,
    dataset: js.Any,
    height: Double,
    id: String,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesRefRect]
  }
  @scala.inline
  implicit class NodesRefRectOps[Self <: NodesRefRect] (val x: Self) extends AnyVal {
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
    def setDataset(value: js.Any): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

