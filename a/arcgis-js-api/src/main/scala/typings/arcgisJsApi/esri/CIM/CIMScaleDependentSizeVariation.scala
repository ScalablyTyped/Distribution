package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMScaleDependentSizeVariation extends StObject {
  
  /**
    * The scale the size is associated with.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * The size for the associated scale.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation
}
object CIMScaleDependentSizeVariation {
  
  inline def apply(): CIMScaleDependentSizeVariation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMScaleDependentSizeVariation")
    __obj.asInstanceOf[CIMScaleDependentSizeVariation]
  }
  
  extension [Self <: CIMScaleDependentSizeVariation](x: Self) {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
