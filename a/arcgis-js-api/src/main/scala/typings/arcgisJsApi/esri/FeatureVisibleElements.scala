package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureVisibleElements extends Object {
  /**
    * Indicates whether content for the Feature displays, can also indicate the specific types of content elements by setting it via [VisibleContentElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements). The default value is `true`, everything displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var content: js.UndefOr[Boolean | VisibleContentElements] = js.native
  /**
    * Indicates whether [lastEditInfo](esri-widgets-Feature-FeatureViewModel.html#lastEditInfo) is displayed within the feature. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var lastEditInfo: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the title associated with the feature displays. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var title: js.UndefOr[Boolean] = js.native
}

object FeatureVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureVisibleElements]
  }
  @scala.inline
  implicit class FeatureVisibleElementsOps[Self <: FeatureVisibleElements] (val x: Self) extends AnyVal {
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
    def setContent(value: Boolean | VisibleContentElements): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setLastEditInfo(value: Boolean): Self = this.set("lastEditInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEditInfo: Self = this.set("lastEditInfo", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

