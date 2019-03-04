package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureViewModelFormattedAttributes
  extends stdLib.Object {
  /**
    * The formatted attributes for an individual content element. This is derived from the module:esri/PopupTemplate#fields content property of the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) defined as type `fields`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#formattedAttributes)
    */
  var content: js.UndefOr[js.Any] = js.undefined
  /**
    * The formatted attributes specified at the root level of the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) using the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
    *
    * [Read more...](global.html)
    */
  var global: js.UndefOr[js.Any] = js.undefined
}

object FeatureViewModelFormattedAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    content: js.Any = null,
    global: js.Any = null
  ): FeatureViewModelFormattedAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (content != null) __obj.updateDynamic("content")(content)
    if (global != null) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[FeatureViewModelFormattedAttributes]
  }
}

