package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCompareDestination extends js.Object

@JSGlobal("Word.WdCompareDestination")
@js.native
object WdCompareDestination extends js.Object {
  @js.native
  sealed trait wdCompareDestinationNew
    extends activexDashWordLib.WordNs.WdCompareDestination
  
  @js.native
  sealed trait wdCompareDestinationOriginal
    extends activexDashWordLib.WordNs.WdCompareDestination
  
  @js.native
  sealed trait wdCompareDestinationRevised
    extends activexDashWordLib.WordNs.WdCompareDestination
  
  /* 2 */ val wdCompareDestinationNew: wdCompareDestinationNew with scala.Double = js.native
  /* 0 */ val wdCompareDestinationOriginal: wdCompareDestinationOriginal with scala.Double = js.native
  /* 1 */ val wdCompareDestinationRevised: wdCompareDestinationRevised with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCompareDestination with scala.Double] = js.native
}

