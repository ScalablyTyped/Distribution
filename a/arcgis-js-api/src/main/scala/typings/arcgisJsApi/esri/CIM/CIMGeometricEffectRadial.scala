package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectRadial
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The orientation of the line from the marker. The angle is calculated in a counterclockwise manner with 0 degrees equal to due east.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance of the line from end to end.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectRadial: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRadial
}
object CIMGeometricEffectRadial {
  
  @scala.inline
  def apply(): CIMGeometricEffectRadial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectRadial")
    __obj.asInstanceOf[CIMGeometricEffectRadial]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectRadialMutableBuilder[Self <: CIMGeometricEffectRadial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRadial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
