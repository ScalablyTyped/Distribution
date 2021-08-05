package typings.astTypes

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astTypesMod {
  
  type Def = Plugin[Unit]
  
  trait Fork extends StObject {
    
    def use[T](plugin: Plugin[T]): T
  }
  object Fork {
    
    inline def apply(use: Plugin[js.Any] => js.Any): Fork = {
      val __obj = js.Dynamic.literal(use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[Fork]
    }
    
    extension [Self <: Fork](x: Self) {
      
      inline def setUse(value: Plugin[js.Any] => js.Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Plugin[T] = js.Function1[/* fork */ Fork, T]
}
