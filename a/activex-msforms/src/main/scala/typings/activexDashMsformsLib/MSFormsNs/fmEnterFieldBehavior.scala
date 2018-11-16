package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmEnterFieldBehavior extends js.Object

@JSGlobal("MSForms.fmEnterFieldBehavior")
@js.native
object fmEnterFieldBehavior extends js.Object {
  @js.native
  sealed trait fmEnterFieldBehaviorRecallSelection
    extends activexDashMsformsLib.MSFormsNs.fmEnterFieldBehavior
  
  @js.native
  sealed trait fmEnterFieldBehaviorSelectAll
    extends activexDashMsformsLib.MSFormsNs.fmEnterFieldBehavior
  
  /* 1 */ val fmEnterFieldBehaviorRecallSelection: fmEnterFieldBehaviorRecallSelection with scala.Double = js.native
  /* 0 */ val fmEnterFieldBehaviorSelectAll: fmEnterFieldBehaviorSelectAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmEnterFieldBehavior with scala.Double] = js.native
}

