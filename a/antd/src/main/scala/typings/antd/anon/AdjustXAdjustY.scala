package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustXAdjustY extends StObject {
  
  var adjustX: Double = js.native
  
  var adjustY: Double = js.native
}
object AdjustXAdjustY {
  
  @scala.inline
  def apply(adjustX: Double, adjustY: Double): AdjustXAdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustXAdjustY]
  }
  
  @scala.inline
  implicit class AdjustXAdjustYMutableBuilder[Self <: AdjustXAdjustY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
  }
}
