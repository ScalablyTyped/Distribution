package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineBarrierConstructor
  extends StObject
     with /**
  * A polyline barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html)
  */
Instantiable0[PolylineBarrier]
     with Instantiable1[/* properties */ PolylineBarrierProperties, PolylineBarrier] {
  
  /**
    * Creates a [PolylineBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#fromGraphic)
    */
  def fromGraphic(): PolylineBarrier = js.native
  def fromGraphic(graphic: Graphic): PolylineBarrier = js.native
  
  def fromJSON(json: Any): PolylineBarrier = js.native
}
