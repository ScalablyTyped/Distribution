package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFootnoteLocation extends js.Object

@JSGlobal("Word.WdFootnoteLocation")
@js.native
object WdFootnoteLocation extends js.Object {
  @js.native
  sealed trait wdBeneathText
    extends activexDashWordLib.WordNs.WdFootnoteLocation
  
  @js.native
  sealed trait wdBottomOfPage
    extends activexDashWordLib.WordNs.WdFootnoteLocation
  
  /* 1 */ val wdBeneathText: wdBeneathText with scala.Double = js.native
  /* 0 */ val wdBottomOfPage: wdBottomOfPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFootnoteLocation with scala.Double] = js.native
}

