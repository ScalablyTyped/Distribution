package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmTextAlign extends js.Object

@JSGlobal("MSForms.fmTextAlign")
@js.native
object fmTextAlign extends js.Object {
  @js.native
  sealed trait fmTextAlignCenter
    extends activexDashMsformsLib.MSFormsNs.fmTextAlign
  
  @js.native
  sealed trait fmTextAlignLeft
    extends activexDashMsformsLib.MSFormsNs.fmTextAlign
  
  @js.native
  sealed trait fmTextAlignRight
    extends activexDashMsformsLib.MSFormsNs.fmTextAlign
  
  /* 2 */ val fmTextAlignCenter: fmTextAlignCenter with scala.Double = js.native
  /* 1 */ val fmTextAlignLeft: fmTextAlignLeft with scala.Double = js.native
  /* 3 */ val fmTextAlignRight: fmTextAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmTextAlign with scala.Double] = js.native
}

