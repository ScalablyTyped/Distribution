package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileImageryLayerCreatePopupTemplateOptions extends Object {
  /**
    * field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object TileImageryLayerCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ignoreFieldTypes: js.Array[String] = null
  ): TileImageryLayerCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (ignoreFieldTypes != null) __obj.updateDynamic("ignoreFieldTypes")(ignoreFieldTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileImageryLayerCreatePopupTemplateOptions]
  }
}

