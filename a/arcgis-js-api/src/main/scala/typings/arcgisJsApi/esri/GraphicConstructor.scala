package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicConstructor
  extends StObject
     with /**
  * A Graphic is a vector representation of real world geographic phenomena.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
  */
Instantiable0[Graphic]
     with Instantiable1[/* properties */ GraphicProperties, Graphic] {
  
  def fromJSON(json: Any): Graphic = js.native
}
