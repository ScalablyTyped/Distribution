package typings
package agDashGridLib.distLibRenderingColumnAnimationServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/columnAnimationService", "ColumnAnimationService")
@js.native
class ColumnAnimationService () extends js.Object {
  var active: js.Any = js.native
  var animationThreadCount: js.Any = js.native
  var executeLaterFuncs: js.Any = js.native
  var executeNextFuncs: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  /* private */ def ensureAnimationCssClassPresent(): js.Any = js.native
  def executeLaterVMTurn(func: js.Function): scala.Unit = js.native
  def executeNextVMTurn(func: js.Function): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def isActive(): scala.Boolean = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def start(): scala.Unit = js.native
}

