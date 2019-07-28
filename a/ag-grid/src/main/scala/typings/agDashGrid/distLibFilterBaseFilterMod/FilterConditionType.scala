package typings.agDashGrid.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterConditionType extends js.Object

@JSImport("ag-grid/dist/lib/filter/baseFilter", "FilterConditionType")
@js.native
object FilterConditionType extends js.Object {
  @js.native
  sealed trait CONDITION extends FilterConditionType
  
  @js.native
  sealed trait MAIN extends FilterConditionType
  
  /* 1 */ val CONDITION: typings.agDashGrid.distLibFilterBaseFilterMod.FilterConditionType.CONDITION with Double = js.native
  /* 0 */ val MAIN: typings.agDashGrid.distLibFilterBaseFilterMod.FilterConditionType.MAIN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterConditionType with Double] = js.native
}

