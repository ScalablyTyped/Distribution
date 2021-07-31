package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectJog
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The angle of the jog in the line which is measured in degrees.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the segment that forms the jog in the line.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the center of the jog, as a percentage measured from the start of the input geometry.
    */
  var position: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectJog: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog
}
object CIMGeometricEffectJog {
  
  @scala.inline
  def apply(): CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectJog")
    __obj.asInstanceOf[CIMGeometricEffectJog]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectJogMutableBuilder[Self <: CIMGeometricEffectJog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
