package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcKind extends js.Object

@JSGlobal("Access.ProcKind")
@js.native
object ProcKind extends js.Object {
  @js.native
  sealed trait Get
    extends activexDashAccessLib.AccessNs.ProcKind
  
  @js.native
  sealed trait Let
    extends activexDashAccessLib.AccessNs.ProcKind
  
  @js.native
  sealed trait Proc
    extends activexDashAccessLib.AccessNs.ProcKind
  
  @js.native
  sealed trait Set
    extends activexDashAccessLib.AccessNs.ProcKind
  
  /* 3 */ val Get: Get with scala.Double = js.native
  /* 1 */ val Let: Let with scala.Double = js.native
  /* 0 */ val Proc: Proc with scala.Double = js.native
  /* 2 */ val Set: Set with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.ProcKind with scala.Double] = js.native
}

