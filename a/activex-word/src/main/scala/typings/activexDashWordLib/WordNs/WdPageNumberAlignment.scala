package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPageNumberAlignment extends js.Object

@JSGlobal("Word.WdPageNumberAlignment")
@js.native
object WdPageNumberAlignment extends js.Object {
  @js.native
  sealed trait wdAlignPageNumberCenter
    extends activexDashWordLib.WordNs.WdPageNumberAlignment
  
  @js.native
  sealed trait wdAlignPageNumberInside
    extends activexDashWordLib.WordNs.WdPageNumberAlignment
  
  @js.native
  sealed trait wdAlignPageNumberLeft
    extends activexDashWordLib.WordNs.WdPageNumberAlignment
  
  @js.native
  sealed trait wdAlignPageNumberOutside
    extends activexDashWordLib.WordNs.WdPageNumberAlignment
  
  @js.native
  sealed trait wdAlignPageNumberRight
    extends activexDashWordLib.WordNs.WdPageNumberAlignment
  
  /* 1 */ val wdAlignPageNumberCenter: wdAlignPageNumberCenter with scala.Double = js.native
  /* 3 */ val wdAlignPageNumberInside: wdAlignPageNumberInside with scala.Double = js.native
  /* 0 */ val wdAlignPageNumberLeft: wdAlignPageNumberLeft with scala.Double = js.native
  /* 4 */ val wdAlignPageNumberOutside: wdAlignPageNumberOutside with scala.Double = js.native
  /* 2 */ val wdAlignPageNumberRight: wdAlignPageNumberRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPageNumberAlignment with scala.Double] = js.native
}

