package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStopSpan extends ParagraphStyle {
  def getTabStop(): scala.Double
}

object TabStopSpan {
  @scala.inline
  def apply(getTabStop: js.Function0[scala.Double]): TabStopSpan = {
    val __obj = js.Dynamic.literal(getTabStop = getTabStop)
  
    __obj.asInstanceOf[TabStopSpan]
  }
}

