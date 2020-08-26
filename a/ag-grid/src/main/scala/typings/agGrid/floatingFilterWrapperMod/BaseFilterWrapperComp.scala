package typings.agGrid.floatingFilterWrapperMod

import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.floatingFilterMod.FloatingFilterChange
import typings.agGrid.floatingFilterMod.IFloatingFilterParams
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "BaseFilterWrapperComp")
@js.native
abstract class BaseFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] ()
  extends Component
     with IFloatingFilterWrapper[M] {
  var beans: js.Any = js.native
  var column: Column = js.native
  var columnHoverService: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  /* private */ def addColumnHoverListener(): js.Any = js.native
  def enrichBody(body: HTMLElement): Unit = js.native
  @JSName("init")
  def init_MBaseFilterWrapperComp(params: P): Unit | Promise[Unit] = js.native
  /* private */ def onColumnHover(): js.Any = js.native
  /* private */ def onColumnWidthChanged(): js.Any = js.native
  /* private */ def setupWidth(): js.Any = js.native
}

