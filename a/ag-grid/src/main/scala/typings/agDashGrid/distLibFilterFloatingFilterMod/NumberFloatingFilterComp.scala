package typings.agDashGrid.distLibFilterFloatingFilterMod

import typings.agDashGrid.distLibFilterNumberFilterMod.SerializedNumberFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "NumberFloatingFilterComp")
@js.native
class NumberFloatingFilterComp () extends InputTextFloatingFilterComp[
      SerializedNumberFilter, 
      IFloatingFilterParams[SerializedNumberFilter, BaseFloatingFilterChange[SerializedNumberFilter]]
    ] {
  /* private */ def asNumber(value: js.Any): js.Any = js.native
}

