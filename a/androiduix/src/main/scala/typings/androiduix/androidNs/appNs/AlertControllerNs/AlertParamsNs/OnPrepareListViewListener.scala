package typings.androiduix.androidNs.appNs.AlertControllerNs.AlertParamsNs

import typings.androiduix.androidNs.widgetNs.ListView
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

