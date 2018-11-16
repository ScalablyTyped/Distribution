package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisType extends js.Object

@JSGlobal("Word.XlAxisType")
@js.native
object XlAxisType extends js.Object {
  @js.native
  sealed trait xlCategory
    extends activexDashWordLib.WordNs.XlAxisType
  
  @js.native
  sealed trait xlSeriesAxis
    extends activexDashWordLib.WordNs.XlAxisType
  
  @js.native
  sealed trait xlValue
    extends activexDashWordLib.WordNs.XlAxisType
  
  /* 1 */ val xlCategory: xlCategory with scala.Double = js.native
  /* 3 */ val xlSeriesAxis: xlSeriesAxis with scala.Double = js.native
  /* 2 */ val xlValue: xlValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlAxisType with scala.Double] = js.native
}

