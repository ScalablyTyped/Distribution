package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmVerticalScrollBarSide extends js.Object

@JSGlobal("MSForms.fmVerticalScrollBarSide")
@js.native
object fmVerticalScrollBarSide extends js.Object {
  @js.native
  sealed trait fmVerticalScrollBarSideLeft
    extends activexDashMsformsLib.MSFormsNs.fmVerticalScrollBarSide
  
  @js.native
  sealed trait fmVerticalScrollBarSideRight
    extends activexDashMsformsLib.MSFormsNs.fmVerticalScrollBarSide
  
  /* 1 */ val fmVerticalScrollBarSideLeft: fmVerticalScrollBarSideLeft with scala.Double = js.native
  /* 0 */ val fmVerticalScrollBarSideRight: fmVerticalScrollBarSideRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmVerticalScrollBarSide with scala.Double] = js.native
}

