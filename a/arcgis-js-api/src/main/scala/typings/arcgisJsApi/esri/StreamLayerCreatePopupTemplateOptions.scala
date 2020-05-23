package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerCreatePopupTemplateOptions extends Object {
  /**
    * Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The maximum number of fields to include in the popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#createPopupTemplate)
    *
    * @default 75
    */
  var maximumFields: js.UndefOr[Double] = js.undefined
}

object StreamLayerCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ignoreFieldTypes: js.Array[String] = null,
    maximumFields: js.UndefOr[Double] = js.undefined
  ): StreamLayerCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (ignoreFieldTypes != null) __obj.updateDynamic("ignoreFieldTypes")(ignoreFieldTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFields)) __obj.updateDynamic("maximumFields")(maximumFields.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerCreatePopupTemplateOptions]
  }
}

