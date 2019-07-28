package typings.androiduix.androidNs.widgetNs.AbsListViewNs

import typings.androiduix.androidNs.graphicsNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBoundsAdjuster extends js.Object {
  def adjustListItemSelectionBounds(bounds: Rect): Unit
}

object SelectionBoundsAdjuster {
  @scala.inline
  def apply(adjustListItemSelectionBounds: Rect => Unit): SelectionBoundsAdjuster = {
    val __obj = js.Dynamic.literal(adjustListItemSelectionBounds = js.Any.fromFunction1(adjustListItemSelectionBounds))
  
    __obj.asInstanceOf[SelectionBoundsAdjuster]
  }
}

