package typings.antDesignPro.timelineChartMod

import typings.antDesignPro.anon.Y1
import typings.antDesignPro.anon.Y2
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineChartProps extends js.Object {
  var data: js.Array[Y1] = js.native
  var height: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var titleMap: Y2 = js.native
}

object ITimelineChartProps {
  @scala.inline
  def apply(data: js.Array[Y1], titleMap: Y2): ITimelineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineChartProps]
  }
  @scala.inline
  implicit class ITimelineChartPropsOps[Self <: ITimelineChartProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Y1*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Y1]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleMap(value: Y2): Self = this.set("titleMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

