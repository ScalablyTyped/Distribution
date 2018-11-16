package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRelativeVerticalSize extends js.Object

@JSGlobal("Word.WdRelativeVerticalSize")
@js.native
object WdRelativeVerticalSize extends js.Object {
  @js.native
  sealed trait wdRelativeVerticalSizeBottomMarginArea
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  @js.native
  sealed trait wdRelativeVerticalSizeInnerMarginArea
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  @js.native
  sealed trait wdRelativeVerticalSizeMargin
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  @js.native
  sealed trait wdRelativeVerticalSizeOuterMarginArea
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  @js.native
  sealed trait wdRelativeVerticalSizePage
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  @js.native
  sealed trait wdRelativeVerticalSizeTopMarginArea
    extends activexDashWordLib.WordNs.WdRelativeVerticalSize
  
  /* 3 */ val wdRelativeVerticalSizeBottomMarginArea: wdRelativeVerticalSizeBottomMarginArea with scala.Double = js.native
  /* 4 */ val wdRelativeVerticalSizeInnerMarginArea: wdRelativeVerticalSizeInnerMarginArea with scala.Double = js.native
  /* 0 */ val wdRelativeVerticalSizeMargin: wdRelativeVerticalSizeMargin with scala.Double = js.native
  /* 5 */ val wdRelativeVerticalSizeOuterMarginArea: wdRelativeVerticalSizeOuterMarginArea with scala.Double = js.native
  /* 1 */ val wdRelativeVerticalSizePage: wdRelativeVerticalSizePage with scala.Double = js.native
  /* 2 */ val wdRelativeVerticalSizeTopMarginArea: wdRelativeVerticalSizeTopMarginArea with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRelativeVerticalSize with scala.Double] = js.native
}

