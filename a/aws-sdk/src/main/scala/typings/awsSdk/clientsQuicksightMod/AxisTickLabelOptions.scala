package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisTickLabelOptions extends StObject {
  
  /**
    * Determines whether or not the axis ticks are visible.
    */
  var LabelOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LabelOptions] = js.undefined
  
  /**
    * The rotation angle of the axis tick labels.
    */
  var RotationAngle: js.UndefOr[Double] = js.undefined
}
object AxisTickLabelOptions {
  
  inline def apply(): AxisTickLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTickLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisTickLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setLabelOptions(value: LabelOptions): Self = StObject.set(x, "LabelOptions", value.asInstanceOf[js.Any])
    
    inline def setLabelOptionsUndefined: Self = StObject.set(x, "LabelOptions", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "RotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "RotationAngle", js.undefined)
  }
}
