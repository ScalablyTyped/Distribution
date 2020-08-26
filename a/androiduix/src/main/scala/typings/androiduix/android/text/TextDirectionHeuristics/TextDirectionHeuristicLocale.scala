package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl

object TextDirectionHeuristicLocale {
  @scala.inline
  def apply(
    defaultIsRtl: () => Boolean,
    doCheck: (js.Any, js.Any, js.Any) => js.Any,
    isRtl: (String, Double, Double) => Boolean,
    mAlgorithm: js.Any
  ): TextDirectionHeuristicLocale = {
    val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionHeuristicLocale]
  }
}

