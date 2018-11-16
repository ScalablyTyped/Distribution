package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdArrangeStyle extends js.Object

@JSGlobal("Word.WdArrangeStyle")
@js.native
object WdArrangeStyle extends js.Object {
  @js.native
  sealed trait wdIcons
    extends activexDashWordLib.WordNs.WdArrangeStyle
  
  @js.native
  sealed trait wdTiled
    extends activexDashWordLib.WordNs.WdArrangeStyle
  
  /* 1 */ val wdIcons: wdIcons with scala.Double = js.native
  /* 0 */ val wdTiled: wdTiled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdArrangeStyle with scala.Double] = js.native
}

