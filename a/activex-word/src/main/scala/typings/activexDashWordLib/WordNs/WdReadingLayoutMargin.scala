package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdReadingLayoutMargin extends js.Object

@JSGlobal("Word.WdReadingLayoutMargin")
@js.native
object WdReadingLayoutMargin extends js.Object {
  @js.native
  sealed trait wdAutomaticMargin
    extends activexDashWordLib.WordNs.WdReadingLayoutMargin
  
  @js.native
  sealed trait wdFullMargin
    extends activexDashWordLib.WordNs.WdReadingLayoutMargin
  
  @js.native
  sealed trait wdSuppressMargin
    extends activexDashWordLib.WordNs.WdReadingLayoutMargin
  
  /* 0 */ val wdAutomaticMargin: wdAutomaticMargin with scala.Double = js.native
  /* 2 */ val wdFullMargin: wdFullMargin with scala.Double = js.native
  /* 1 */ val wdSuppressMargin: wdSuppressMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdReadingLayoutMargin with scala.Double] = js.native
}

