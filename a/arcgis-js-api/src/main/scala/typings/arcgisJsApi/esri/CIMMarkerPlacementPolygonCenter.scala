package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.BoundingBoxCenter
import typings.arcgisJsApi.arcgisJsApiStrings.CenterOfMass
import typings.arcgisJsApi.arcgisJsApiStrings.OnPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementPolygonCenter
  extends StObject
     with MarkerPlacement {
  
  /**
    * A value indicating whether the marker should be clipped if it extends pasts the boundary of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var clipAtBoundary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The method used to determine the polygon center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var method: js.UndefOr[OnPolygon | CenterOfMass | BoundingBoxCenter] = js.undefined
  
  /**
    * The value which offsets the marker horizontally from the center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The value which offsets the marker vertically from the center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter
}
object CIMMarkerPlacementPolygonCenter {
  
  inline def apply(): CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementPolygonCenter")
    __obj.asInstanceOf[CIMMarkerPlacementPolygonCenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementPolygonCenter] (val x: Self) extends AnyVal {
    
    inline def setClipAtBoundary(value: Boolean): Self = StObject.set(x, "clipAtBoundary", value.asInstanceOf[js.Any])
    
    inline def setClipAtBoundaryUndefined: Self = StObject.set(x, "clipAtBoundary", js.undefined)
    
    inline def setMethod(value: OnPolygon | CenterOfMass | BoundingBoxCenter): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
