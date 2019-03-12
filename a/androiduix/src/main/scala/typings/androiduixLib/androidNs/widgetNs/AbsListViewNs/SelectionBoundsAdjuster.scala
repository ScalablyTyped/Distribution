package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBoundsAdjuster extends js.Object {
  def adjustListItemSelectionBounds(bounds: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit
}

object SelectionBoundsAdjuster {
  @scala.inline
  def apply(adjustListItemSelectionBounds: androiduixLib.androidNs.graphicsNs.Rect => scala.Unit): SelectionBoundsAdjuster = {
    val __obj = js.Dynamic.literal(adjustListItemSelectionBounds = js.Any.fromFunction1(adjustListItemSelectionBounds))
  
    __obj.asInstanceOf[SelectionBoundsAdjuster]
  }
}

