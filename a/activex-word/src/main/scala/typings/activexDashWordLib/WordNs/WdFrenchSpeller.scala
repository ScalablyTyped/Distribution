package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFrenchSpeller extends js.Object

@JSGlobal("Word.WdFrenchSpeller")
@js.native
object WdFrenchSpeller extends js.Object {
  @js.native
  sealed trait wdFrenchBoth
    extends activexDashWordLib.WordNs.WdFrenchSpeller
  
  @js.native
  sealed trait wdFrenchPostReform
    extends activexDashWordLib.WordNs.WdFrenchSpeller
  
  @js.native
  sealed trait wdFrenchPreReform
    extends activexDashWordLib.WordNs.WdFrenchSpeller
  
  /* 0 */ val wdFrenchBoth: wdFrenchBoth with scala.Double = js.native
  /* 2 */ val wdFrenchPostReform: wdFrenchPostReform with scala.Double = js.native
  /* 1 */ val wdFrenchPreReform: wdFrenchPreReform with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFrenchSpeller with scala.Double] = js.native
}

