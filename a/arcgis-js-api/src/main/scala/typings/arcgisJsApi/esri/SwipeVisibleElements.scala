package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeVisibleElements extends Object {
  /**
    * Indicates whether the divider between the leading and trailing layers is visible. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#VisibleElements)
    */
  var divider: Boolean = js.native
  /**
    * Indicates whether the handle from which you drag the widget is visible. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#VisibleElements)
    */
  var handle: Boolean = js.native
}

object SwipeVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    divider: Boolean,
    handle: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SwipeVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SwipeVisibleElements]
  }
  @scala.inline
  implicit class SwipeVisibleElementsOps[Self <: SwipeVisibleElements] (val x: Self) extends AnyVal {
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
    def setDivider(value: Boolean): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: Boolean): Self = this.set("handle", value.asInstanceOf[js.Any])
  }
  
}

