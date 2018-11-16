package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_ProcKind extends js.Object

@JSGlobal("VBIDE.vbext_ProcKind")
@js.native
object vbext_ProcKind extends js.Object {
  @js.native
  sealed trait vbext_pk_Get
    extends activexDashVbideLib.VBIDENs.vbext_ProcKind
  
  @js.native
  sealed trait vbext_pk_Let
    extends activexDashVbideLib.VBIDENs.vbext_ProcKind
  
  @js.native
  sealed trait vbext_pk_Proc
    extends activexDashVbideLib.VBIDENs.vbext_ProcKind
  
  @js.native
  sealed trait vbext_pk_Set
    extends activexDashVbideLib.VBIDENs.vbext_ProcKind
  
  /* 3 */ val vbext_pk_Get: vbext_pk_Get with scala.Double = js.native
  /* 1 */ val vbext_pk_Let: vbext_pk_Let with scala.Double = js.native
  /* 0 */ val vbext_pk_Proc: vbext_pk_Proc with scala.Double = js.native
  /* 2 */ val vbext_pk_Set: vbext_pk_Set with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_ProcKind with scala.Double] = js.native
}

