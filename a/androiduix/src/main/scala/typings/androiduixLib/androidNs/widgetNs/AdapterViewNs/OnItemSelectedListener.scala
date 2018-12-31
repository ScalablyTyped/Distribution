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

