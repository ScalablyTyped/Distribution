package typings
package androiduixLib.androidNs.widgetNs.AdapterViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemLongClickListener extends js.Object {
  def onItemLongClick(
    parent: androiduixLib.androidNs.widgetNs.AdapterView[_],
    view: androiduixLib.androidNs.viewNs.View,
    position: scala.Double,
    id: scala.Double
  ): scala.Boolean
}

object OnItemLongClickListener {
  @scala.inline
  def apply(
    onItemLongClick: js.Function4[
      androiduixLib.androidNs.widgetNs.AdapterView[_], 
      androiduixLib.androidNs.viewNs.View, 
      scala.Double, 
      scala.Double, 
      scala.Boolean
    ]
  ): OnItemLongClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onItemLongClick")(onItemLongClick)
    __obj.asInstanceOf[OnItemLongClickListener]
  }
}

