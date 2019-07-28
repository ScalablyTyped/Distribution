package typings.androiduix.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStopSpan extends ParagraphStyle {
  def getTabStop(): Double
}

object TabStopSpan {
  @scala.inline
  def apply(getTabStop: () => Double): TabStopSpan = {
    val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop))
  
    __obj.asInstanceOf[TabStopSpan]
  }
}

