package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEnvelopeOrientation extends js.Object

@JSGlobal("Word.WdEnvelopeOrientation")
@js.native
object WdEnvelopeOrientation extends js.Object {
  @js.native
  sealed trait wdCenterClockwise
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdCenterLandscape
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdCenterPortrait
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdLeftClockwise
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdLeftLandscape
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdLeftPortrait
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdRightClockwise
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdRightLandscape
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  @js.native
  sealed trait wdRightPortrait
    extends activexDashWordLib.WordNs.WdEnvelopeOrientation
  
  /* 7 */ val wdCenterClockwise: wdCenterClockwise with scala.Double = js.native
  /* 4 */ val wdCenterLandscape: wdCenterLandscape with scala.Double = js.native
  /* 1 */ val wdCenterPortrait: wdCenterPortrait with scala.Double = js.native
  /* 6 */ val wdLeftClockwise: wdLeftClockwise with scala.Double = js.native
  /* 3 */ val wdLeftLandscape: wdLeftLandscape with scala.Double = js.native
  /* 0 */ val wdLeftPortrait: wdLeftPortrait with scala.Double = js.native
  /* 8 */ val wdRightClockwise: wdRightClockwise with scala.Double = js.native
  /* 5 */ val wdRightLandscape: wdRightLandscape with scala.Double = js.native
  /* 2 */ val wdRightPortrait: wdRightPortrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEnvelopeOrientation with scala.Double] = js.native
}

