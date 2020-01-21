package typings.agGrid.scrollVisibleServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridPanel/scrollVisibleService", "ScrollVisibleService")
@js.native
class ScrollVisibleService () extends js.Object {
  var bodyHorizontalScrollShowing: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var leftVerticalScrollShowing: js.Any = js.native
  var rightVerticalScrollShowing: js.Any = js.native
  def isBodyHorizontalScrollShowing(): Boolean = js.native
  def isLeftVerticalScrollShowing(): Boolean = js.native
  def isRightVerticalScrollShowing(): Boolean = js.native
  def setScrollsVisible(params: SetScrollsVisibleParams): Unit = js.native
}

