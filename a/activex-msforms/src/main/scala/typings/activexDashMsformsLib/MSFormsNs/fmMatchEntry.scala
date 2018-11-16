package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmMatchEntry extends js.Object

@JSGlobal("MSForms.fmMatchEntry")
@js.native
object fmMatchEntry extends js.Object {
  @js.native
  sealed trait fmMatchEntryComplete
    extends activexDashMsformsLib.MSFormsNs.fmMatchEntry
  
  @js.native
  sealed trait fmMatchEntryFirstLetter
    extends activexDashMsformsLib.MSFormsNs.fmMatchEntry
  
  @js.native
  sealed trait fmMatchEntryNone
    extends activexDashMsformsLib.MSFormsNs.fmMatchEntry
  
  /* 1 */ val fmMatchEntryComplete: fmMatchEntryComplete with scala.Double = js.native
  /* 0 */ val fmMatchEntryFirstLetter: fmMatchEntryFirstLetter with scala.Double = js.native
  /* 2 */ val fmMatchEntryNone: fmMatchEntryNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmMatchEntry with scala.Double] = js.native
}

