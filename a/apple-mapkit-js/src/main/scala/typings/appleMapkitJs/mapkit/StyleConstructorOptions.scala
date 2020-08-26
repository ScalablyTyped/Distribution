package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initial values of options for applying style to overlays.
  */
@js.native
trait StyleConstructorOptions extends js.Object {
  /**
    * The fill color of a shape.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: js.UndefOr[String] = js.native
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: js.UndefOr[String] = js.native
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: js.UndefOr[Double] = js.native
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: js.UndefOr[String] = js.native
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * The stroke color of a line.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
}

object StyleConstructorOptions {
  @scala.inline
  def apply(): StyleConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleConstructorOptions]
  }
  @scala.inline
  implicit class StyleConstructorOptionsOps[Self <: StyleConstructorOptions] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: String): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDash: Self = this.set("lineDash", js.undefined)
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashOffset: Self = this.set("lineDashOffset", js.undefined)
    @scala.inline
    def setLineJoin(value: String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
  }
  
}

