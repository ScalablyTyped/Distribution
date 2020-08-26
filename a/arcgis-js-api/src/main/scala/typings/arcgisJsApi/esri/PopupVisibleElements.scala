package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupVisibleElements extends Object {
  /**
    * Indicates whether to display a close button on the popup dialog. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to the feature navigation will be displayed. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var featureNavigation: js.UndefOr[Boolean] = js.native
}

object PopupVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupVisibleElements]
  }
  @scala.inline
  implicit class PopupVisibleElementsOps[Self <: PopupVisibleElements] (val x: Self) extends AnyVal {
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
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setFeatureNavigation(value: Boolean): Self = this.set("featureNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureNavigation: Self = this.set("featureNavigation", js.undefined)
  }
  
}

