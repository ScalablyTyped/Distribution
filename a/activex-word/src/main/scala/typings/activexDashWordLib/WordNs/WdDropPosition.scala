package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDropPosition extends js.Object

@JSGlobal("Word.WdDropPosition")
@js.native
object WdDropPosition extends js.Object {
  @js.native
  sealed trait wdDropMargin
    extends activexDashWordLib.WordNs.WdDropPosition
  
  @js.native
  sealed trait wdDropNone
    extends activexDashWordLib.WordNs.WdDropPosition
  
  @js.native
  sealed trait wdDropNormal
    extends activexDashWordLib.WordNs.WdDropPosition
  
  /* 2 */ val wdDropMargin: wdDropMargin with scala.Double = js.native
  /* 0 */ val wdDropNone: wdDropNone with scala.Double = js.native
  /* 1 */ val wdDropNormal: wdDropNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDropPosition with scala.Double] = js.native
}

