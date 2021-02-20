package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanWatcher extends StObject {
  
  def onSpanAdded(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
  
  def onSpanChanged(text: Spannable, what: js.Any, ostart: Double, oend: Double, nstart: Double, nend: Double): Unit = js.native
  
  def onSpanRemoved(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
}
object SpanWatcher {
  
  @scala.inline
  def apply(
    onSpanAdded: (Spannable, js.Any, Double, Double) => Unit,
    onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Unit,
    onSpanRemoved: (Spannable, js.Any, Double, Double) => Unit
  ): SpanWatcher = {
    val __obj = js.Dynamic.literal(onSpanAdded = js.Any.fromFunction4(onSpanAdded), onSpanChanged = js.Any.fromFunction6(onSpanChanged), onSpanRemoved = js.Any.fromFunction4(onSpanRemoved))
    __obj.asInstanceOf[SpanWatcher]
  }
  
  @scala.inline
  implicit class SpanWatcherMutableBuilder[Self <: SpanWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSpanAdded(value: (Spannable, js.Any, Double, Double) => Unit): Self = StObject.set(x, "onSpanAdded", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnSpanChanged(value: (Spannable, js.Any, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onSpanChanged", js.Any.fromFunction6(value))
    
    @scala.inline
    def setOnSpanRemoved(value: (Spannable, js.Any, Double, Double) => Unit): Self = StObject.set(x, "onSpanRemoved", js.Any.fromFunction4(value))
  }
}
