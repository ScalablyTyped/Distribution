package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectSuppress
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * A value indicating whether to invert the suppression process. If this value is true, portions of the stroke symbol between control points are kept and all other portions are suppressed.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether the portion of the stroke symbol between control points should be suppressed. Sections that are suppressed draw with no symbol.
    */
  var suppress: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectSuppress: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectSuppress
}
object CIMGeometricEffectSuppress {
  
  @scala.inline
  def apply(): CIMGeometricEffectSuppress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectSuppress")
    __obj.asInstanceOf[CIMGeometricEffectSuppress]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectSuppressMutableBuilder[Self <: CIMGeometricEffectSuppress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectSuppress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
