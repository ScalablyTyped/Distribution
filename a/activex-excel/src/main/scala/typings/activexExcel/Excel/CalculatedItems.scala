package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedItems extends js.Object {
  
  def apply(Field: String): PivotItem = js.native
  def apply(Field: Double): PivotItem = js.native
  
  /**
    * @param UseStandardFormula [UseStandardFormula=false]
    */
  def Add(Name: String, Formula: String): PivotItem = js.native
  def Add(Name: String, Formula: String, UseStandardFormula: Boolean): PivotItem = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): PivotItem = js.native
  def Item(Index: Double): PivotItem = js.native
  
  val Parent: js.Any = js.native
  
  def _Add(Name: String, Formula: String): PivotItem = js.native
  
  def _Default(Field: String): PivotItem = js.native
  def _Default(Field: Double): PivotItem = js.native
}
