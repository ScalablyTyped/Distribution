package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickMark extends js.Object

@JSGlobal("Word.XlTickMark")
@js.native
object XlTickMark extends js.Object {
  @js.native
  sealed trait xlTickMarkCross
    extends activexDashWordLib.WordNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkInside
    extends activexDashWordLib.WordNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkNone
    extends activexDashWordLib.WordNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkOutside
    extends activexDashWordLib.WordNs.XlTickMark
  
  /* 4 */ val xlTickMarkCross: xlTickMarkCross with scala.Double = js.native
  /* 2 */ val xlTickMarkInside: xlTickMarkInside with scala.Double = js.native
  /* -4142 */ val xlTickMarkNone: xlTickMarkNone with scala.Double = js.native
  /* 3 */ val xlTickMarkOutside: xlTickMarkOutside with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlTickMark with scala.Double] = js.native
}

