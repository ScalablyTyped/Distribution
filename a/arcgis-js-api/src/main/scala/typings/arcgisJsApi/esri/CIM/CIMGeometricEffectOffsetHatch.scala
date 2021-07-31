package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectOffsetHatch
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The length of the offset hatch.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The spacing of the offset hatch.
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetHatch: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch
}
object CIMGeometricEffectOffsetHatch {
  
  @scala.inline
  def apply(): CIMGeometricEffectOffsetHatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectOffsetHatch")
    __obj.asInstanceOf[CIMGeometricEffectOffsetHatch]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetHatchMutableBuilder[Self <: CIMGeometricEffectOffsetHatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
