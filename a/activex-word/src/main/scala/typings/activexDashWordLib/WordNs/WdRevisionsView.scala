package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsView extends js.Object

@JSGlobal("Word.WdRevisionsView")
@js.native
object WdRevisionsView extends js.Object {
  @js.native
  sealed trait wdRevisionsViewFinal
    extends activexDashWordLib.WordNs.WdRevisionsView
  
  @js.native
  sealed trait wdRevisionsViewOriginal
    extends activexDashWordLib.WordNs.WdRevisionsView
  
  /* 0 */ val wdRevisionsViewFinal: wdRevisionsViewFinal with scala.Double = js.native
  /* 1 */ val wdRevisionsViewOriginal: wdRevisionsViewOriginal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsView with scala.Double] = js.native
}

