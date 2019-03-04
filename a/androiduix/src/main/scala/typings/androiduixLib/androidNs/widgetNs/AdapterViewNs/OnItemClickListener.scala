package typings
package androiduixLib.androidNs.widgetNs.AdapterViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemClickListener extends js.Object {
  def onItemClick(
    parent: androiduixLib.androidNs.widgetNs.AdapterView[_],
    view: androiduixLib.androidNs.viewNs.View,
    position: scala.Double,
    id: scala.Double
  ): scala.Unit
}

object OnItemClickListener {
  @scala.inline
  def apply(
    onItemClick: js.Function4[
      androiduixLib.androidNs.widgetNs.AdapterView[_], 
      androiduixLib.androidNs.viewNs.View, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ]
  ): OnItemClickListener = {
    val __obj = js.Dynamic.literal(onItemClick = onItemClick)
  
    __obj.asInstanceOf[OnItemClickListener]
  }
}

