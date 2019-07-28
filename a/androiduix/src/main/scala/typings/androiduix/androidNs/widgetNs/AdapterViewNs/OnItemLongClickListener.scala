package typings.androiduix.androidNs.widgetNs.AdapterViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AdapterView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemLongClickListener extends js.Object {
  def onItemLongClick(parent: AdapterView[_], view: View, position: Double, id: Double): Boolean
}

object OnItemLongClickListener {
  @scala.inline
  def apply(onItemLongClick: (AdapterView[_], View, Double, Double) => Boolean): OnItemLongClickListener = {
    val __obj = js.Dynamic.literal(onItemLongClick = js.Any.fromFunction4(onItemLongClick))
  
    __obj.asInstanceOf[OnItemLongClickListener]
  }
}

