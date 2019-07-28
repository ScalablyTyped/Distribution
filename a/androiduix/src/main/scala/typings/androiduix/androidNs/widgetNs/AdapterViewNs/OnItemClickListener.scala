package typings.androiduix.androidNs.widgetNs.AdapterViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AdapterView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemClickListener extends js.Object {
  def onItemClick(parent: AdapterView[_], view: View, position: Double, id: Double): Unit
}

object OnItemClickListener {
  @scala.inline
  def apply(onItemClick: (AdapterView[_], View, Double, Double) => Unit): OnItemClickListener = {
    val __obj = js.Dynamic.literal(onItemClick = js.Any.fromFunction4(onItemClick))
  
    __obj.asInstanceOf[OnItemClickListener]
  }
}

