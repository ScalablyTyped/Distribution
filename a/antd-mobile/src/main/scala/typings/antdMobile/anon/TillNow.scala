package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TillNow extends StObject {
  
  var tillNow: String
}
object TillNow {
  
  inline def apply(tillNow: String): TillNow = {
    val __obj = js.Dynamic.literal(tillNow = tillNow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TillNow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TillNow] (val x: Self) extends AnyVal {
    
    inline def setTillNow(value: String): Self = StObject.set(x, "tillNow", value.asInstanceOf[js.Any])
  }
}
