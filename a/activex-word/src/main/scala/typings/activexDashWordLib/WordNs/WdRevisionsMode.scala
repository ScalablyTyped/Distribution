package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsMode extends js.Object

@JSGlobal("Word.WdRevisionsMode")
@js.native
object WdRevisionsMode extends js.Object {
  @js.native
  sealed trait wdBalloonRevisions
    extends activexDashWordLib.WordNs.WdRevisionsMode
  
  @js.native
  sealed trait wdInLineRevisions
    extends activexDashWordLib.WordNs.WdRevisionsMode
  
  @js.native
  sealed trait wdMixedRevisions
    extends activexDashWordLib.WordNs.WdRevisionsMode
  
  /* 0 */ val wdBalloonRevisions: wdBalloonRevisions with scala.Double = js.native
  /* 1 */ val wdInLineRevisions: wdInLineRevisions with scala.Double = js.native
  /* 2 */ val wdMixedRevisions: wdMixedRevisions with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsMode with scala.Double] = js.native
}

