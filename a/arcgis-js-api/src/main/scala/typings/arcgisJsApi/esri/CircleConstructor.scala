package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleConstructor
  extends StObject
     with /**
  * A circle is a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) created by specifying a [center point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center) and a [radius](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html)
  */
Instantiable0[Circle]
     with Instantiable1[/* properties */ CircleProperties, Circle] {
  
  def fromJSON(json: js.Any): Circle = js.native
}
