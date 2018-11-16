package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPageFit extends js.Object

@JSGlobal("Word.WdPageFit")
@js.native
object WdPageFit extends js.Object {
  @js.native
  sealed trait wdPageFitBestFit
    extends activexDashWordLib.WordNs.WdPageFit
  
  @js.native
  sealed trait wdPageFitFullPage
    extends activexDashWordLib.WordNs.WdPageFit
  
  @js.native
  sealed trait wdPageFitNone
    extends activexDashWordLib.WordNs.WdPageFit
  
  @js.native
  sealed trait wdPageFitTextFit
    extends activexDashWordLib.WordNs.WdPageFit
  
  /* 2 */ val wdPageFitBestFit: wdPageFitBestFit with scala.Double = js.native
  /* 1 */ val wdPageFitFullPage: wdPageFitFullPage with scala.Double = js.native
  /* 0 */ val wdPageFitNone: wdPageFitNone with scala.Double = js.native
  /* 3 */ val wdPageFitTextFit: wdPageFitTextFit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPageFit with scala.Double] = js.native
}

