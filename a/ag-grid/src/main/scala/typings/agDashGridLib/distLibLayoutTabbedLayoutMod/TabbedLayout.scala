package typings
package agDashGridLib.distLibLayoutTabbedLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
@js.native
class TabbedLayout protected () extends js.Object {
  def this(params: TabbedLayoutParams) = this()
  var activeItem: js.Any = js.native
  var afterAttachedParams: js.Any = js.native
  var eBody: js.Any = js.native
  var eGui: js.Any = js.native
  var eHeader: js.Any = js.native
  var items: js.Any = js.native
  var params: js.Any = js.native
  /* private */ def addItem(item: js.Any): js.Any = js.native
  def getGui(): stdLib.HTMLElement = js.native
  def getMinWidth(): scala.Double = js.native
  def setAfterAttachedParams(params: js.Any): scala.Unit = js.native
  def showFirstItem(): scala.Unit = js.native
  def showItem(tabbedItem: TabbedItem): scala.Unit = js.native
  /* private */ def showItemWrapper(wrapper: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
@js.native
object TabbedLayout extends js.Object {
  var TEMPLATE: js.Any = js.native
}

