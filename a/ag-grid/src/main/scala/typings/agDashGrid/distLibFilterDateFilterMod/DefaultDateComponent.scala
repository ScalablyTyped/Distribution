package typings.agDashGrid.distLibFilterDateFilterMod

import typings.agDashGrid.distLibRenderingDateComponentMod.IDateParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.agDashGrid.distLibRenderingDateComponentMod.IDateComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
@js.native
class DefaultDateComponent () extends Component {
  var eDateInput: js.Any = js.native
  var listener: js.Any = js.native
  def getDate(): Date = js.native
  @JSName("init")
  def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
  def setDate(date: Date): Unit = js.native
}

