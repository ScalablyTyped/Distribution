package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectMove
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance to move the symbol along the X-axis of the feature geometry.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The distance to move the symbol along the Y-axis of the feature geometry.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectMove: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove = js.native
}
object CIMGeometricEffectMove {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove): CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectMove]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectMoveMutableBuilder[Self <: CIMGeometricEffectMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
