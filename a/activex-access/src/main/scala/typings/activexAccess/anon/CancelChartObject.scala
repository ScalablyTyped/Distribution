package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelChartObject extends js.Object {
  val Cancel: js.Any = js.native
  val chartObject: js.Any = js.native
  val drawObject: js.Any = js.native
}

object CancelChartObject {
  @scala.inline
  def apply(Cancel: js.Any, chartObject: js.Any, drawObject: js.Any): CancelChartObject = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChartObject]
  }
  @scala.inline
  implicit class CancelChartObjectOps[Self <: CancelChartObject] (val x: Self) extends AnyVal {
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
    def setCancel(value: js.Any): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartObject(value: js.Any): Self = this.set("chartObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawObject(value: js.Any): Self = this.set("drawObject", value.asInstanceOf[js.Any])
  }
  
}

