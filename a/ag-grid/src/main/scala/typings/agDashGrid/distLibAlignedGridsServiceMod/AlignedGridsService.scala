package typings.agDashGrid.distLibAlignedGridsServiceMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEventsMod.AgEvent
import typings.agDashGrid.distLibEventsMod.ColumnEvent
import typings.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/alignedGridsService", "AlignedGridsService")
@js.native
class AlignedGridsService () extends js.Object {
  var columnController: js.Any = js.native
  var consuming: js.Any = js.native
  var eventService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var logger: js.Any = js.native
  /* private */ def fireColumnEvent(event: js.Any): js.Any = js.native
  /* private */ def fireEvent(callback: js.Any): js.Any = js.native
  /* private */ def fireScrollEvent(event: js.Any): js.Any = js.native
  def getColumnIds(event: ColumnEvent): js.Array[String] = js.native
  def getMasterColumns(event: ColumnEvent): js.Array[Column] = js.native
  def init(): Unit = js.native
  def onColumnEvent(event: AgEvent): Unit = js.native
  /* private */ def onEvent(callback: js.Any): js.Any = js.native
  /* private */ def onScrollEvent(event: js.Any): js.Any = js.native
  /* private */ def processColumnEvent(colEvent: js.Any): js.Any = js.native
  /* private */ def processGroupOpenedEvent(groupOpenedEvent: js.Any): js.Any = js.native
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
}

