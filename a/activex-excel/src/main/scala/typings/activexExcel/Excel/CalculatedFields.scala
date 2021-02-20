package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedFields extends StObject {
  
  def apply(Field: String): PivotField = js.native
  def apply(Field: Double): PivotField = js.native
  
  /**
    * @param UseStandardFormula [UseStandardFormula=false]
    */
  def Add(Name: String, Formula: String): PivotField = js.native
  def Add(Name: String, Formula: String, UseStandardFormula: Boolean): PivotField = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): PivotField = js.native
  def Item(Index: Double): PivotField = js.native
  
  val Parent: js.Any = js.native
  
  def _Add(Name: String, Formula: String): PivotField = js.native
  
  def _Default(Field: js.Any): PivotField = js.native
}
