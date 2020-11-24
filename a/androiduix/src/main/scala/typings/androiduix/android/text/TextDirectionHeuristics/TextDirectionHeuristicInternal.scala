package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
  
  var mDefaultIsRtl: js.Any = js.native
}
object TextDirectionHeuristicInternal {
  
  @scala.inline
  def apply(
    defaultIsRtl: () => Boolean,
    doCheck: (js.Any, js.Any, js.Any) => js.Any,
    isRtl: (String, Double, Double) => Boolean,
    mAlgorithm: js.Any,
    mDefaultIsRtl: js.Any
  ): TextDirectionHeuristicInternal = {
    val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any], mDefaultIsRtl = mDefaultIsRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionHeuristicInternal]
  }
  
  @scala.inline
  implicit class TextDirectionHeuristicInternalOps[Self <: TextDirectionHeuristicInternal] (val x: Self) extends AnyVal {
    
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
    def setMDefaultIsRtl(value: js.Any): Self = this.set("mDefaultIsRtl", value.asInstanceOf[js.Any])
  }
}
