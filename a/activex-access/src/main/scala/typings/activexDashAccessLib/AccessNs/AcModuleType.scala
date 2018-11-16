package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcModuleType extends js.Object

@JSGlobal("Access.AcModuleType")
@js.native
object AcModuleType extends js.Object {
  @js.native
  sealed trait acClassModule
    extends activexDashAccessLib.AccessNs.AcModuleType
  
  @js.native
  sealed trait acStandardModule
    extends activexDashAccessLib.AccessNs.AcModuleType
  
  /* 1 */ val acClassModule: acClassModule with scala.Double = js.native
  /* 0 */ val acStandardModule: acStandardModule with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcModuleType with scala.Double] = js.native
}

