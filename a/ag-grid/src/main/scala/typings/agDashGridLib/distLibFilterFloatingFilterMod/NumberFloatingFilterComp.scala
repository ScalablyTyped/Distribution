package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "NumberFloatingFilterComp")
@js.native
class NumberFloatingFilterComp ()
  extends InputTextFloatingFilterComp[
      agDashGridLib.distLibFilterNumberFilterMod.SerializedNumberFilter, 
      IFloatingFilterParams[
        agDashGridLib.distLibFilterNumberFilterMod.SerializedNumberFilter, 
        BaseFloatingFilterChange[agDashGridLib.distLibFilterNumberFilterMod.SerializedNumberFilter]
      ]
    ] {
  /* private */ def asNumber(value: js.Any): js.Any = js.native
}

