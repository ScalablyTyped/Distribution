package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`added-cost`
import typings.arcgisJsApi.arcgisJsApiStrings.`barrier-area`
import typings.arcgisJsApi.arcgisJsApiStrings.restriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonBarrier
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specify if the point barrier restricts travel completely or adds time or distance when it is crossed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#barrierType)
    */
  var barrierType: restriction | `added-cost` = js.native
  
  /**
    * The point location of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#geometry)
    */
  var geometry: Polygon = js.native
  
  /**
    * The name of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#name)
    */
  var name: String = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [PolygonBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: `barrier-area` = js.native
}
