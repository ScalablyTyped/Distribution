package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtil extends StObject {
  
  def assert(condition: Boolean, message: String): Unit
}
object IUtil {
  
  inline def apply(assert: (Boolean, String) => Unit): IUtil = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
    __obj.asInstanceOf[IUtil]
  }
  
  extension [Self <: IUtil](x: Self) {
    
    inline def setAssert(value: (Boolean, String) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
  }
}
