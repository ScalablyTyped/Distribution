package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[text] = js.undefined
}
object OffsetX {
  
  inline def apply(): OffsetX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetX]
  }
  
  extension [Self <: OffsetX](x: Self) {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
