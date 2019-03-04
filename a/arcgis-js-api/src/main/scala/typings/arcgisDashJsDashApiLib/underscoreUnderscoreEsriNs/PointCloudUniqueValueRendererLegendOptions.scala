package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudUniqueValueRendererLegendOptions
  extends stdLib.Object {
  /**
    * Describes the variable driving the visualization. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and takes precedence over a [field alias](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PointCloudUniqueValueRendererLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    title: java.lang.String = null
  ): PointCloudUniqueValueRendererLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PointCloudUniqueValueRendererLegendOptions]
  }
}

