package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spannable extends Spanned {
  
  def removeSpan(what: js.Any): Unit = js.native
  
  def setSpan(what: js.Any, start: Double, end: Double, flags: Double): Unit = js.native
}
object Spannable {
  
  @js.native
  trait Factory extends StObject {
    
    def newSpannable(source: String): Spannable = js.native
  }
  object Factory {
    
    @scala.inline
    def apply(newSpannable: String => Spannable): Factory = {
      val __obj = js.Dynamic.literal(newSpannable = js.Any.fromFunction1(newSpannable))
      __obj.asInstanceOf[Factory]
    }
    
    @scala.inline
    implicit class FactoryMutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewSpannable(value: String => Spannable): Self = StObject.set(x, "newSpannable", js.Any.fromFunction1(value))
    }
  }
}
