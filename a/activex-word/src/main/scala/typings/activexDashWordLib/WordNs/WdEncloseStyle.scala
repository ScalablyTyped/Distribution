package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEncloseStyle extends js.Object

@JSGlobal("Word.WdEncloseStyle")
@js.native
object WdEncloseStyle extends js.Object {
  @js.native
  sealed trait wdEncloseStyleLarge
    extends activexDashWordLib.WordNs.WdEncloseStyle
  
  @js.native
  sealed trait wdEncloseStyleNone
    extends activexDashWordLib.WordNs.WdEncloseStyle
  
  @js.native
  sealed trait wdEncloseStyleSmall
    extends activexDashWordLib.WordNs.WdEncloseStyle
  
  /* 2 */ val wdEncloseStyleLarge: wdEncloseStyleLarge with scala.Double = js.native
  /* 0 */ val wdEncloseStyleNone: wdEncloseStyleNone with scala.Double = js.native
  /* 1 */ val wdEncloseStyleSmall: wdEncloseStyleSmall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEncloseStyle with scala.Double] = js.native
}

