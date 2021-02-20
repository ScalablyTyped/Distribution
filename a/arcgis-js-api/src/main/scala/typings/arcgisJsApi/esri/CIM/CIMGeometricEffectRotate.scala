package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectRotate
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of rotation for the symbol.
    */
  var angle: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectRotate: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRotate = js.native
}
object CIMGeometricEffectRotate {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRotate): CIMGeometricEffectRotate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectRotate]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectRotateMutableBuilder[Self <: CIMGeometricEffectRotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRotate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
