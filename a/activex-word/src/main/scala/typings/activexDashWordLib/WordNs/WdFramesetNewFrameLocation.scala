package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFramesetNewFrameLocation extends js.Object

@JSGlobal("Word.WdFramesetNewFrameLocation")
@js.native
object WdFramesetNewFrameLocation extends js.Object {
  @js.native
  sealed trait wdFramesetNewFrameAbove
    extends activexDashWordLib.WordNs.WdFramesetNewFrameLocation
  
  @js.native
  sealed trait wdFramesetNewFrameBelow
    extends activexDashWordLib.WordNs.WdFramesetNewFrameLocation
  
  @js.native
  sealed trait wdFramesetNewFrameLeft
    extends activexDashWordLib.WordNs.WdFramesetNewFrameLocation
  
  @js.native
  sealed trait wdFramesetNewFrameRight
    extends activexDashWordLib.WordNs.WdFramesetNewFrameLocation
  
  /* 0 */ val wdFramesetNewFrameAbove: wdFramesetNewFrameAbove with scala.Double = js.native
  /* 1 */ val wdFramesetNewFrameBelow: wdFramesetNewFrameBelow with scala.Double = js.native
  /* 3 */ val wdFramesetNewFrameLeft: wdFramesetNewFrameLeft with scala.Double = js.native
  /* 2 */ val wdFramesetNewFrameRight: wdFramesetNewFrameRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFramesetNewFrameLocation with scala.Double] = js.native
}

