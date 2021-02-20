package typings.awsCryptoIe11Detection

import typings.awsCryptoIe11Detection.keyMod.Key
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyOperationMod {
  
  @js.native
  trait KeyOperation extends StObject {
    
    def oncomplete(event: Event): Unit = js.native
    
    def onerror(event: Event): Unit = js.native
    
    val result: js.UndefOr[Key] = js.native
  }
  object KeyOperation {
    
    @scala.inline
    def apply(oncomplete: Event => Unit, onerror: Event => Unit): KeyOperation = {
      val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror))
      __obj.asInstanceOf[KeyOperation]
    }
    
    @scala.inline
    implicit class KeyOperationMutableBuilder[Self <: KeyOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOncomplete(value: Event => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerror(value: Event => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResult(value: Key): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
