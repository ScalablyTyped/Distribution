package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_CodePaneview extends js.Object

@JSGlobal("VBIDE.vbext_CodePaneview")
@js.native
object vbext_CodePaneview extends js.Object {
  @js.native
  sealed trait vbext_cv_FullModuleView
    extends activexDashVbideLib.VBIDENs.vbext_CodePaneview
  
  @js.native
  sealed trait vbext_cv_ProcedureView
    extends activexDashVbideLib.VBIDENs.vbext_CodePaneview
  
  /* 1 */ val vbext_cv_FullModuleView: vbext_cv_FullModuleView with scala.Double = js.native
  /* 0 */ val vbext_cv_ProcedureView: vbext_cv_ProcedureView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_CodePaneview with scala.Double] = js.native
}

