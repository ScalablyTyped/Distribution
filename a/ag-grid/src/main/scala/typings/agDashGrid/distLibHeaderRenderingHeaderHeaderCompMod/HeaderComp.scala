package typings.agDashGrid.distLibHeaderRenderingHeaderHeaderCompMod

import typings.agDashGrid.distLibWidgetsComponentMod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
@js.native
class HeaderComp ()
  extends Component
     with IHeader {
  var eFilter: js.Any = js.native
  var eLabel: js.Any = js.native
  var eMenu: js.Any = js.native
  var eSortAsc: js.Any = js.native
  var eSortDesc: js.Any = js.native
  var eSortNone: js.Any = js.native
  var eSortOrder: js.Any = js.native
  var eText: js.Any = js.native
  var eventService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var lastMovingChanged: js.Any = js.native
  var menuFactory: js.Any = js.native
  var params: js.Any = js.native
  var sortController: js.Any = js.native
  /* private */ def addInIcon(iconName: js.Any, eParent: js.Any, column: js.Any): js.Any = js.native
  @JSName("init")
  def init_MHeaderComp(params: IHeaderParams): Unit = js.native
  /* private */ def onFilterChanged(): js.Any = js.native
  /* private */ def onSortChanged(): js.Any = js.native
  /* private */ def removeSortIcons(): js.Any = js.native
  /* private */ def setMultiSortOrder(): js.Any = js.native
  /* private */ def setupFilterIcon(): js.Any = js.native
  /* private */ def setupIcons(column: js.Any): js.Any = js.native
  /* private */ def setupMenu(): js.Any = js.native
  def setupSort(): Unit = js.native
  /* private */ def setupTap(): js.Any = js.native
  /* private */ def setupText(displayName: js.Any): js.Any = js.native
  def showMenu(eventSource: HTMLElement): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
@js.native
object HeaderComp extends js.Object {
  var TEMPLATE: js.Any = js.native
}

