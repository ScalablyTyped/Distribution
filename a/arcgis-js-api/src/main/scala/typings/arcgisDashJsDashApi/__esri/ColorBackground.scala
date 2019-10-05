package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBackground extends JSONSupport {
  /**
    * The color of the background. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html#color)
    *
    * @default black
    */
  var color: Color
}

@JSGlobal("__esri.ColorBackground")
@js.native
object ColorBackground extends TopLevel[ColorBackgroundConstructor]

