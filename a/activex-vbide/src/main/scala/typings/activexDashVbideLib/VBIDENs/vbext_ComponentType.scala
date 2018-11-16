package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_ComponentType extends js.Object

@JSGlobal("VBIDE.vbext_ComponentType")
@js.native
object vbext_ComponentType extends js.Object {
  @js.native
  sealed trait vbext_ct_ActiveXDesigner
    extends activexDashVbideLib.VBIDENs.vbext_ComponentType
  
  @js.native
  sealed trait vbext_ct_ClassModule
    extends activexDashVbideLib.VBIDENs.vbext_ComponentType
  
  @js.native
  sealed trait vbext_ct_Document
    extends activexDashVbideLib.VBIDENs.vbext_ComponentType
  
  @js.native
  sealed trait vbext_ct_MSForm
    extends activexDashVbideLib.VBIDENs.vbext_ComponentType
  
  @js.native
  sealed trait vbext_ct_StdModule
    extends activexDashVbideLib.VBIDENs.vbext_ComponentType
  
  /* 11 */ val vbext_ct_ActiveXDesigner: vbext_ct_ActiveXDesigner with scala.Double = js.native
  /* 2 */ val vbext_ct_ClassModule: vbext_ct_ClassModule with scala.Double = js.native
  /* 100 */ val vbext_ct_Document: vbext_ct_Document with scala.Double = js.native
  /* 3 */ val vbext_ct_MSForm: vbext_ct_MSForm with scala.Double = js.native
  /* 1 */ val vbext_ct_StdModule: vbext_ct_StdModule with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_ComponentType with scala.Double] = js.native
}

