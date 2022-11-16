package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Absolute
import typings.arcgisJsApi.arcgisJsApiStrings.Relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMVectorMarker
  extends StObject
     with CIMSymbolLayer {
  
  /**
    * The specified location where all transformation property operations originate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var anchorPoint: js.UndefOr[CIMVectorMarkerAnchorPoint] = js.undefined
  
  /**
    * A value which specifies if the anchor point location is considered a percentage of the size or as an absolute distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var anchorPointUnits: js.UndefOr[Relative | Absolute] = js.undefined
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var enable: Boolean
  
  /**
    * The outer boundary of the entire vector marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var frame: Envelope
  
  /**
    * The vector graphics that define the shape of the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var markerGraphics: js.Array[CIMMarkerGraphic]
  
  /**
    * Determines how markers are placed along a line or within a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var markerPlacement: js.UndefOr[MarkerPlacement] = js.undefined
  
  /**
    * The distance that the image is offset in the horizontal direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance that the image is offset in the vertical direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * A value indicating whether the frame of the vector marker should be honored when drawing the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var respectFrame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether the rotation is applied clockwise or counterclockwise to the marker layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var rotateClockwise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The angle of the image within the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether the strokes and or fills of a marker are scaled proportionally when the symbol size is changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height of the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMVectorMarker)
    */
  var size: Double
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker
}
object CIMVectorMarker {
  
  inline def apply(enable: Boolean, frame: Envelope, markerGraphics: js.Array[CIMMarkerGraphic], size: Double): CIMVectorMarker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], markerGraphics = markerGraphics.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMVectorMarker")
    __obj.asInstanceOf[CIMVectorMarker]
  }
  
  extension [Self <: CIMVectorMarker](x: Self) {
    
    inline def setAnchorPoint(value: CIMVectorMarkerAnchorPoint): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    inline def setAnchorPointUnits(value: Relative | Absolute): Self = StObject.set(x, "anchorPointUnits", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUnitsUndefined: Self = StObject.set(x, "anchorPointUnits", js.undefined)
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Envelope): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setMarkerGraphics(value: js.Array[CIMMarkerGraphic]): Self = StObject.set(x, "markerGraphics", value.asInstanceOf[js.Any])
    
    inline def setMarkerGraphicsVarargs(value: CIMMarkerGraphic*): Self = StObject.set(x, "markerGraphics", js.Array(value*))
    
    inline def setMarkerPlacement(value: MarkerPlacement): Self = StObject.set(x, "markerPlacement", value.asInstanceOf[js.Any])
    
    inline def setMarkerPlacementUndefined: Self = StObject.set(x, "markerPlacement", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRespectFrame(value: Boolean): Self = StObject.set(x, "respectFrame", value.asInstanceOf[js.Any])
    
    inline def setRespectFrameUndefined: Self = StObject.set(x, "respectFrame", js.undefined)
    
    inline def setRotateClockwise(value: Boolean): Self = StObject.set(x, "rotateClockwise", value.asInstanceOf[js.Any])
    
    inline def setRotateClockwiseUndefined: Self = StObject.set(x, "rotateClockwise", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleSymbolsProportionally(value: Boolean): Self = StObject.set(x, "scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    inline def setScaleSymbolsProportionallyUndefined: Self = StObject.set(x, "scaleSymbolsProportionally", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
