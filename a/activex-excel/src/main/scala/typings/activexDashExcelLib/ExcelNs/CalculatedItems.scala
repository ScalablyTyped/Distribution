package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedItems extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Field: java.lang.String): PivotItem = js.native
  def apply(Field: scala.Double): PivotItem = js.native
  /**
    * @param UseStandardFormula [UseStandardFormula=false]
    */
  def Add(Name: java.lang.String, Formula: java.lang.String): PivotItem = js.native
  def Add(Name: java.lang.String, Formula: java.lang.String, UseStandardFormula: scala.Boolean): PivotItem = js.native
  def Item(Index: java.lang.String): PivotItem = js.native
  def Item(Index: scala.Double): PivotItem = js.native
  def _Add(Name: java.lang.String, Formula: java.lang.String): PivotItem = js.native
  def _Default(Field: java.lang.String): PivotItem = js.native
  def _Default(Field: scala.Double): PivotItem = js.native
}

