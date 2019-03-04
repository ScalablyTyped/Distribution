package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeCreateRendererParamsLegendOptions
  extends stdLib.Object {
  /**
    * The title used to represent the given field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var title: java.lang.String
}

object typeCreateRendererParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    title: java.lang.String
  ): typeCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, title = title)
  
    __obj.asInstanceOf[typeCreateRendererParamsLegendOptions]
  }
}

