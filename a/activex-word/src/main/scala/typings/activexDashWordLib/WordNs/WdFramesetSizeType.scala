package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFramesetSizeType extends js.Object

@JSGlobal("Word.WdFramesetSizeType")
@js.native
object WdFramesetSizeType extends js.Object {
  @js.native
  sealed trait wdFramesetSizeTypeFixed
    extends activexDashWordLib.WordNs.WdFramesetSizeType
  
  @js.native
  sealed trait wdFramesetSizeTypePercent
    extends activexDashWordLib.WordNs.WdFramesetSizeType
  
  @js.native
  sealed trait wdFramesetSizeTypeRelative
    extends activexDashWordLib.WordNs.WdFramesetSizeType
  
  /* 1 */ val wdFramesetSizeTypeFixed: wdFramesetSizeTypeFixed with scala.Double = js.native
  /* 0 */ val wdFramesetSizeTypePercent: wdFramesetSizeTypePercent with scala.Double = js.native
  /* 2 */ val wdFramesetSizeTypeRelative: wdFramesetSizeTypeRelative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFramesetSizeType with scala.Double] = js.native
}

