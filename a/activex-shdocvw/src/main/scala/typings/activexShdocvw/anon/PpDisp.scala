package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PpDisp extends StObject {
  
  var Cancel: Boolean
  
  var ppDisp: Any
}
object PpDisp {
  
  inline def apply(Cancel: Boolean, ppDisp: Any): PpDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpDisp]
  }
  
  extension [Self <: PpDisp](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPpDisp(value: Any): Self = StObject.set(x, "ppDisp", value.asInstanceOf[js.Any])
  }
}
