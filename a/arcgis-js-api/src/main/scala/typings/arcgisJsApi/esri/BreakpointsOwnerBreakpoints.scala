package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakpointsOwnerBreakpoints extends Object {
  /**
    * Sets the `large` breakpoint in pixels used by [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint). If the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) is between this value and the value of the `medium` property, then the value of [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) will be `large`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    *
    * @default 1200
    */
  var large: js.UndefOr[Double] = js.native
  /**
    * Sets the `medium` breakpoint in pixels used by [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint). If the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) is between this value and the value of the `small` property, then the value of [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) will be `medium`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    *
    * @default 992
    */
  var medium: js.UndefOr[Double] = js.native
  /**
    * Sets the `small` breakpoint in pixels used by [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint). If the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) is between this value and the value of the `xsmall` property, then the value of [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) will be `small`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    *
    * @default 768
    */
  var small: js.UndefOr[Double] = js.native
  /**
    * Sets the `xlarge` breakpoint in pixels used by [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint). If the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) is greater than the value of the `large` property, then the value of [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) will be `xlarge`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    */
  var xlarge: js.UndefOr[Double] = js.native
  /**
    * Sets the `xsmall` breakpoint in pixels used by [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint). If the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) is smaller than this value, then the value of [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) will be `xsmall`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    *
    * @default 544
    */
  var xsmall: js.UndefOr[Double] = js.native
}

object BreakpointsOwnerBreakpoints {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BreakpointsOwnerBreakpoints = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BreakpointsOwnerBreakpoints]
  }
  @scala.inline
  implicit class BreakpointsOwnerBreakpointsOps[Self <: BreakpointsOwnerBreakpoints] (val x: Self) extends AnyVal {
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
    def setLarge(value: Double): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setSmall(value: Double): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setXlarge(value: Double): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    @scala.inline
    def setXsmall(value: Double): Self = this.set("xsmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsmall: Self = this.set("xsmall", js.undefined)
  }
  
}

