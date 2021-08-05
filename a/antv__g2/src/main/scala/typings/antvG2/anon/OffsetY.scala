package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetY extends StObject {
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[text] = js.undefined
}
object OffsetY {
  
  inline def apply(): OffsetY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetY]
  }
  
  extension [Self <: OffsetY](x: Self) {
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
