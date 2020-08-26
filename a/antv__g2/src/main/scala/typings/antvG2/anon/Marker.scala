package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marker extends js.Object {
  /**
    * 该图例项 marker 的填充颜色
    */
  var fill: String = js.native
  var marker: js.UndefOr[String | js.Function] = js.native
  /**
    * 图例项的文本内容
    */
  var value: String = js.native
}

object Marker {
  @scala.inline
  def apply(fill: String, value: String): Marker = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  @scala.inline
  implicit class MarkerOps[Self <: Marker] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: String | js.Function): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
  
}

