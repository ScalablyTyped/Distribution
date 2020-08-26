package typings.amapJsApi.anon

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Rectangle.Options<any>> */
@js.native
trait PartialOptionsany extends js.Object {
  var bounds: js.UndefOr[Bounds] = js.native
  var bubble: js.UndefOr[Boolean] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var extData: js.UndefOr[js.Any] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var lineCap: js.UndefOr[StrokeLineCap] = js.native
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.native
  var map: js.UndefOr[Map] = js.native
  var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[StrokeStyle] = js.native
  var strokeWeight: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PartialOptionsany {
  @scala.inline
  def apply(): PartialOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsany]
  }
  @scala.inline
  implicit class PartialOptionsanyOps[Self <: PartialOptionsany] (val x: Self) extends AnyVal {
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setBubble(value: Boolean): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setExtData(value: js.Any): Self = this.set("extData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtData: Self = this.set("extData", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setLineCap(value: StrokeLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineJoin(value: StrokeLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPathVarargs(value: (js.Array[LocationValue] | LocationValue)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[js.Array[LocationValue] | LocationValue]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeDasharrayVarargs(value: Double*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: js.Array[Double]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeStyle(value: StrokeStyle): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

