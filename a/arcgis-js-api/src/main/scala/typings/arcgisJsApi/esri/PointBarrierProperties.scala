package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`added-cost`
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

trait PointBarrierProperties extends StObject {
  
  /**
    * Specify if the point barrier restricts travel completely or adds time or distance when it is crossed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#barrierType)
    */
  var barrierType: js.UndefOr[restriction | `added-cost`] = js.undefined
  
  /**
    * The side of the vehicle the curb is on when arriving at the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#curbApproach)
    */
  var curbApproach: js.UndefOr[
    `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn`
  ] = js.undefined
  
  /**
    * Point barriers are applied to the edge elements during the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#fullEdge)
    */
  var fullEdge: js.UndefOr[permit | restrict] = js.undefined
  
  /**
    * The point location of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The name of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
}
object PointBarrierProperties {
  
  inline def apply(): PointBarrierProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointBarrierProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointBarrierProperties] (val x: Self) extends AnyVal {
    
    inline def setBarrierType(value: restriction | `added-cost`): Self = StObject.set(x, "barrierType", value.asInstanceOf[js.Any])
    
    inline def setBarrierTypeUndefined: Self = StObject.set(x, "barrierType", js.undefined)
    
    inline def setCurbApproach(value: `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn`): Self = StObject.set(x, "curbApproach", value.asInstanceOf[js.Any])
    
    inline def setCurbApproachUndefined: Self = StObject.set(x, "curbApproach", js.undefined)
    
    inline def setFullEdge(value: permit | restrict): Self = StObject.set(x, "fullEdge", value.asInstanceOf[js.Any])
    
    inline def setFullEdgeUndefined: Self = StObject.set(x, "fullEdge", js.undefined)
    
    inline def setGeometry(value: PointProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
