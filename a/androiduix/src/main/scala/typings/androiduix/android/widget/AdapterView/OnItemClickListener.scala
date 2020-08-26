package typings.androiduix.android.widget.AdapterView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemClickListener extends js.Object {
  def onItemClick(parent: typings.androiduix.android.widget.AdapterView[_], view: View, position: Double, id: Double): Unit = js.native
}

object OnItemClickListener {
  @scala.inline
  def apply(onItemClick: (typings.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit): OnItemClickListener = {
    val __obj = js.Dynamic.literal(onItemClick = js.Any.fromFunction4(onItemClick))
    __obj.asInstanceOf[OnItemClickListener]
  }
  @scala.inline
  implicit class OnItemClickListenerOps[Self <: OnItemClickListener] (val x: Self) extends AnyVal {
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
    def setOnItemClick(value: (typings.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit): Self = this.set("onItemClick", js.Any.fromFunction4(value))
  }
  
}

