package typings.antd.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleGeneratorInfo extends js.Object {
  var dragging: Boolean = js.native
  var index: Double = js.native
  var rest: js.Array[_] = js.native
  var value: js.UndefOr[Double] = js.native
}

object HandleGeneratorInfo {
  @scala.inline
  def apply(dragging: Boolean, index: Double, rest: js.Array[_]): HandleGeneratorInfo = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleGeneratorInfo]
  }
  @scala.inline
  implicit class HandleGeneratorInfoOps[Self <: HandleGeneratorInfo] (val x: Self) extends AnyVal {
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestVarargs(value: js.Any*): Self = this.set("rest", js.Array(value :_*))
    @scala.inline
    def setRest(value: js.Array[_]): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

