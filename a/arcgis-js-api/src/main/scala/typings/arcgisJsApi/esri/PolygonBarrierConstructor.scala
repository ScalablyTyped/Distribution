package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonBarrierConstructor
  extends StObject
     with Instantiable0[PolygonBarrier]
     with Instantiable1[/* properties */ PolygonBarrierProperties, PolygonBarrier] {
  
  /**
    * Creates a [PolygonBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#fromGraphic)
    */
  def fromGraphic(): PolygonBarrier = js.native
  def fromGraphic(graphic: Graphic): PolygonBarrier = js.native
  
  def fromJSON(json: Any): PolygonBarrier = js.native
}
