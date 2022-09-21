package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMVectorMarker
  extends StObject
     with CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * A clipping path for the vector marker graphics.
    */
  var clippingPath: js.UndefOr[CIMClippingPath] = js.undefined
  
  /**
    * The depth of the marker when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.undefined
  
  /**
    * The outer boundary of the entire vector marker.
    */
  var frame: js.UndefOr[ExternalReferenceEnvelope] = js.undefined
  
  /**
    * The vector graphics that define the shape of the marker.
    */
  var markerGraphics: js.UndefOr[js.Array[CIMMarkerGraphic]] = js.undefined
  
  /**
    * A value indicating whether the frame of the vector marker should be honored when drawing the marker.
    */
  var respectFrame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether the strokes and or fills of a marker are scaled proportionally when the symbol size is changed. When enabled, the strokes for the outline or fill of the polygon symbol used to draw the marker will be scaled proportionally with changes to the symbol size. If this property is not enabled, then the stroke will draw with the specified width regardless of the marker size.
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_CIMVectorMarker: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker
  
  /**
    * A value indicating whether the marker stands upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.undefined
}
object CIMVectorMarker {
  
  inline def apply(): CIMVectorMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMVectorMarker")
    __obj.asInstanceOf[CIMVectorMarker]
  }
  
  extension [Self <: CIMVectorMarker](x: Self) {
    
    inline def setClippingPath(value: CIMClippingPath): Self = StObject.set(x, "clippingPath", value.asInstanceOf[js.Any])
    
    inline def setClippingPathUndefined: Self = StObject.set(x, "clippingPath", js.undefined)
    
    inline def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
    
    inline def setDepth3DUndefined: Self = StObject.set(x, "depth3D", js.undefined)
    
    inline def setFrame(value: ExternalReferenceEnvelope): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setMarkerGraphics(value: js.Array[CIMMarkerGraphic]): Self = StObject.set(x, "markerGraphics", value.asInstanceOf[js.Any])
    
    inline def setMarkerGraphicsUndefined: Self = StObject.set(x, "markerGraphics", js.undefined)
    
    inline def setMarkerGraphicsVarargs(value: CIMMarkerGraphic*): Self = StObject.set(x, "markerGraphics", js.Array(value*))
    
    inline def setRespectFrame(value: Boolean): Self = StObject.set(x, "respectFrame", value.asInstanceOf[js.Any])
    
    inline def setRespectFrameUndefined: Self = StObject.set(x, "respectFrame", js.undefined)
    
    inline def setScaleSymbolsProportionally(value: Boolean): Self = StObject.set(x, "scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    inline def setScaleSymbolsProportionallyUndefined: Self = StObject.set(x, "scaleSymbolsProportionally", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientation3D(value: Boolean): Self = StObject.set(x, "verticalOrientation3D", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientation3DUndefined: Self = StObject.set(x, "verticalOrientation3D", js.undefined)
  }
}
