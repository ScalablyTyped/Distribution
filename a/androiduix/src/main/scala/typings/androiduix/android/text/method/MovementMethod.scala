package typings.androiduix.android.text.method

import typings.androiduix.android.text.Spannable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.widget.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovementMethod extends js.Object {
  def canSelectArbitrarily(): Boolean
  def initialize(widget: TextView, text: Spannable): Unit
  def onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
  def onKeyDown(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean
  def onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean
  def onKeyUp(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean
  def onTakeFocus(widget: TextView, text: Spannable, direction: Double): Unit
  def onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
  def onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
}

object MovementMethod {
  @scala.inline
  def apply(
    canSelectArbitrarily: () => Boolean,
    initialize: (TextView, Spannable) => Unit,
    onGenericMotionEvent: (TextView, Spannable, MotionEvent) => Boolean,
    onKeyDown: (TextView, Spannable, Double, KeyEvent) => Boolean,
    onKeyOther: (TextView, Spannable, KeyEvent) => Boolean,
    onKeyUp: (TextView, Spannable, Double, KeyEvent) => Boolean,
    onTakeFocus: (TextView, Spannable, Double) => Unit,
    onTouchEvent: (TextView, Spannable, MotionEvent) => Boolean,
    onTrackballEvent: (TextView, Spannable, MotionEvent) => Boolean
  ): MovementMethod = {
    val __obj = js.Dynamic.literal(canSelectArbitrarily = js.Any.fromFunction0(canSelectArbitrarily), initialize = js.Any.fromFunction2(initialize), onGenericMotionEvent = js.Any.fromFunction3(onGenericMotionEvent), onKeyDown = js.Any.fromFunction4(onKeyDown), onKeyOther = js.Any.fromFunction3(onKeyOther), onKeyUp = js.Any.fromFunction4(onKeyUp), onTakeFocus = js.Any.fromFunction3(onTakeFocus), onTouchEvent = js.Any.fromFunction3(onTouchEvent), onTrackballEvent = js.Any.fromFunction3(onTrackballEvent))
    __obj.asInstanceOf[MovementMethod]
  }
}

