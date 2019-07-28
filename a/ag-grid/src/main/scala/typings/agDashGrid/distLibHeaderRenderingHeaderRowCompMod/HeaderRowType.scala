package typings.agDashGrid.distLibHeaderRenderingHeaderRowCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderRowType extends js.Object

@JSImport("ag-grid/dist/lib/headerRendering/headerRowComp", "HeaderRowType")
@js.native
object HeaderRowType extends js.Object {
  @js.native
  sealed trait COLUMN extends HeaderRowType
  
  @js.native
  sealed trait COLUMN_GROUP extends HeaderRowType
  
  @js.native
  sealed trait FLOATING_FILTER extends HeaderRowType
  
  /* 1 */ val COLUMN: typings.agDashGrid.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType.COLUMN with Double = js.native
  /* 0 */ val COLUMN_GROUP: typings.agDashGrid.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType.COLUMN_GROUP with Double = js.native
  /* 2 */ val FLOATING_FILTER: typings.agDashGrid.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType.FLOATING_FILTER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderRowType with Double] = js.native
}

