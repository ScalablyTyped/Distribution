package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicConstructor
  extends /**
  * A Graphic is a vector representation of real world geographic phenomena. It can contain [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry), a [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol), and [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes). A Graphic is displayed in the [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
  */
Instantiable0[Graphic]
     with Instantiable1[/* properties */ GraphicProperties, Graphic] {
  def fromJSON(json: js.Any): Graphic = js.native
}

