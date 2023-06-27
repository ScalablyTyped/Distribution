package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSymbolLayerBase extends StObject {
  
  /**
  			 * A value indicating whether the color set at the basic properties level is applied to the symbol layer. If the symbol layer is color locked then changes made to the color in the basic properties will not be applied to the symbol layer.
  			 */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * Whether the geometric effects that are applied to the symbol layer. Effects dynamically alter the feature geometry when the symbology is applied. Multiple effects applied to a symbol layer are rendered sequentially.
  			 */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.undefined
  
  /**
  			 * A value indicating whether the symbol layer is visible. The symbol layer draws only when enabled. Currently, an invisible layer is not considered in any transformations when in a 3D context.
  			 */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The internal name of the symbol layer used for symbol level drawing.
  			 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  			 * A value indicating whether or not the symbol layer should overprint in press printing.
  			 */
  var overprint: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The primitive name.
  			 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object CIMSymbolLayerBase {
  
  inline def apply(`type`: String): CIMSymbolLayerBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSymbolLayerBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMSymbolLayerBase] (val x: Self) extends AnyVal {
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setEffects(value: js.Array[CIMGeometricEffectType]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffectType*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverprint(value: Boolean): Self = StObject.set(x, "overprint", value.asInstanceOf[js.Any])
    
    inline def setOverprintUndefined: Self = StObject.set(x, "overprint", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
