package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSummaryLength extends js.Object

@JSGlobal("Word.WdSummaryLength")
@js.native
object WdSummaryLength extends js.Object {
  @js.native
  sealed trait wd100Words
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd10Percent
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd10Sentences
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd20Sentences
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd25Percent
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd500Words
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd50Percent
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  @js.native
  sealed trait wd75Percent
    extends activexDashWordLib.WordNs.WdSummaryLength
  
  /* -4 */ val wd100Words: wd100Words with scala.Double = js.native
  /* -6 */ val wd10Percent: wd10Percent with scala.Double = js.native
  /* -2 */ val wd10Sentences: wd10Sentences with scala.Double = js.native
  /* -3 */ val wd20Sentences: wd20Sentences with scala.Double = js.native
  /* -7 */ val wd25Percent: wd25Percent with scala.Double = js.native
  /* -5 */ val wd500Words: wd500Words with scala.Double = js.native
  /* -8 */ val wd50Percent: wd50Percent with scala.Double = js.native
  /* -9 */ val wd75Percent: wd75Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSummaryLength with scala.Double] = js.native
}

