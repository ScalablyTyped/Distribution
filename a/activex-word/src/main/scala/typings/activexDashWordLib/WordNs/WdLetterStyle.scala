package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLetterStyle extends js.Object

@JSGlobal("Word.WdLetterStyle")
@js.native
object WdLetterStyle extends js.Object {
  @js.native
  sealed trait wdFullBlock
    extends activexDashWordLib.WordNs.WdLetterStyle
  
  @js.native
  sealed trait wdModifiedBlock
    extends activexDashWordLib.WordNs.WdLetterStyle
  
  @js.native
  sealed trait wdSemiBlock
    extends activexDashWordLib.WordNs.WdLetterStyle
  
  /* 0 */ val wdFullBlock: wdFullBlock with scala.Double = js.native
  /* 1 */ val wdModifiedBlock: wdModifiedBlock with scala.Double = js.native
  /* 2 */ val wdSemiBlock: wdSemiBlock with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLetterStyle with scala.Double] = js.native
}

