package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdVerticalAlignment extends js.Object

@JSGlobal("Word.WdVerticalAlignment")
@js.native
object WdVerticalAlignment extends js.Object {
  @js.native
  sealed trait wdAlignVerticalBottom
    extends activexDashWordLib.WordNs.WdVerticalAlignment
  
  @js.native
  sealed trait wdAlignVerticalCenter
    extends activexDashWordLib.WordNs.WdVerticalAlignment
  
  @js.native
  sealed trait wdAlignVerticalJustify
    extends activexDashWordLib.WordNs.WdVerticalAlignment
  
  @js.native
  sealed trait wdAlignVerticalTop
    extends activexDashWordLib.WordNs.WdVerticalAlignment
  
  /* 3 */ val wdAlignVerticalBottom: wdAlignVerticalBottom with scala.Double = js.native
  /* 1 */ val wdAlignVerticalCenter: wdAlignVerticalCenter with scala.Double = js.native
  /* 2 */ val wdAlignVerticalJustify: wdAlignVerticalJustify with scala.Double = js.native
  /* 0 */ val wdAlignVerticalTop: wdAlignVerticalTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdVerticalAlignment with scala.Double] = js.native
}

