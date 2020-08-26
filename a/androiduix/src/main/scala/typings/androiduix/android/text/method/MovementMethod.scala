package typings.androiduix.android.text.method

import typings.androiduix.android.text.Spannable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.widget.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovementMethod extends js.Object {
  def canSelectArbitrarily(): Boolean = js.native
  def initialize(widget: TextView, text: Spannable): Unit = js.native
  def onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
  def onKeyDown(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean = js.native
  def onKeyUp(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
  def onTakeFocus(widget: TextView, text: Spannable, direction: Double): Unit = js.native
  def onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
  def onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
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
  @scala.inline
  implicit class MovementMethodOps[Self <: MovementMethod] (val x: Self) extends AnyVal {
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
    def setCanSelectArbitrarily(value: () => Boolean): Self = this.set("canSelectArbitrarily", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: (TextView, Spannable) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    @scala.inline
    def setOnGenericMotionEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = this.set("onGenericMotionEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setOnKeyDown(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = this.set("onKeyDown", js.Any.fromFunction4(value))
    @scala.inline
    def setOnKeyOther(value: (TextView, Spannable, KeyEvent) => Boolean): Self = this.set("onKeyOther", js.Any.fromFunction3(value))
    @scala.inline
    def setOnKeyUp(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = this.set("onKeyUp", js.Any.fromFunction4(value))
    @scala.inline
    def setOnTakeFocus(value: (TextView, Spannable, Double) => Unit): Self = this.set("onTakeFocus", js.Any.fromFunction3(value))
    @scala.inline
    def setOnTouchEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = this.set("onTouchEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setOnTrackballEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = this.set("onTrackballEvent", js.Any.fromFunction3(value))
  }
  
}

