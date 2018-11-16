package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTablePosition extends js.Object

@JSGlobal("Word.WdTablePosition")
@js.native
object WdTablePosition extends js.Object {
  @js.native
  sealed trait wdTableBottom
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableCenter
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableInside
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableLeft
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableOutside
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableRight
    extends activexDashWordLib.WordNs.WdTablePosition
  
  @js.native
  sealed trait wdTableTop
    extends activexDashWordLib.WordNs.WdTablePosition
  
  /* -999997 */ val wdTableBottom: wdTableBottom with scala.Double = js.native
  /* -999995 */ val wdTableCenter: wdTableCenter with scala.Double = js.native
  /* -999994 */ val wdTableInside: wdTableInside with scala.Double = js.native
  /* -999998 */ val wdTableLeft: wdTableLeft with scala.Double = js.native
  /* -999993 */ val wdTableOutside: wdTableOutside with scala.Double = js.native
  /* -999996 */ val wdTableRight: wdTableRight with scala.Double = js.native
  /* -999999 */ val wdTableTop: wdTableTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTablePosition with scala.Double] = js.native
}

