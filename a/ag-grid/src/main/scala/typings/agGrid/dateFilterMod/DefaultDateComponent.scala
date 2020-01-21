package typings.agGrid.dateFilterMod

import typings.agGrid.componentMod.Component
import typings.agGrid.dateComponentMod.IDate
import typings.agGrid.dateComponentMod.IDateParams
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
@js.native
class DefaultDateComponent ()
  extends Component
     with IDate {
  var eDateInput: js.Any = js.native
  var listener: js.Any = js.native
  /** Returns the current date represented by this editor */
  /* CompleteClass */
  override def getDate(): Date = js.native
  @JSName("init")
  def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
  /** Sets the date represented by this component */
  /* CompleteClass */
  override def setDate(date: Date): Unit = js.native
}

