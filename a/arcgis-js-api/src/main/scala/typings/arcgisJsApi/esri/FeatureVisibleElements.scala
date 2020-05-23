package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureVisibleElements extends Object {
  /**
    * Indicates whether content for the Feature displays, can also indicate the specific types of content elements by setting it via [VisibleContentElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements). The default value is `true`, everything displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var content: js.UndefOr[Boolean | VisibleContentElements] = js.undefined
  /**
    * Indicates whether [lastEditInfo](esri-widgets-Feature-FeatureViewModel.html#lastEditInfo) is displayed within the feature. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var lastEditInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the title associated with the feature displays. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var title: js.UndefOr[Boolean] = js.undefined
}

object FeatureVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    content: Boolean | VisibleContentElements = null,
    lastEditInfo: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): FeatureVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(lastEditInfo)) __obj.updateDynamic("lastEditInfo")(lastEditInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureVisibleElements]
  }
}

