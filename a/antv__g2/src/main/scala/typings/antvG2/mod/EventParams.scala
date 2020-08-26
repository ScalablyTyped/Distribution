package typings.antvG2.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base type
  */
@js.native
trait EventParams extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var geom: js.UndefOr[js.Any] = js.native
  var shape: js.UndefOr[Shape] = js.native
  var target: js.UndefOr[HTMLCanvasElement] = js.native
  var toElement: js.UndefOr[HTMLElement] = js.native
  var views: js.UndefOr[js.Array[View]] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object EventParams {
  @scala.inline
  def apply(): EventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventParams]
  }
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGeom(value: js.Any): Self = this.set("geom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeom: Self = this.set("geom", js.undefined)
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setToElement(value: HTMLElement): Self = this.set("toElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToElement: Self = this.set("toElement", js.undefined)
    @scala.inline
    def setViewsVarargs(value: View*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[View]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

