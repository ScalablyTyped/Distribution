package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTemplateExportOptions
  extends stdLib.Object {
  /**
    * Resolution in dots per inch. If modified when `layout = 'map-only'`, the `width` and `height` will also need to be modified proportional to the `dpi` change. Default value is 96.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var dpi: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map height. Default value is 1100.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map width. Default value is 800.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PrintTemplateExportOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    dpi: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PrintTemplateExportOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTemplateExportOptions]
  }
}

