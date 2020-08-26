package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDirectionHeuristic extends js.Object {
  def isRtl(cs: String, start: Double, count: Double): Boolean = js.native
}

object TextDirectionHeuristic {
  @scala.inline
  def apply(isRtl: (String, Double, Double) => Boolean): TextDirectionHeuristic = {
    val __obj = js.Dynamic.literal(isRtl = js.Any.fromFunction3(isRtl))
    __obj.asInstanceOf[TextDirectionHeuristic]
  }
  @scala.inline
  implicit class TextDirectionHeuristicOps[Self <: TextDirectionHeuristic] (val x: Self) extends AnyVal {
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
    def setIsRtl(value: (String, Double, Double) => Boolean): Self = this.set("isRtl", js.Any.fromFunction3(value))
  }
  
}

