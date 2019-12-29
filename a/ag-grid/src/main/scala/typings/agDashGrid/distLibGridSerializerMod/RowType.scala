package typings.agDashGrid.distLibGridSerializerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowType extends js.Object

@JSImport("ag-grid/dist/lib/gridSerializer", "RowType")
@js.native
object RowType extends js.Object {
  @js.native
  sealed trait BODY extends RowType
  
  @js.native
  sealed trait HEADER extends RowType
  
  @js.native
  sealed trait HEADER_GROUPING extends RowType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowType with Double] = js.native
  /* 2 */ @js.native
  object BODY extends TopLevel[BODY with Double]
  
  /* 1 */ @js.native
  object HEADER extends TopLevel[HEADER with Double]
  
  /* 0 */ @js.native
  object HEADER_GROUPING extends TopLevel[HEADER_GROUPING with Double]
  
}

