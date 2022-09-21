package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustY extends StObject {
  
  var adjustX: js.UndefOr[Boolean] = js.undefined
  
  var adjustY: js.UndefOr[Boolean] = js.undefined
}
object AdjustY {
  
  inline def apply(): AdjustY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustY]
  }
  
  extension [Self <: AdjustY](x: Self) {
    
    inline def setAdjustX(value: Boolean): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    inline def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
    
    inline def setAdjustY(value: Boolean): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    
    inline def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
  }
}
