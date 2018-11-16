package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsWrap extends js.Object

@JSGlobal("Word.WdRevisionsWrap")
@js.native
object WdRevisionsWrap extends js.Object {
  @js.native
  sealed trait wdWrapAlways
    extends activexDashWordLib.WordNs.WdRevisionsWrap
  
  @js.native
  sealed trait wdWrapAsk
    extends activexDashWordLib.WordNs.WdRevisionsWrap
  
  @js.native
  sealed trait wdWrapNever
    extends activexDashWordLib.WordNs.WdRevisionsWrap
  
  /* 1 */ val wdWrapAlways: wdWrapAlways with scala.Double = js.native
  /* 2 */ val wdWrapAsk: wdWrapAsk with scala.Double = js.native
  /* 0 */ val wdWrapNever: wdWrapNever with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsWrap with scala.Double] = js.native
}

