package typings
package agDashGridLib.distLibHeaderRenderingHeaderRowCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderRowType extends js.Object

@JSImport("ag-grid/dist/lib/headerRendering/headerRowComp", "HeaderRowType")
@js.native
object HeaderRowType extends js.Object {
  @js.native
  sealed trait COLUMN
    extends agDashGridLib.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType
  
  @js.native
  sealed trait COLUMN_GROUP
    extends agDashGridLib.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType
  
  @js.native
  sealed trait FLOATING_FILTER
    extends agDashGridLib.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType
  
  /* 1 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 0 */ val COLUMN_GROUP: COLUMN_GROUP with scala.Double = js.native
  /* 2 */ val FLOATING_FILTER: FLOATING_FILTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibHeaderRenderingHeaderRowCompMod.HeaderRowType with scala.Double
  ] = js.native
}

