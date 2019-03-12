package typings
package androiduixLib.androidNs.appNs.AlertControllerNs.AlertParamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPrepareListViewListener extends js.Object {
  def onPrepareListView(listView: androiduixLib.androidNs.widgetNs.ListView): scala.Unit
}

object OnPrepareListViewListener {
  @scala.inline
  def apply(onPrepareListView: androiduixLib.androidNs.widgetNs.ListView => scala.Unit): OnPrepareListViewListener = {
    val __obj = js.Dynamic.literal(onPrepareListView = js.Any.fromFunction1(onPrepareListView))
  
    __obj.asInstanceOf[OnPrepareListViewListener]
  }
}

