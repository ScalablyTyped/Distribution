package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedFields extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Field: java.lang.String): PivotField = js.native
  def apply(Field: scala.Double): PivotField = js.native
  /**
    * @param UseStandardFormula [UseStandardFormula=false]
    */
  def Add(Name: java.lang.String, Formula: java.lang.String): PivotField = js.native
  def Add(Name: java.lang.String, Formula: java.lang.String, UseStandardFormula: scala.Boolean): PivotField = js.native
  def Item(Index: java.lang.String): PivotField = js.native
  def Item(Index: scala.Double): PivotField = js.native
  def _Add(Name: java.lang.String, Formula: java.lang.String): PivotField = js.native
  def _Default(Field: js.Any): PivotField = js.native
}

