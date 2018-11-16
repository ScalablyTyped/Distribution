package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdNumberForm extends js.Object

@JSGlobal("Word.WdNumberForm")
@js.native
object WdNumberForm extends js.Object {
  @js.native
  sealed trait wdNumberFormDefault
    extends activexDashWordLib.WordNs.WdNumberForm
  
  @js.native
  sealed trait wdNumberFormLining
    extends activexDashWordLib.WordNs.WdNumberForm
  
  @js.native
  sealed trait wdNumberFormOldStyle
    extends activexDashWordLib.WordNs.WdNumberForm
  
  /* 0 */ val wdNumberFormDefault: wdNumberFormDefault with scala.Double = js.native
  /* 1 */ val wdNumberFormLining: wdNumberFormLining with scala.Double = js.native
  /* 2 */ val wdNumberFormOldStyle: wdNumberFormOldStyle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdNumberForm with scala.Double] = js.native
}

