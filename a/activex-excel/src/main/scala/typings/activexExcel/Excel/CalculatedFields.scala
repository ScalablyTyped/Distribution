package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedFields extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Field: String): PivotField = js.native
  def apply(Field: Double): PivotField = js.native
  /**
    * @param UseStandardFormula [UseStandardFormula=false]
    */
  def Add(Name: String, Formula: String): PivotField = js.native
  def Add(Name: String, Formula: String, UseStandardFormula: Boolean): PivotField = js.native
  def Item(Index: String): PivotField = js.native
  def Item(Index: Double): PivotField = js.native
  def _Add(Name: String, Formula: String): PivotField = js.native
  def _Default(Field: js.Any): PivotField = js.native
}

