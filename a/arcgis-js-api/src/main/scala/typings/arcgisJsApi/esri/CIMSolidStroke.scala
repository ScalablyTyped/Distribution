package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Bevel
import typings.arcgisJsApi.arcgisJsApiStrings.Butt
import typings.arcgisJsApi.arcgisJsApiStrings.Miter
import typings.arcgisJsApi.arcgisJsApiStrings.Round
import typings.arcgisJsApi.arcgisJsApiStrings.Square
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSolidStroke
  extends StObject
     with Object
     with CIMSymbolLayer {
  
  /**
    * Determines how the stroke should draw at the ends of the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var capStyle: js.UndefOr[Butt | Round | Square] = js.undefined
  
  /**
    * The color that is applied to the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var color: js.Array[Double]
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var enable: Boolean
  
  /**
    * Determines how the symbol is drawn at the stroke segment connections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var joinStyle: js.UndefOr[Bevel | Round | Miter] = js.undefined
  
  /**
    * The maximum 'sharpness' that is allowed for miter joins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke
  
  /**
    * The width of the stroke.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidStroke)
    */
  var width: Double
}
object CIMSolidStroke {
  
  inline def apply(
    color: js.Array[Double],
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): CIMSolidStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMSolidStroke")
    __obj.asInstanceOf[CIMSolidStroke]
  }
  
  extension [Self <: CIMSolidStroke](x: Self) {
    
    inline def setCapStyle(value: Butt | Round | Square): Self = StObject.set(x, "capStyle", value.asInstanceOf[js.Any])
    
    inline def setCapStyleUndefined: Self = StObject.set(x, "capStyle", js.undefined)
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setJoinStyle(value: Bevel | Round | Miter): Self = StObject.set(x, "joinStyle", value.asInstanceOf[js.Any])
    
    inline def setJoinStyleUndefined: Self = StObject.set(x, "joinStyle", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
