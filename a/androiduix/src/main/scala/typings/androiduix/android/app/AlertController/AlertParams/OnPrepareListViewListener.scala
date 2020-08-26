package typings.androiduix.android.app.AlertController.AlertParams

import typings.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPrepareListViewListener extends js.Object {
  def onPrepareListView(listView: ListView): Unit = js.native
}

object OnPrepareListViewListener {
  @scala.inline
  def apply(onPrepareListView: ListView => Unit): OnPrepareListViewListener = {
    val __obj = js.Dynamic.literal(onPrepareListView = js.Any.fromFunction1(onPrepareListView))
    __obj.asInstanceOf[OnPrepareListViewListener]
  }
  @scala.inline
  implicit class OnPrepareListViewListenerOps[Self <: OnPrepareListViewListener] (val x: Self) extends AnyVal {
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
    def setOnPrepareListView(value: ListView => Unit): Self = this.set("onPrepareListView", js.Any.fromFunction1(value))
  }
  
}

