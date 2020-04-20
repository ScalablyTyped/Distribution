package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominantCategoriesPredominantCategoriesParams extends Object {
  /**
    * An array of numeric fields from which to determine predominant categories. The fields must all be number fields and they must be competing or complementary (e.g. population totals by language spoken at home, or harvested acres by crop type, or the results of an election by candidate or party).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var fields: js.Array[String]
  /**
    * The layer from which to generate predominant categories for the given set of `fields`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * The view in which features will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
}

object predominantCategoriesPredominantCategoriesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[String],
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    signal: AbortSignal = null,
    view: MapView | SceneView = null
  ): predominantCategoriesPredominantCategoriesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominantCategoriesPredominantCategoriesParams]
  }
}

