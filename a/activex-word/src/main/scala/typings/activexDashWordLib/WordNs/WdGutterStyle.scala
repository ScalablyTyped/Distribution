package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdGutterStyle extends js.Object

@JSGlobal("Word.WdGutterStyle")
@js.native
object WdGutterStyle extends js.Object {
  @js.native
  sealed trait wdGutterPosLeft
    extends activexDashWordLib.WordNs.WdGutterStyle
  
  @js.native
  sealed trait wdGutterPosRight
    extends activexDashWordLib.WordNs.WdGutterStyle
  
  @js.native
  sealed trait wdGutterPosTop
    extends activexDashWordLib.WordNs.WdGutterStyle
  
  /* 0 */ val wdGutterPosLeft: wdGutterPosLeft with scala.Double = js.native
  /* 2 */ val wdGutterPosRight: wdGutterPosRight with scala.Double = js.native
  /* 1 */ val wdGutterPosTop: wdGutterPosTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdGutterStyle with scala.Double] = js.native
}

