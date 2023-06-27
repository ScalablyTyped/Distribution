package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointBarrierConstructor
  extends StObject
     with Instantiable0[PointBarrier]
     with Instantiable1[/* properties */ PointBarrierProperties, PointBarrier] {
  
  /**
  		 * Creates a [PointBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#fromGraphic)
  		 */
  def fromGraphic(): PointBarrier = js.native
  def fromGraphic(graphic: Graphic): PointBarrier = js.native
  
  def fromJSON(json: Any): PointBarrier = js.native
}
