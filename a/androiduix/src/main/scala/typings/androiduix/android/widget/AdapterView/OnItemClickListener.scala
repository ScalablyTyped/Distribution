package typings.androiduix.android.widget.AdapterView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemClickListener extends js.Object {
  def onItemClick(parent: typings.androiduix.android.widget.AdapterView[_], view: View, position: Double, id: Double): Unit
}

object OnItemClickListener {
  @scala.inline
  def apply(onItemClick: (typings.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit): OnItemClickListener = {
    val __obj = js.Dynamic.literal(onItemClick = js.Any.fromFunction4(onItemClick))
    __obj.asInstanceOf[OnItemClickListener]
  }
}

