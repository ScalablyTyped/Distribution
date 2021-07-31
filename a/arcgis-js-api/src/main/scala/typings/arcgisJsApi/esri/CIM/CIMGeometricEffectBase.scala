package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectBase extends StObject {
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object CIMGeometricEffectBase {
  
  @scala.inline
  def apply(`type`: String): CIMGeometricEffectBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectBase]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectBaseMutableBuilder[Self <: CIMGeometricEffectBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
