package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trendlines extends js.Object {
  
  def apply(Index: Double): Trendline = js.native
  
  /** @param Type [Type=-4132] */
  def Add(
    Type: js.UndefOr[XlTrendlineType],
    Order: js.UndefOr[Double],
    Period: js.UndefOr[Double],
    Forward: js.UndefOr[Double],
    Backward: js.UndefOr[Double],
    Intercept: js.UndefOr[js.Any],
    DisplayEquation: js.UndefOr[Boolean],
    DisplayRSquared: js.UndefOr[Boolean],
    Name: js.UndefOr[String]
  ): Trendline = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): Trendline = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(): Trendline = js.native
  def _Default(Index: js.Any): Trendline = js.native
}
