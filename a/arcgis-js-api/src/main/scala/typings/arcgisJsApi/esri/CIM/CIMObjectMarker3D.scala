package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMObjectMarker3D
  extends StObject
     with CIMMarker
     with CIMSymbolLayerType {
  
  /**
  			 * The array of levels of detail.
  			 */
  var LODs: js.UndefOr[js.Array[CIMObjectMarker3DLOD]] = js.undefined
  
  /**
  			 * The marker depth.
  			 */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
  			 * A value indicating whether the model can be exported.
  			 */
  var isRestricted: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The URI of the binary reference containing the "web resource".
  			 */
  var modelURI: js.UndefOr[String] = js.undefined
  
  /**
  			 * The representative image of the marker.
  			 */
  var thumbnail: js.UndefOr[String] = js.undefined
  
  /**
  			 * The color which defines the color that is applied to the marker.
  			 */
  var tintColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("type")
  var type_CIMObjectMarker3D: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D
  
  /**
  			 * A value indicating whether or not to ignore the marker anchor point and insert the model directly at the data point.
  			 */
  var useAnchorPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The marker width.
  			 */
  var width: js.UndefOr[Double] = js.undefined
}
object CIMObjectMarker3D {
  
  inline def apply(): CIMObjectMarker3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMObjectMarker3D")
    __obj.asInstanceOf[CIMObjectMarker3D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMObjectMarker3D] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setIsRestricted(value: Boolean): Self = StObject.set(x, "isRestricted", value.asInstanceOf[js.Any])
    
    inline def setIsRestrictedUndefined: Self = StObject.set(x, "isRestricted", js.undefined)
    
    inline def setLODs(value: js.Array[CIMObjectMarker3DLOD]): Self = StObject.set(x, "LODs", value.asInstanceOf[js.Any])
    
    inline def setLODsUndefined: Self = StObject.set(x, "LODs", js.undefined)
    
    inline def setLODsVarargs(value: CIMObjectMarker3DLOD*): Self = StObject.set(x, "LODs", js.Array(value*))
    
    inline def setModelURI(value: String): Self = StObject.set(x, "modelURI", value.asInstanceOf[js.Any])
    
    inline def setModelURIUndefined: Self = StObject.set(x, "modelURI", js.undefined)
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseAnchorPoint(value: Boolean): Self = StObject.set(x, "useAnchorPoint", value.asInstanceOf[js.Any])
    
    inline def setUseAnchorPointUndefined: Self = StObject.set(x, "useAnchorPoint", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
