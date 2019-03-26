package typings
package agDashGridLib.distLibFilterDateFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibRenderingDateComponentMod.IDateComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
@js.native
class DefaultDateComponent ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var eDateInput: js.Any = js.native
  var listener: js.Any = js.native
  def getDate(): stdLib.Date = js.native
  @JSName("init")
  def init_MDefaultDateComponent(params: agDashGridLib.distLibRenderingDateComponentMod.IDateParams): scala.Unit = js.native
  def setDate(date: stdLib.Date): scala.Unit = js.native
}

