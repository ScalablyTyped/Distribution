package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsCreateFromElevationParamsMaterial
  extends stdLib.Object {
  /**
    * The material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    */
  var color: js.UndefOr[
    ValueMeshColor | ImageMeshColor | java.lang.String | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | js.Array[scala.Double]
  ] = js.undefined
}

object meshUtilsCreateFromElevationParamsMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: ValueMeshColor | ImageMeshColor | java.lang.String | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | js.Array[scala.Double] = null
  ): meshUtilsCreateFromElevationParamsMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[meshUtilsCreateFromElevationParamsMaterial]
  }
}

