package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPointSymbol
  extends StObject
     with CIMMultiLayerSymbol
     with CIMSymbolType {
  
  /**
  			 * The amount of variation applied to the symbol, measured in degrees, propagated cumulatively to all marker symbols.
  			 */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
  			 * Whether point symbols align to the map or to the display when a rotation is applied to the map.
  			 */
  var angleAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AngleAlignment * / any */ String
  ] = js.undefined
  
  /**
  			 * The callout of the point symbol.
  			 */
  var callout: js.UndefOr[CIMCalloutType] = js.undefined
  
  /**
  			 * The size of the halo that extends beyond the symbol shape.
  			 */
  var haloSize: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The polygon symbol that is used to draw the halo for a point symbol.
  			 */
  var haloSymbol: js.UndefOr[CIMPolygonSymbol] = js.undefined
  
  /**
  			 * The primitive name.
  			 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
  			 * The X scale which changes the width of the symbol without changing the height (or depth in 3D), as a ratio.
  			 */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The collection of symbol properties that apply when the symbol is used in a 3D context.
  			 */
  var symbol3DProperties: js.UndefOr[CIM3DSymbolProperties] = js.undefined
  
  @JSName("type")
  var type_CIMPointSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol
}
object CIMPointSymbol {
  
  inline def apply(): CIMPointSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPointSymbol")
    __obj.asInstanceOf[CIMPointSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPointSymbol] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AngleAlignment * / any */ String
    ): Self = StObject.set(x, "angleAlignment", value.asInstanceOf[js.Any])
    
    inline def setAngleAlignmentUndefined: Self = StObject.set(x, "angleAlignment", js.undefined)
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCallout(value: CIMCalloutType): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    inline def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    inline def setHaloSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "haloSymbol", value.asInstanceOf[js.Any])
    
    inline def setHaloSymbolUndefined: Self = StObject.set(x, "haloSymbol", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setSymbol3DProperties(value: CIM3DSymbolProperties): Self = StObject.set(x, "symbol3DProperties", value.asInstanceOf[js.Any])
    
    inline def setSymbol3DPropertiesUndefined: Self = StObject.set(x, "symbol3DProperties", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
