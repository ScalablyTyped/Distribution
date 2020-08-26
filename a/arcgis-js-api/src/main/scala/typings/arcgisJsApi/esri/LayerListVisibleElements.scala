package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerListVisibleElements extends Object {
  /**
    * Indicates whether to the status indicators will be displayed. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.native
}

object LayerListVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerListVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LayerListVisibleElements]
  }
  @scala.inline
  implicit class LayerListVisibleElementsOps[Self <: LayerListVisibleElements] (val x: Self) extends AnyVal {
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
    def setStatusIndicators(value: Boolean): Self = this.set("statusIndicators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusIndicators: Self = this.set("statusIndicators", js.undefined)
  }
  
}

