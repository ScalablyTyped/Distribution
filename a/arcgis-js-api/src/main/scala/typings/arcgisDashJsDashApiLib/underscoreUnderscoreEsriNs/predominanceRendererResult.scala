package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominanceRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var basemapId: java.lang.String
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given fields. The specification of each object matches that of the objects specified in the `predominantCategoryInfos` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var excludedCategoryInfos: js.Array[_]
  /**
    * An opacity visual variable representing the percentage of the total count comprised by the predominant value of all fields. This variable indicates the strength of a particular value's predominance compared to the other values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var opacity: js.UndefOr[opacityVisualVariableResult] = js.undefined
  /**
    * The predominance scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var predominanceScheme: PredominanceScheme
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var predominantCategoryInfos: js.Array[UniqueValueInfo]
  /**
    * The unique value renderer object representing the predominance visualization. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  /**
    * A size visual variable representing the total count of all fields included in the predominance visualization. This is included if the `includeSizeVariable` parameter is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var size: js.UndefOr[sizeVisualVariableResult] = js.undefined
}

object predominanceRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    excludedCategoryInfos: js.Array[_],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    predominanceScheme: PredominanceScheme,
    predominantCategoryInfos: js.Array[UniqueValueInfo],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    renderer: UniqueValueRenderer,
    opacity: opacityVisualVariableResult = null,
    size: sizeVisualVariableResult = null
  ): predominanceRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, excludedCategoryInfos = excludedCategoryInfos, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominanceScheme = predominanceScheme, predominantCategoryInfos = predominantCategoryInfos, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[predominanceRendererResult]
  }
}

