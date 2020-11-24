package typings.agGrid.dateFilterMod

import typings.agGrid.componentMod.Component
import typings.agGrid.dateComponentMod.IDate
import typings.agGrid.dateComponentMod.IDateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
@js.native
class DefaultDateComponent ()
  extends Component
     with IDate {
  
  var eDateInput: js.Any = js.native
  
  @JSName("init")
  def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
  
  var listener: js.Any = js.native
}
