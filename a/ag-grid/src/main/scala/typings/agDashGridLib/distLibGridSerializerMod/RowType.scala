package typings
package agDashGridLib.distLibGridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowType extends js.Object

@JSImport("ag-grid/dist/lib/gridSerializer", "RowType")
@js.native
object RowType extends js.Object {
  @js.native
  sealed trait BODY
    extends agDashGridLib.distLibGridSerializerMod.RowType
  
  @js.native
  sealed trait HEADER
    extends agDashGridLib.distLibGridSerializerMod.RowType
  
  @js.native
  sealed trait HEADER_GROUPING
    extends agDashGridLib.distLibGridSerializerMod.RowType
  
  /* 2 */ val BODY: BODY with scala.Double = js.native
  /* 1 */ val HEADER: HEADER with scala.Double = js.native
  /* 0 */ val HEADER_GROUPING: HEADER_GROUPING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[agDashGridLib.distLibGridSerializerMod.RowType with scala.Double] = js.native
}

