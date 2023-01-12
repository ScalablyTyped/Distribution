package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Console2 extends StObject {
  
  def log(message: String): Unit
  
  def warn(message: String): Unit
}
object Console2 {
  
  inline def apply(log: String => Unit, warn: String => Unit): Console2 = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Console2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Console2] (val x: Self) extends AnyVal {
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
