package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementPolygonCenter
  extends StObject
     with CIMMarkerPlacementBase
     with CIMMarkerPlacementType {
  
  /**
  			 * A value indicating whether the marker should be clipped if it extends pasts the boundary of the polygon.
  			 */
  var clipAtBoundary: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The method used to determine the polygon center.
  			 */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
  ] = js.undefined
  
  /**
  			 * The value which offsets the marker horizontally from the center.
  			 */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The value which offsets the marker vertically from the center.
  			 */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementPolygonCenter: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter
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
    
    inline def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
