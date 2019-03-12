package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFormulas extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): PivotFormula = js.native
  def apply(Index: scala.Double): PivotFormula = js.native
  def Add(Formula: java.lang.String): PivotFormula = js.native
  def Add(Formula: java.lang.String, UseStandardFormula: js.Any): PivotFormula = js.native
  def Item(Index: java.lang.String): PivotFormula = js.native
  def Item(Index: scala.Double): PivotFormula = js.native
  def _Add(Formula: java.lang.String): PivotFormula = js.native
  def _Default(Index: js.Any): PivotFormula = js.native
}

