package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmListStyle extends js.Object

@JSGlobal("MSForms.fmListStyle")
@js.native
object fmListStyle extends js.Object {
  @js.native
  sealed trait fmListStyleOption
    extends activexDashMsformsLib.MSFormsNs.fmListStyle
  
  @js.native
  sealed trait fmListStylePlain
    extends activexDashMsformsLib.MSFormsNs.fmListStyle
  
  /* 1 */ val fmListStyleOption: fmListStyleOption with scala.Double = js.native
  /* 0 */ val fmListStylePlain: fmListStylePlain with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmListStyle with scala.Double] = js.native
}

