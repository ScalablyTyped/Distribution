package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupDockOptions extends Object {
  /**
    * Defines the dimensions of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which to dock the popup. Set to `false` to disable docking at a breakpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default true
    */
  var breakpoint: js.UndefOr[Boolean | PopupDockOptionsBreakpoint] = js.native
  /**
    * If `true`, displays the dock button. If `false`, hides the dock button from the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var buttonEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The position in the view at which to dock the popup. Can be set as either a string or function. See the table below for known string values and their position in the view based on the view's size.
    *
    * Known Value | View size > breakpoint | View size < breakpoint
    * --------------- | ------------------------------- | -------------
    * auto | top-right | bottom 100%
    * top-left | top-left | top 100%
    * top-center | top-center | top 100%
    * top-right | top-right | top 100%
    * bottom-left | bottom-left | bottom 100%
    * bottom-center | bottom-center | bottom 100%
    * bottom-right | bottom-right | bottom 100%
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default auto
    */
  var position: js.UndefOr[String | js.Function] = js.native
}

object PopupDockOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupDockOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupDockOptions]
  }
  @scala.inline
  implicit class PopupDockOptionsOps[Self <: PopupDockOptions] (val x: Self) extends AnyVal {
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
    def setBreakpoint(value: Boolean | PopupDockOptionsBreakpoint): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
    @scala.inline
    def setButtonEnabled(value: Boolean): Self = this.set("buttonEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonEnabled: Self = this.set("buttonEnabled", js.undefined)
    @scala.inline
    def setPosition(value: String | js.Function): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

