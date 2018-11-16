package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trendlines extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): Trendline = js.native
  /** @param Type [Type=-4132] */
  def Add(
    Type: js.UndefOr[XlTrendlineType],
    Order: js.UndefOr[scala.Double],
    Period: js.UndefOr[scala.Double],
    Forward: js.UndefOr[scala.Double],
    Backward: js.UndefOr[scala.Double],
    Intercept: js.UndefOr[js.Any],
    DisplayEquation: js.UndefOr[scala.Boolean],
    DisplayRSquared: js.UndefOr[scala.Boolean],
    Name: js.UndefOr[java.lang.String]
  ): Trendline = js.native
  def Item(Index: scala.Double): Trendline = js.native
  def _Default(): Trendline = js.native
  def _Default(Index: js.Any): Trendline = js.native
}

