package typings
package agDashGridLib.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterConditionType extends js.Object

@JSImport("ag-grid/dist/lib/filter/baseFilter", "FilterConditionType")
@js.native
object FilterConditionType extends js.Object {
  @js.native
  sealed trait CONDITION
    extends agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType
  
  @js.native
  sealed trait MAIN
    extends agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType
  
  /* 1 */ val CONDITION: CONDITION with scala.Double = js.native
  /* 0 */ val MAIN: MAIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType with scala.Double] = js.native
}

