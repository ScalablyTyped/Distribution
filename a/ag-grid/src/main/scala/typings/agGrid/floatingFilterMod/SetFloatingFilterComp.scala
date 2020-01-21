package typings.agGrid.floatingFilterMod

import typings.agGrid.iSerializedSetFilterMod.SerializedSetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "SetFloatingFilterComp")
@js.native
class SetFloatingFilterComp () extends InputTextFloatingFilterComp[
      SerializedSetFilter, 
      IFloatingFilterParams[SerializedSetFilter, BaseFloatingFilterChange[SerializedSetFilter]]
    ] {
  def asFloatingFilterText(parentModel: js.Array[String]): String = js.native
  def equalModels(left: SerializedSetFilter, right: SerializedSetFilter): Boolean = js.native
  @JSName("init")
  def init_MSetFloatingFilterComp(params: IFloatingFilterParams[SerializedSetFilter, BaseFloatingFilterChange[SerializedSetFilter]]): Unit = js.native
}

