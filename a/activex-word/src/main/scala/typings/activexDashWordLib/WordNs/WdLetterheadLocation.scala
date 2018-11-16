package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLetterheadLocation extends js.Object

@JSGlobal("Word.WdLetterheadLocation")
@js.native
object WdLetterheadLocation extends js.Object {
  @js.native
  sealed trait wdLetterBottom
    extends activexDashWordLib.WordNs.WdLetterheadLocation
  
  @js.native
  sealed trait wdLetterLeft
    extends activexDashWordLib.WordNs.WdLetterheadLocation
  
  @js.native
  sealed trait wdLetterRight
    extends activexDashWordLib.WordNs.WdLetterheadLocation
  
  @js.native
  sealed trait wdLetterTop
    extends activexDashWordLib.WordNs.WdLetterheadLocation
  
  /* 1 */ val wdLetterBottom: wdLetterBottom with scala.Double = js.native
  /* 2 */ val wdLetterLeft: wdLetterLeft with scala.Double = js.native
  /* 3 */ val wdLetterRight: wdLetterRight with scala.Double = js.native
  /* 0 */ val wdLetterTop: wdLetterTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLetterheadLocation with scala.Double] = js.native
}

