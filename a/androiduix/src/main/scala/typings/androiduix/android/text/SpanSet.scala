package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanSet[E] extends js.Object {
  
  var classType: js.Any = js.native
  
  def getNextTransition(start: Double, limit: Double): Double = js.native
  
  def hasSpansIntersecting(start: Double, end: Double): Boolean = js.native
  
  def init(spanned: Spanned, start: Double, limit: Double): Unit = js.native
  
  var numberOfSpans: Double = js.native
  
  def recycle(): Unit = js.native
  
  var spanEnds: js.Array[Double] = js.native
  
  var spanFlags: js.Array[Double] = js.native
  
  var spanStarts: js.Array[Double] = js.native
  
  var spans: js.Array[E] = js.native
}
object SpanSet {
  
  @scala.inline
  def apply[E](
    classType: js.Any,
    getNextTransition: (Double, Double) => Double,
    hasSpansIntersecting: (Double, Double) => Boolean,
    init: (Spanned, Double, Double) => Unit,
    numberOfSpans: Double,
    recycle: () => Unit,
    spanEnds: js.Array[Double],
    spanFlags: js.Array[Double],
    spanStarts: js.Array[Double],
    spans: js.Array[E]
  ): SpanSet[E] = {
    val __obj = js.Dynamic.literal(classType = classType.asInstanceOf[js.Any], getNextTransition = js.Any.fromFunction2(getNextTransition), hasSpansIntersecting = js.Any.fromFunction2(hasSpansIntersecting), init = js.Any.fromFunction3(init), numberOfSpans = numberOfSpans.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), spanEnds = spanEnds.asInstanceOf[js.Any], spanFlags = spanFlags.asInstanceOf[js.Any], spanStarts = spanStarts.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanSet[E]]
  }
  
  @scala.inline
  implicit class SpanSetOps[Self <: SpanSet[_], E] (val x: Self with SpanSet[E]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassType(value: js.Any): Self = this.set("classType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNextTransition(value: (Double, Double) => Double): Self = this.set("getNextTransition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasSpansIntersecting(value: (Double, Double) => Boolean): Self = this.set("hasSpansIntersecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: (Spanned, Double, Double) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNumberOfSpans(value: Double): Self = this.set("numberOfSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpanEndsVarargs(value: Double*): Self = this.set("spanEnds", js.Array(value :_*))
    
    @scala.inline
    def setSpanEnds(value: js.Array[Double]): Self = this.set("spanEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanFlagsVarargs(value: Double*): Self = this.set("spanFlags", js.Array(value :_*))
    
    @scala.inline
    def setSpanFlags(value: js.Array[Double]): Self = this.set("spanFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanStartsVarargs(value: Double*): Self = this.set("spanStarts", js.Array(value :_*))
    
    @scala.inline
    def setSpanStarts(value: js.Array[Double]): Self = this.set("spanStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansVarargs(value: E*): Self = this.set("spans", js.Array(value :_*))
    
    @scala.inline
    def setSpans(value: js.Array[E]): Self = this.set("spans", value.asInstanceOf[js.Any])
  }
}
