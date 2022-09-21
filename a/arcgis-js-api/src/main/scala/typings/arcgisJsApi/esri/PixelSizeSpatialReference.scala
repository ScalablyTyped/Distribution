package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelSizeSpatialReference
  extends StObject
     with Object {
  
  /**
    * The wkid of the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#PixelSize)
    */
  var wkid: js.UndefOr[Double] = js.undefined
  
  /**
    * The Well known text or wkt of the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#PixelSize)
    */
  var wkt: js.UndefOr[Double] = js.undefined
}
object PixelSizeSpatialReference {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PixelSizeSpatialReference = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PixelSizeSpatialReference]
  }
  
  extension [Self <: PixelSizeSpatialReference](x: Self) {
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    inline def setWkt(value: Double): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    inline def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
