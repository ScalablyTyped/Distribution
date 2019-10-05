package typings.androiduix.android.text.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStopSpan extends ParagraphStyle {
  def getTabStop(): Double
}

@JSGlobal("android.text.style.TabStopSpan")
@js.native
object TabStopSpan extends js.Object {
  @js.native
  class Standard protected () extends TabStopSpan {
    def this(where: Double) = this()
    var mTab: js.Any = js.native
    /* CompleteClass */
    override def getTabStop(): Double = js.native
  }
  
  var `type`: js.Symbol = js.native
  def isImpl(obj: js.Any): Boolean = js.native
}

