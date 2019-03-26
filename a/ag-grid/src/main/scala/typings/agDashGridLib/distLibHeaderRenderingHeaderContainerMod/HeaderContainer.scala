package typings
package agDashGridLib.distLibHeaderRenderingHeaderContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/headerContainer", "HeaderContainer")
@js.native
class HeaderContainer protected () extends js.Object {
  def this(eContainer: stdLib.HTMLElement, eViewport: stdLib.HTMLElement, pinned: java.lang.String) = this()
  @JSName("$scope")
  var $scope: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var dragAndDropService: js.Any = js.native
  var dropTarget: js.Any = js.native
  var eContainer: js.Any = js.native
  var eViewport: js.Any = js.native
  var eventService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var headerRowComps: js.Any = js.native
  var pinned: js.Any = js.native
  var scrollVisibleService: js.Any = js.native
  var scrollWidth: js.Any = js.native
  /* private */ def createHeaderRowComps(): js.Any = js.native
  def destroy(): scala.Unit = js.native
  def forEachHeaderElement(
    callback: js.Function1[
      /* renderedHeaderElement */ agDashGridLib.distLibWidgetsComponentMod.Component, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def onColumnResized(): js.Any = js.native
  /* private */ def onColumnRowGroupChanged(): js.Any = js.native
  /* private */ def onColumnValueChanged(): js.Any = js.native
  /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
  /* private */ def onGridColumnsChanged(): js.Any = js.native
  /* private */ def onScrollVisibilityChanged(): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  /* private */ def removeHeaderRowComps(): js.Any = js.native
  /* private */ def setWidthOfPinnedContainer(): js.Any = js.native
  /* private */ def setupDragAndDrop(gridComp: js.Any): js.Any = js.native
}

