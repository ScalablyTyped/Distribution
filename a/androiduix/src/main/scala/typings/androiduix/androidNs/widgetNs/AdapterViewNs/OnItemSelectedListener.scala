package typings.androiduix.androidNs.widgetNs.AdapterViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AdapterView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemSelectedListener extends js.Object {
  def onItemSelected(parent: AdapterView[_], view: View, position: Double, id: Double): Unit
  def onNothingSelected(parent: AdapterView[_]): Unit
}

object OnItemSelectedListener {
  @scala.inline
  def apply(
    onItemSelected: (AdapterView[_], View, Double, Double) => Unit,
    onNothingSelected: AdapterView[_] => Unit
  ): OnItemSelectedListener = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction4(onItemSelected), onNothingSelected = js.Any.fromFunction1(onNothingSelected))
  
    __obj.asInstanceOf[OnItemSelectedListener]
  }
}

