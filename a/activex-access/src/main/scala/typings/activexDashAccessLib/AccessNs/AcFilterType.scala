package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFilterType extends js.Object

@JSGlobal("Access.AcFilterType")
@js.native
object AcFilterType extends js.Object {
  @js.native
  sealed trait acFilterNormal
    extends activexDashAccessLib.AccessNs.AcFilterType
  
  @js.native
  sealed trait acServerFilter
    extends activexDashAccessLib.AccessNs.AcFilterType
  
  /* 0 */ val acFilterNormal: acFilterNormal with scala.Double = js.native
  /* 1 */ val acServerFilter: acServerFilter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFilterType with scala.Double] = js.native
}

