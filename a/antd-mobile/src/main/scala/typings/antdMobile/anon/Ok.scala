package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ok extends StObject {
  
  var ok: String
}
object Ok {
  
  inline def apply(ok: String): Ok = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ok] (val x: Self) extends AnyVal {
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
