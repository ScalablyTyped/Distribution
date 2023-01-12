package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelSizeSpatialReference extends StObject {
  
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
  
  inline def apply(): PixelSizeSpatialReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelSizeSpatialReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelSizeSpatialReference] (val x: Self) extends AnyVal {
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    inline def setWkt(value: Double): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    inline def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
