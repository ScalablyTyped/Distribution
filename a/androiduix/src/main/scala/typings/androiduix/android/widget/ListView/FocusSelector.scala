package typings.androiduix.android.widget.ListView

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusSelector extends Runnable {
  var _ListView_this: typings.androiduix.android.widget.ListView = js.native
  var mPosition: js.Any = js.native
  var mPositionTop: js.Any = js.native
  def setup(position: Double, top: Double): FocusSelector = js.native
}

object FocusSelector {
  @scala.inline
  def apply(
    _ListView_this: typings.androiduix.android.widget.ListView,
    mPosition: js.Any,
    mPositionTop: js.Any,
    run: () => js.Any,
    setup: (Double, Double) => FocusSelector
  ): FocusSelector = {
    val __obj = js.Dynamic.literal(_ListView_this = _ListView_this.asInstanceOf[js.Any], mPosition = mPosition.asInstanceOf[js.Any], mPositionTop = mPositionTop.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setup = js.Any.fromFunction2(setup))
    __obj.asInstanceOf[FocusSelector]
  }
  @scala.inline
  implicit class FocusSelectorOps[Self <: FocusSelector] (val x: Self) extends AnyVal {
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
    def set_ListView_this(value: typings.androiduix.android.widget.ListView): Self = this.set("_ListView_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPosition(value: js.Any): Self = this.set("mPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPositionTop(value: js.Any): Self = this.set("mPositionTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetup(value: (Double, Double) => FocusSelector): Self = this.set("setup", js.Any.fromFunction2(value))
  }
  
}

