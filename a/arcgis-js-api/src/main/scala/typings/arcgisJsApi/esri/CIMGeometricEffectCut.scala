package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectCut
  extends StObject
     with CIMGeometricEffect {
  
  /**
  		 * The distance from the beginning of a line that the display of the stroke starts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectCut)
  		 */
  var beginCut: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The distance from the end of a line that the display of the stroke ends.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectCut)
  		 */
  var endCut: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A value indicating whether the effect should be applied in the opposite manner.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectCut)
  		 */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The distance around the middle of a line that the display of the stroke is interrupted.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectCut)
  		 */
  var middleCut: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The primitive name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectCut)
  		 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut
}
object CIMGeometricEffectCut {
  
  inline def apply(): CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectCut")
    __obj.asInstanceOf[CIMGeometricEffectCut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectCut] (val x: Self) extends AnyVal {
    
    inline def setBeginCut(value: Double): Self = StObject.set(x, "beginCut", value.asInstanceOf[js.Any])
    
    inline def setBeginCutUndefined: Self = StObject.set(x, "beginCut", js.undefined)
    
    inline def setEndCut(value: Double): Self = StObject.set(x, "endCut", value.asInstanceOf[js.Any])
    
    inline def setEndCutUndefined: Self = StObject.set(x, "endCut", js.undefined)
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setMiddleCut(value: Double): Self = StObject.set(x, "middleCut", value.asInstanceOf[js.Any])
    
    inline def setMiddleCutUndefined: Self = StObject.set(x, "middleCut", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
