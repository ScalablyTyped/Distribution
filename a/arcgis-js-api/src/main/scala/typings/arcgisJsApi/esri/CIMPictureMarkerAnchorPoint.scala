package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureMarkerAnchorPoint extends StObject {
  
  /**
    * The x coordinate of the anchor point, measured along the east/west axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * The y coordinate of the anchor point, measured along the north/south axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var y: js.UndefOr[Any] = js.undefined
}
object CIMPictureMarkerAnchorPoint {
  
  inline def apply(): CIMPictureMarkerAnchorPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIMPictureMarkerAnchorPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPictureMarkerAnchorPoint] (val x: Self) extends AnyVal {
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
