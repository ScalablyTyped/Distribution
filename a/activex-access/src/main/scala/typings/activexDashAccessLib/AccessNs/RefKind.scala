package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RefKind extends js.Object

@JSGlobal("Access.RefKind")
@js.native
object RefKind extends js.Object {
  @js.native
  sealed trait Project
    extends activexDashAccessLib.AccessNs.RefKind
  
  @js.native
  sealed trait TypeLib
    extends activexDashAccessLib.AccessNs.RefKind
  
  /* 1 */ val Project: Project with scala.Double = js.native
  /* 0 */ val TypeLib: TypeLib with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.RefKind with scala.Double] = js.native
}

