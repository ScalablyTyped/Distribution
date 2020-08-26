package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delta2X extends js.Object {
  var chart: default = js.native
  var delta2X: js.UndefOr[Double] = js.native
  var delta2Y: js.UndefOr[Double] = js.native
  var deltaX: js.UndefOr[Double] = js.native
  var deltaY: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var finalX: js.UndefOr[Double] = js.native
  var finalY: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var initialX: js.UndefOr[Double] = js.native
  var initialY: js.UndefOr[Double] = js.native
  var mostCloseGraph: js.UndefOr[typings.amcharts.amGraphMod.default] = js.native
  var start: js.UndefOr[Double] = js.native
  var target: js.UndefOr[this.type] = js.native
  var `type`: String = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var zooming: js.UndefOr[Boolean] = js.native
}

object Delta2X {
  @scala.inline
  def apply(chart: default, `type`: String): Delta2X = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta2X]
  }
  @scala.inline
  implicit class Delta2XOps[Self <: Delta2X] (val x: Self) extends AnyVal {
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
    def setChart(value: default): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta2X(value: Double): Self = this.set("delta2X", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta2X: Self = this.set("delta2X", js.undefined)
    @scala.inline
    def setDelta2Y(value: Double): Self = this.set("delta2Y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta2Y: Self = this.set("delta2Y", js.undefined)
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFinalX(value: Double): Self = this.set("finalX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalX: Self = this.set("finalX", js.undefined)
    @scala.inline
    def setFinalY(value: Double): Self = this.set("finalY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalY: Self = this.set("finalY", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
    @scala.inline
    def setMostCloseGraph(value: typings.amcharts.amGraphMod.default): Self = this.set("mostCloseGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostCloseGraph: Self = this.set("mostCloseGraph", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTarget(value: Delta2X): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setZooming(value: Boolean): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

