package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISImageServiceCreatePopupTemplateOptions
  extends stdLib.Object {
  /**
    * Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The maximum number of fields to include in the popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#createPopupTemplate)
    *
    * @default 75
    */
  var maximumFields: js.UndefOr[scala.Double] = js.undefined
}

object ArcGISImageServiceCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    ignoreFieldTypes: js.Array[java.lang.String] = null,
    maximumFields: scala.Int | scala.Double = null
  ): ArcGISImageServiceCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (ignoreFieldTypes != null) __obj.updateDynamic("ignoreFieldTypes")(ignoreFieldTypes)
    if (maximumFields != null) __obj.updateDynamic("maximumFields")(maximumFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCreatePopupTemplateOptions]
  }
}

