package typings.androiduix.android.text

import typings.androiduix.android.text.Spannable.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spannable extends Spanned {
  def removeSpan(what: js.Any): Unit = js.native
  def setSpan(what: js.Any, start: Double, end: Double, flags: Double): Unit = js.native
}

@JSGlobal("android.text.Spannable")
@js.native
object Spannable extends js.Object {
  @js.native
  class Factory () extends js.Object {
    def newSpannable(source: String): Spannable = js.native
  }
  
  def isImpl(obj: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object Factory extends js.Object {
    var sInstance: js.Any = js.native
    def getInstance(): Factory = js.native
  }
  
}

