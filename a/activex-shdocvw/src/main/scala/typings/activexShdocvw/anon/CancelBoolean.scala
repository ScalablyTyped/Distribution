package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBoolean extends StObject {
  
  var Cancel: Boolean
}
object CancelBoolean {
  
  inline def apply(Cancel: Boolean): CancelBoolean = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBoolean]
  }
  
  extension [Self <: CancelBoolean](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
