package typings.awsCryptoIe11Detection

import typings.awsCryptoIe11Detection.buildKeyMod.Key
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildKeyOperationMod {
  
  trait KeyOperation extends StObject {
    
    def oncomplete(event: Event): Unit
    
    def onerror(event: Event): Unit
    
    val result: js.UndefOr[Key] = js.undefined
  }
  object KeyOperation {
    
    inline def apply(oncomplete: Event => Unit, onerror: Event => Unit): KeyOperation = {
      val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror))
      __obj.asInstanceOf[KeyOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyOperation] (val x: Self) extends AnyVal {
      
      inline def setOncomplete(value: Event => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      inline def setOnerror(value: Event => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setResult(value: Key): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
