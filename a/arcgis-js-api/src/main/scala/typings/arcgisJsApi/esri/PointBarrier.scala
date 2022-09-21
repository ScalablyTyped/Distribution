package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`added-cost`
import typings.arcgisJsApi.arcgisJsApiStrings.`barrier-point`
import typings.arcgisJsApi.arcgisJsApiStrings.`either-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-u-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.permit
import typings.arcgisJsApi.arcgisJsApiStrings.restrict
import typings.arcgisJsApi.arcgisJsApiStrings.restriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointBarrier
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specify if the point barrier restricts travel completely or adds time or distance when it is crossed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#barrierType)
    */
  var barrierType: restriction | `added-cost` = js.native
  
  /**
    * The side of the vehicle the curb is on when arriving at the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#curbApproach)
    */
  var curbApproach: `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn` = js.native
  
  /**
    * Point barriers are applied to the edge elements during the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#fullEdge)
    */
  var fullEdge: permit | restrict = js.native
  
  /**
    * The point location of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#geometry)
    */
  var geometry: Point = js.native
  
  /**
    * The name of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#name)
    */
  var name: String = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [PointBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: `barrier-point` = js.native
}
