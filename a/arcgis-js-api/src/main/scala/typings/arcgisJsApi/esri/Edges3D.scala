package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edges3D
  extends Accessor
     with JSONSupport {
  /**
    * The color of the edges. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#color)
    *
    * @default black
    */
  var color: Color_ = js.native
  /**
    * A size in points by which to extend edges beyond their original end points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#extensionLength)
    *
    * @default "0"
    */
  var extensionLength: Double = js.native
  /**
    * The size of the edges in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#size)
    *
    * @default 1px
    */
  var size: Double = js.native
}

@JSGlobal("__esri.Edges3D")
@js.native
object Edges3D extends TopLevel[Edges3DConstructor]

