package typings.agDashGrid.distLibGridSerializerMod

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
  
  /* 2 */ val BODY: typings.agDashGrid.distLibGridSerializerMod.RowType.BODY with Double = js.native
  /* 1 */ val HEADER: typings.agDashGrid.distLibGridSerializerMod.RowType.HEADER with Double = js.native
  /* 0 */ val HEADER_GROUPING: typings.agDashGrid.distLibGridSerializerMod.RowType.HEADER_GROUPING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowType with Double] = js.native
}

