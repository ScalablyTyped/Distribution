package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmTabStyle extends js.Object

@JSGlobal("MSForms.fmTabStyle")
@js.native
object fmTabStyle extends js.Object {
  @js.native
  sealed trait fmTabStyleButtons
    extends activexDashMsformsLib.MSFormsNs.fmTabStyle
  
  @js.native
  sealed trait fmTabStyleNone
    extends activexDashMsformsLib.MSFormsNs.fmTabStyle
  
  @js.native
  sealed trait fmTabStyleTabs
    extends activexDashMsformsLib.MSFormsNs.fmTabStyle
  
  /* 1 */ val fmTabStyleButtons: fmTabStyleButtons with scala.Double = js.native
  /* 2 */ val fmTabStyleNone: fmTabStyleNone with scala.Double = js.native
  /* 0 */ val fmTabStyleTabs: fmTabStyleTabs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmTabStyle with scala.Double] = js.native
}

