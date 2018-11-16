package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmAction extends js.Object

@JSGlobal("MSForms.fmAction")
@js.native
object fmAction extends js.Object {
  @js.native
  sealed trait fmActionCopy
    extends activexDashMsformsLib.MSFormsNs.fmAction
  
  @js.native
  sealed trait fmActionCut
    extends activexDashMsformsLib.MSFormsNs.fmAction
  
  @js.native
  sealed trait fmActionDragDrop
    extends activexDashMsformsLib.MSFormsNs.fmAction
  
  @js.native
  sealed trait fmActionPaste
    extends activexDashMsformsLib.MSFormsNs.fmAction
  
  /* 1 */ val fmActionCopy: fmActionCopy with scala.Double = js.native
  /* 0 */ val fmActionCut: fmActionCut with scala.Double = js.native
  /* 3 */ val fmActionDragDrop: fmActionDragDrop with scala.Double = js.native
  /* 2 */ val fmActionPaste: fmActionPaste with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmAction with scala.Double] = js.native
}

