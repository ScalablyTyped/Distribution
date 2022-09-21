package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`added-cost`
import typings.arcgisJsApi.arcgisJsApiStrings.restriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineBarrierProperties extends StObject {
  
  /**
    * Specify if the point barrier restricts travel completely or adds time or distance when it is crossed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#barrierType)
    */
  var barrierType: js.UndefOr[restriction | `added-cost`] = js.undefined
  
  /**
    * The point location of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The name of the barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
}
object PolylineBarrierProperties {
  
  inline def apply(): PolylineBarrierProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineBarrierProperties]
  }
  
  extension [Self <: PolylineBarrierProperties](x: Self) {
    
    inline def setBarrierType(value: restriction | `added-cost`): Self = StObject.set(x, "barrierType", value.asInstanceOf[js.Any])
    
    inline def setBarrierTypeUndefined: Self = StObject.set(x, "barrierType", js.undefined)
    
    inline def setGeometry(value: PointProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
