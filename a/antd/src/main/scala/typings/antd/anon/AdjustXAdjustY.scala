package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustXAdjustY extends StObject {
  
  var adjustX: Boolean
  
  var adjustY: Boolean
}
object AdjustXAdjustY {
  
  inline def apply(adjustX: Boolean, adjustY: Boolean): AdjustXAdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustXAdjustY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdjustXAdjustY] (val x: Self) extends AnyVal {
    
    inline def setAdjustX(value: Boolean): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    inline def setAdjustY(value: Boolean): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
  }
}
