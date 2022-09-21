package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMHatchFill
  extends StObject
     with Object
     with CIMSymbolLayer {
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var enable: Boolean
  
  /**
    * The line symbol that is used to draw the hatch lines in the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var lineSymbol: CIMLineSymbol
  
  /**
    * How much to move the stroke to a new X-position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * How much to move the stroke to a new Y-position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The angle of rotation for all the strokes, in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance between the line symbols in the hatch pattern.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMHatchFill)
    */
  var separation: Double
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill
}
object CIMHatchFill {
  
  inline def apply(
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    lineSymbol: CIMLineSymbol,
    propertyIsEnumerable: PropertyKey => Boolean,
    separation: Double
  ): CIMHatchFill = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lineSymbol = lineSymbol.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), separation = separation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMHatchFill")
    __obj.asInstanceOf[CIMHatchFill]
  }
  
  extension [Self <: CIMHatchFill](x: Self) {
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setLineSymbol(value: CIMLineSymbol): Self = StObject.set(x, "lineSymbol", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
