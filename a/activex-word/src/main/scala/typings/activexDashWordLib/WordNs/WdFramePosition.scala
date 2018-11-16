package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFramePosition extends js.Object

@JSGlobal("Word.WdFramePosition")
@js.native
object WdFramePosition extends js.Object {
  @js.native
  sealed trait wdFrameBottom
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameCenter
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameInside
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameLeft
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameOutside
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameRight
    extends activexDashWordLib.WordNs.WdFramePosition
  
  @js.native
  sealed trait wdFrameTop
    extends activexDashWordLib.WordNs.WdFramePosition
  
  /* -999997 */ val wdFrameBottom: wdFrameBottom with scala.Double = js.native
  /* -999995 */ val wdFrameCenter: wdFrameCenter with scala.Double = js.native
  /* -999994 */ val wdFrameInside: wdFrameInside with scala.Double = js.native
  /* -999998 */ val wdFrameLeft: wdFrameLeft with scala.Double = js.native
  /* -999993 */ val wdFrameOutside: wdFrameOutside with scala.Double = js.native
  /* -999996 */ val wdFrameRight: wdFrameRight with scala.Double = js.native
  /* -999999 */ val wdFrameTop: wdFrameTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFramePosition with scala.Double] = js.native
}

