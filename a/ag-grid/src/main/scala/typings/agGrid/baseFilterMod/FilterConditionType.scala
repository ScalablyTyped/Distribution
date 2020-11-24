package typings.agGrid.baseFilterMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterConditionType extends js.Object
@JSImport("ag-grid/dist/lib/filter/baseFilter", "FilterConditionType")
@js.native
object FilterConditionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterConditionType with Double] = js.native
  
  @js.native
  sealed trait CONDITION extends FilterConditionType
  /* 1 */ @js.native
  object CONDITION extends TopLevel[CONDITION with Double]
  
  @js.native
  sealed trait MAIN extends FilterConditionType
  /* 0 */ @js.native
  object MAIN extends TopLevel[MAIN with Double]
}
