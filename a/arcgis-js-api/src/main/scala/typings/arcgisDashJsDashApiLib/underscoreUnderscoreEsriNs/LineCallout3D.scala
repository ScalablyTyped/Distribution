package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineCallout3D extends Callout3D {
  /**
    * The border settings of the callout line. The border of the callout line can be used to improve the contrast of the callout line color against various background colors. If the border is `null`, then no border will be visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: LineCallout3DBorder = js.native
  /**
    * The color of the callout line. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    *
    * @default black
    */
  var color: Color = js.native
  /**
    * The width of the callout line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    *
    * @default 1px
    */
  var size: scala.Double = js.native
  /**
    * For LineCallout3D the type is always `line`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#type)
    */
  var `type`: java.lang.String = js.native
}

