package typings.agGrid.gridSerializerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowType extends js.Object
@JSImport("ag-grid/dist/lib/gridSerializer", "RowType")
@js.native
object RowType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowType with Double] = js.native
  
  @js.native
  sealed trait BODY extends RowType
  /* 2 */ @js.native
  object BODY extends TopLevel[BODY with Double]
  
  @js.native
  sealed trait HEADER extends RowType
  /* 1 */ @js.native
  object HEADER extends TopLevel[HEADER with Double]
  
  @js.native
  sealed trait HEADER_GROUPING extends RowType
  /* 0 */ @js.native
  object HEADER_GROUPING extends TopLevel[HEADER_GROUPING with Double]
}
