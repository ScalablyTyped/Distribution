package typings.androiduix.android.text.TextDirectionHeuristics

import typings.androiduix.android.text.TextDirectionHeuristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDirectionHeuristicImpl extends TextDirectionHeuristic {
  var mAlgorithm: js.Any = js.native
  /* protected */ def defaultIsRtl(): Boolean = js.native
  /* private */ def doCheck(cs: js.Any, start: js.Any, count: js.Any): js.Any = js.native
}

object TextDirectionHeuristicImpl {
  @scala.inline
  def apply(
    defaultIsRtl: () => Boolean,
    doCheck: (js.Any, js.Any, js.Any) => js.Any,
    isRtl: (String, Double, Double) => Boolean,
    mAlgorithm: js.Any
  ): TextDirectionHeuristicImpl = {
    val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionHeuristicImpl]
  }
  @scala.inline
  implicit class TextDirectionHeuristicImplOps[Self <: TextDirectionHeuristicImpl] (val x: Self) extends AnyVal {
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
    def setDefaultIsRtl(value: () => Boolean): Self = this.set("defaultIsRtl", js.Any.fromFunction0(value))
    @scala.inline
    def setDoCheck(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("doCheck", js.Any.fromFunction3(value))
    @scala.inline
    def setMAlgorithm(value: js.Any): Self = this.set("mAlgorithm", value.asInstanceOf[js.Any])
  }
  
}

