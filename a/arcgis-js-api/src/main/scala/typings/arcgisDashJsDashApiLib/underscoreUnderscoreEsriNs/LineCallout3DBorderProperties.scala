package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineCallout3DBorderProperties
  extends stdLib.Object {
  /**
    * The color of the callout line border. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    *
    * @default white
    */
  var color: js.UndefOr[Color] = js.undefined
}

object LineCallout3DBorderProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: Color = null
  ): LineCallout3DBorderProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[LineCallout3DBorderProperties]
  }
}

