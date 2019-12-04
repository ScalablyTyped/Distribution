package typings.agDashGrid.distLibFilterFloatingFilterWrapperMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibFilterFloatingFilterMod.FloatingFilterChange
import typings.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterParams
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.agDashGrid.distLibWidgetsComponentMod.Component
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
  /* CompleteClass */
  override def onParentModelChanged(parentModel: M): Unit = js.native
  /* private */ def setupWidth(): js.Any = js.native
}

