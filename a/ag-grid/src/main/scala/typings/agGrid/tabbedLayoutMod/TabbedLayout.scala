package typings.agGrid.tabbedLayoutMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
@js.native
class TabbedLayout protected () extends js.Object {
  def this(params: TabbedLayoutParams) = this()
  
  var activeItem: js.Any = js.native
  
  /* private */ def addItem(item: js.Any): js.Any = js.native
  
  var afterAttachedParams: js.Any = js.native
  
  var eBody: js.Any = js.native
  
  var eGui: js.Any = js.native
  
  var eHeader: js.Any = js.native
  
  def getGui(): HTMLElement = js.native
  
  def getMinWidth(): Double = js.native
  
  var items: js.Any = js.native
  
  var params: js.Any = js.native
  
  def setAfterAttachedParams(params: js.Any): Unit = js.native
  
  def showFirstItem(): Unit = js.native
  
  def showItem(tabbedItem: TabbedItem): Unit = js.native
  
  /* private */ def showItemWrapper(wrapper: js.Any): js.Any = js.native
}
/* static members */
@JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
@js.native
object TabbedLayout extends js.Object {
  
  var TEMPLATE: js.Any = js.native
}
