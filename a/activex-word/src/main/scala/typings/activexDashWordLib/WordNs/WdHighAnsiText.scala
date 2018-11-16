package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHighAnsiText extends js.Object

@JSGlobal("Word.WdHighAnsiText")
@js.native
object WdHighAnsiText extends js.Object {
  @js.native
  sealed trait wdAutoDetectHighAnsiFarEast
    extends activexDashWordLib.WordNs.WdHighAnsiText
  
  @js.native
  sealed trait wdHighAnsiIsFarEast
    extends activexDashWordLib.WordNs.WdHighAnsiText
  
  @js.native
  sealed trait wdHighAnsiIsHighAnsi
    extends activexDashWordLib.WordNs.WdHighAnsiText
  
  /* 2 */ val wdAutoDetectHighAnsiFarEast: wdAutoDetectHighAnsiFarEast with scala.Double = js.native
  /* 0 */ val wdHighAnsiIsFarEast: wdHighAnsiIsFarEast with scala.Double = js.native
  /* 1 */ val wdHighAnsiIsHighAnsi: wdHighAnsiIsHighAnsi with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHighAnsiText with scala.Double] = js.native
}

