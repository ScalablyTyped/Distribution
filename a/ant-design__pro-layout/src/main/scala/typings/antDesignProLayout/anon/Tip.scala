package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tip extends StObject {
  
  var tip: js.UndefOr[String] = js.undefined
}
object Tip {
  
  inline def apply(): Tip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tip]
  }
  
  extension [Self <: Tip](x: Self) {
    
    inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
