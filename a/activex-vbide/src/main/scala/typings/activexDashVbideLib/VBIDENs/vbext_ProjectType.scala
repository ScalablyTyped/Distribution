package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_ProjectType extends js.Object

@JSGlobal("VBIDE.vbext_ProjectType")
@js.native
object vbext_ProjectType extends js.Object {
  @js.native
  sealed trait vbext_pt_HostProject
    extends activexDashVbideLib.VBIDENs.vbext_ProjectType
  
  @js.native
  sealed trait vbext_pt_StandAlone
    extends activexDashVbideLib.VBIDENs.vbext_ProjectType
  
  /* 100 */ val vbext_pt_HostProject: vbext_pt_HostProject with scala.Double = js.native
  /* 101 */ val vbext_pt_StandAlone: vbext_pt_StandAlone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_ProjectType with scala.Double] = js.native
}

