package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconWarning extends StObject {
  
  var icon: Warning
}
object IconWarning {
  
  inline def apply(icon: Warning): IconWarning = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconWarning]
  }
  
  extension [Self <: IconWarning](x: Self) {
    
    inline def setIcon(value: Warning): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
