package typings.androiduix.android.widget.AdapterView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemSelectedListener extends js.Object {
  def onItemSelected(parent: typings.androiduix.android.widget.AdapterView[_], view: View, position: Double, id: Double): Unit
  def onNothingSelected(parent: typings.androiduix.android.widget.AdapterView[_]): Unit
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
}

