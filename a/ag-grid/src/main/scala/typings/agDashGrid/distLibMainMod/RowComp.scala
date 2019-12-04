package typings.agDashGrid.distLibMainMod

import typings.agDashGrid.distLibRenderingBeansMod.Beans
import typings.agDashGrid.distLibRenderingRowContainerComponentMod.RowContainerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "RowComp")
@js.native
class RowComp protected ()
  extends typings.agDashGrid.distLibRenderingRowCompMod.RowComp {
  def this(
    parentScope: js.Any,
    bodyContainerComp: RowContainerComponent,
    pinnedLeftContainerComp: RowContainerComponent,
    pinnedRightContainerComp: RowContainerComponent,
    fullWidthContainerComp: RowContainerComponent,
    rowNode: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    beans: Beans,
    animateIn: Boolean,
    useAnimationFrameForCreate: Boolean
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "RowComp")
@js.native
object RowComp extends js.Object {
  var DETAIL_CELL_RENDERER: js.Any = js.native
  var DETAIL_CELL_RENDERER_COMP_NAME: js.Any = js.native
  var DOM_DATA_KEY_RENDERED_ROW: String = js.native
  var FULL_WIDTH_CELL_RENDERER: js.Any = js.native
  var GROUP_ROW_RENDERER: js.Any = js.native
  var GROUP_ROW_RENDERER_COMP_NAME: js.Any = js.native
  var LOADING_CELL_RENDERER: js.Any = js.native
  var LOADING_CELL_RENDERER_COMP_NAME: js.Any = js.native
}

