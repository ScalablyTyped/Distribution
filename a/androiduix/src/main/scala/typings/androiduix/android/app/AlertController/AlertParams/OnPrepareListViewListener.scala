package typings.androiduix.android.app.AlertController.AlertParams

import typings.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPrepareListViewListener extends js.Object {
  def onPrepareListView(listView: ListView): Unit
}

object OnPrepareListViewListener {
  @scala.inline
  def apply(onPrepareListView: ListView => Unit): OnPrepareListViewListener = {
    val __obj = js.Dynamic.literal(onPrepareListView = js.Any.fromFunction1(onPrepareListView))
    __obj.asInstanceOf[OnPrepareListViewListener]
  }
}

