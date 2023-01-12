package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Absolute
import typings.arcgisJsApi.arcgisJsApiStrings.Relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureMarker
  extends StObject
     with CIMSymbolLayer {
  
  /**
    * The specified location where all transformation property operations originate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var anchorPoint: js.UndefOr[CIMPictureMarkerAnchorPoint] = js.undefined
  
  /**
    * A value which specifies if the anchor point location is considered a percentage of the size or as an absolute distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var anchorPointUnits: js.UndefOr[Relative | Absolute] = js.undefined
  
  /**
    * _Since 4.24_ The collection of symbol properties that apply when the symbol layer has animation data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var animatedSymbolProperties: js.UndefOr[CIMAnimatedSymbolProperties] = js.undefined
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color substitutions which allows colors in the image to be substituted with a different color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var enable: Boolean
  
  /**
    * The height of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines how markers are placed along a line or within a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var markerPlacement: js.UndefOr[MarkerPlacement] = js.undefined
  
  /**
    * The distance that the image is offset in the horizontal direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance that the image is offset in the vertical direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * A value indicating whether the rotation is applied clockwise or counterclockwise to the marker layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var rotateClockwise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The angle of the image within the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the symbol without changing the height, as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var size: Double
  
  /**
    * The color that is applied as a tint to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker
  
  /**
    * The url of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureMarker)
    */
  var url: String
}
object CIMPictureMarker {
  
  inline def apply(enable: Boolean, size: Double, url: String): CIMPictureMarker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureMarker")
    __obj.asInstanceOf[CIMPictureMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPictureMarker] (val x: Self) extends AnyVal {
    
    inline def setAnchorPoint(value: CIMPictureMarkerAnchorPoint): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    inline def setAnchorPointUnits(value: Relative | Absolute): Self = StObject.set(x, "anchorPointUnits", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUnitsUndefined: Self = StObject.set(x, "anchorPointUnits", js.undefined)
    
    inline def setAnimatedSymbolProperties(value: CIMAnimatedSymbolProperties): Self = StObject.set(x, "animatedSymbolProperties", value.asInstanceOf[js.Any])
    
    inline def setAnimatedSymbolPropertiesUndefined: Self = StObject.set(x, "animatedSymbolProperties", js.undefined)
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value*))
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMarkerPlacement(value: MarkerPlacement): Self = StObject.set(x, "markerPlacement", value.asInstanceOf[js.Any])
    
    inline def setMarkerPlacementUndefined: Self = StObject.set(x, "markerPlacement", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRotateClockwise(value: Boolean): Self = StObject.set(x, "rotateClockwise", value.asInstanceOf[js.Any])
    
    inline def setRotateClockwiseUndefined: Self = StObject.set(x, "rotateClockwise", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
