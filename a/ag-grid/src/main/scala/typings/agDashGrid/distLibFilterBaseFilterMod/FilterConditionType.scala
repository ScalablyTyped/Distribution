package typings.agDashGrid.distLibFilterBaseFilterMod

import org.scalablytyped.runtime.TopLevel
import typings.agDashGrid.distLibFilterBaseFilterMod.FilterConditionType.CONDITION
import typings.agDashGrid.distLibFilterBaseFilterMod.FilterConditionType.MAIN
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterConditionType with Double] = js.native
  /* 1 */ @js.native
  object CONDITION extends TopLevel[CONDITION with Double]
  
  /* 0 */ @js.native
  object MAIN extends TopLevel[MAIN with Double]
  
}

