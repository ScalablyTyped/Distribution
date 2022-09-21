package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopConstructor
  extends StObject
     with /**
  * A stop respresents the start, end, or midpoint of a route in [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops) or [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)
  */
Instantiable0[Stop]
     with Instantiable1[/* properties */ StopProperties, Stop] {
  
  /**
    * Creates a [Stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#fromGraphic)
    */
  def fromGraphic(): Stop = js.native
  def fromGraphic(graphic: Graphic): Stop = js.native
  
  def fromJSON(json: Any): Stop = js.native
}
