package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILog extends StObject {
  
  def debug(args: Any*): Unit
}
object ILog {
  
  inline def apply(debug: /* repeated */ Any => Unit): ILog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
    __obj.asInstanceOf[ILog]
  }
  
  extension [Self <: ILog](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
  }
}
