package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`added-cost`
import typings.arcgisJsApi.arcgisJsApiStrings.`barrier-line`
import typings.arcgisJsApi.arcgisJsApiStrings.restriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineBarrier
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specify if the point barrier restricts travel completely or adds time or distance when it is crossed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#barrierType)
    */
  var barrierType: restriction | `added-cost` = js.native
  
  /**
    * The point location of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#geometry)
    */
  var geometry: Point = js.native
  
  /**
    * The name of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#name)
    */
  var name: String = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [PolylineBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: `barrier-line` = js.native
}
