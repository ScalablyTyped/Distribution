package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFramesetType extends js.Object

@JSGlobal("Word.WdFramesetType")
@js.native
object WdFramesetType extends js.Object {
  @js.native
  sealed trait wdFramesetTypeFrame
    extends activexDashWordLib.WordNs.WdFramesetType
  
  @js.native
  sealed trait wdFramesetTypeFrameset
    extends activexDashWordLib.WordNs.WdFramesetType
  
  /* 1 */ val wdFramesetTypeFrame: wdFramesetTypeFrame with scala.Double = js.native
  /* 0 */ val wdFramesetTypeFrameset: wdFramesetTypeFrameset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFramesetType with scala.Double] = js.native
}

