package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iLoggerMod {
  
  trait ILogger extends StObject {
    
    def log(message: String): Unit
  }
  object ILogger {
    
    inline def apply(log: String => Unit): ILogger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[ILogger]
    }
    
    extension [Self <: ILogger](x: Self) {
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
}
