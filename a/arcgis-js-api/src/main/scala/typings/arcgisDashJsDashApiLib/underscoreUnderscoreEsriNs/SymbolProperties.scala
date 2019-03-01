package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProperties extends js.Object {
  /**
    * The color of the symbol. This can be autocast with a named string; hex string; array of rgb or rgba values; an object with `r`, `g`, `b`, and `a` properties; or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
}

object SymbolProperties {
  @scala.inline
  def apply(color: Color | js.Array[scala.Double] | java.lang.String = null): SymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolProperties]
  }
}

