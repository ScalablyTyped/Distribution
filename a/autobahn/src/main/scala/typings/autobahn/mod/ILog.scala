package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILog extends StObject {
  
  def debug(args: js.Any*): Unit
}
object ILog {
  
  @scala.inline
  def apply(debug: /* repeated */ js.Any => Unit): ILog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
    __obj.asInstanceOf[ILog]
  }
  
  @scala.inline
  implicit class ILogMutableBuilder[Self <: ILog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
  }
}
