package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustY extends StObject {
  
  var adjustX: Boolean
  
  var adjustY: Boolean
}
object AdjustY {
  
  @scala.inline
  def apply(adjustX: Boolean, adjustY: Boolean): AdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustY]
  }
  
  @scala.inline
  implicit class AdjustYMutableBuilder[Self <: AdjustY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustX(value: Boolean): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustY(value: Boolean): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
  }
}
