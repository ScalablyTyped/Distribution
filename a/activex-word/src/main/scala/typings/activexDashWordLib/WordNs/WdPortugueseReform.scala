package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPortugueseReform extends js.Object

@JSGlobal("Word.WdPortugueseReform")
@js.native
object WdPortugueseReform extends js.Object {
  @js.native
  sealed trait wdPortugueseBoth
    extends activexDashWordLib.WordNs.WdPortugueseReform
  
  @js.native
  sealed trait wdPortuguesePostReform
    extends activexDashWordLib.WordNs.WdPortugueseReform
  
  @js.native
  sealed trait wdPortuguesePreReform
    extends activexDashWordLib.WordNs.WdPortugueseReform
  
  /* 3 */ val wdPortugueseBoth: wdPortugueseBoth with scala.Double = js.native
  /* 2 */ val wdPortuguesePostReform: wdPortuguesePostReform with scala.Double = js.native
  /* 1 */ val wdPortuguesePreReform: wdPortuguesePreReform with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPortugueseReform with scala.Double] = js.native
}

