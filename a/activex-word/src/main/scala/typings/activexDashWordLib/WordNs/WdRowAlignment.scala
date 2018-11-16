package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRowAlignment extends js.Object

@JSGlobal("Word.WdRowAlignment")
@js.native
object WdRowAlignment extends js.Object {
  @js.native
  sealed trait wdAlignRowCenter
    extends activexDashWordLib.WordNs.WdRowAlignment
  
  @js.native
  sealed trait wdAlignRowLeft
    extends activexDashWordLib.WordNs.WdRowAlignment
  
  @js.native
  sealed trait wdAlignRowRight
    extends activexDashWordLib.WordNs.WdRowAlignment
  
  /* 1 */ val wdAlignRowCenter: wdAlignRowCenter with scala.Double = js.native
  /* 0 */ val wdAlignRowLeft: wdAlignRowLeft with scala.Double = js.native
  /* 2 */ val wdAlignRowRight: wdAlignRowRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRowAlignment with scala.Double] = js.native
}

