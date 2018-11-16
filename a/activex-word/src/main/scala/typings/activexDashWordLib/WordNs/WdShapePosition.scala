package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdShapePosition extends js.Object

@JSGlobal("Word.WdShapePosition")
@js.native
object WdShapePosition extends js.Object {
  @js.native
  sealed trait wdShapeBottom
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeCenter
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeInside
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeLeft
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeOutside
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeRight
    extends activexDashWordLib.WordNs.WdShapePosition
  
  @js.native
  sealed trait wdShapeTop
    extends activexDashWordLib.WordNs.WdShapePosition
  
  /* -999997 */ val wdShapeBottom: wdShapeBottom with scala.Double = js.native
  /* -999995 */ val wdShapeCenter: wdShapeCenter with scala.Double = js.native
  /* -999994 */ val wdShapeInside: wdShapeInside with scala.Double = js.native
  /* -999998 */ val wdShapeLeft: wdShapeLeft with scala.Double = js.native
  /* -999993 */ val wdShapeOutside: wdShapeOutside with scala.Double = js.native
  /* -999996 */ val wdShapeRight: wdShapeRight with scala.Double = js.native
  /* -999999 */ val wdShapeTop: wdShapeTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdShapePosition with scala.Double] = js.native
}

