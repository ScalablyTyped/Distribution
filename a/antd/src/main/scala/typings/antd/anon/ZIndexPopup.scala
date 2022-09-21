package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndexPopup extends StObject {
  
  var zIndexPopup: Double
}
object ZIndexPopup {
  
  inline def apply(zIndexPopup: Double): ZIndexPopup = {
    val __obj = js.Dynamic.literal(zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexPopup]
  }
  
  extension [Self <: ZIndexPopup](x: Self) {
    
    inline def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
  }
}
