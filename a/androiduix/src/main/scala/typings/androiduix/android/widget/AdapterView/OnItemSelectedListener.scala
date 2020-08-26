package typings.androiduix.android.widget.AdapterView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemSelectedListener extends js.Object {
  def onItemSelected(parent: typings.androiduix.android.widget.AdapterView[_], view: View, position: Double, id: Double): Unit = js.native
  def onNothingSelected(parent: typings.androiduix.android.widget.AdapterView[_]): Unit = js.native
}

object OnItemSelectedListener {
  @scala.inline
  def apply(
    onItemSelected: (typings.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit,
    onNothingSelected: typings.androiduix.android.widget.AdapterView[_] => Unit
  ): OnItemSelectedListener = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction4(onItemSelected), onNothingSelected = js.Any.fromFunction1(onNothingSelected))
    __obj.asInstanceOf[OnItemSelectedListener]
  }
  @scala.inline
  implicit class OnItemSelectedListenerOps[Self <: OnItemSelectedListener] (val x: Self) extends AnyVal {
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
    def setOnItemSelected(value: (typings.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit): Self = this.set("onItemSelected", js.Any.fromFunction4(value))
    @scala.inline
    def setOnNothingSelected(value: typings.androiduix.android.widget.AdapterView[_] => Unit): Self = this.set("onNothingSelected", js.Any.fromFunction1(value))
  }
  
}

