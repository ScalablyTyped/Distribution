package typings
package androiduixLib.androidNs.widgetNs.AdapterViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemSelectedListener extends js.Object {
  def onItemSelected(
    parent: androiduixLib.androidNs.widgetNs.AdapterView[_],
    view: androiduixLib.androidNs.viewNs.View,
    position: scala.Double,
    id: scala.Double
  ): scala.Unit
  def onNothingSelected(parent: androiduixLib.androidNs.widgetNs.AdapterView[_]): scala.Unit
}

object OnItemSelectedListener {
  @scala.inline
  def apply(
    onItemSelected: (androiduixLib.androidNs.widgetNs.AdapterView[_], androiduixLib.androidNs.viewNs.View, scala.Double, scala.Double) => scala.Unit,
    onNothingSelected: androiduixLib.androidNs.widgetNs.AdapterView[_] => scala.Unit
  ): OnItemSelectedListener = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction4(onItemSelected), onNothingSelected = js.Any.fromFunction1(onNothingSelected))
  
    __obj.asInstanceOf[OnItemSelectedListener]
  }
}

