package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLayoutChangeListener extends js.Object {
  def onLayoutChange(
    v: typings.androiduix.android.view.View,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    oldLeft: Double,
    oldTop: Double,
    oldRight: Double,
    oldBottom: Double
  ): Unit = js.native
}

object OnLayoutChangeListener {
  @scala.inline
  def apply(
    onLayoutChange: (typings.androiduix.android.view.View, Double, Double, Double, Double, Double, Double, Double, Double) => Unit
  ): OnLayoutChangeListener = {
    val __obj = js.Dynamic.literal(onLayoutChange = js.Any.fromFunction9(onLayoutChange))
    __obj.asInstanceOf[OnLayoutChangeListener]
  }
  @scala.inline
  implicit class OnLayoutChangeListenerOps[Self <: OnLayoutChangeListener] (val x: Self) extends AnyVal {
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
    def setOnLayoutChange(
      value: (typings.androiduix.android.view.View, Double, Double, Double, Double, Double, Double, Double, Double) => Unit
    ): Self = this.set("onLayoutChange", js.Any.fromFunction9(value))
  }
  
}

