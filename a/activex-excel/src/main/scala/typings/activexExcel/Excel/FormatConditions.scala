package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatConditions extends StObject {
  
  def apply(Index: String): FormatCondition = js.native
  def apply(Index: Double): FormatCondition = js.native
  
  def Add(
    Type: XlFormatConditionType,
    Operator: js.UndefOr[XlFormatConditionOperator],
    Formula1: js.UndefOr[String],
    Formula2: js.UndefOr[String],
    String: js.UndefOr[Any],
    TextOperator: js.UndefOr[Any],
    DateOperator: js.UndefOr[Any],
    ScopeType: js.UndefOr[Any]
  ): FormatCondition = js.native
  def Add(Type: XlFormatConditionType, Operator: `1` | `2`, Formula1: String, Formula2: String): FormatCondition = js.native
  
  def AddAboveAverage(): AboveAverage = js.native
  
  def AddColorScale(ColorScaleType: Double): ColorScale = js.native
  
  def AddDatabar(): Databar = js.native
  
  def AddIconSetCondition(): IconSetCondition = js.native
  
  def AddTop10(): Top10 = js.native
  
  def AddUniqueValues(): UniqueValues = js.native
  
  @JSName("Add")
  def Add_2(Type: `2`, Operator: Unit, Formula1: String): FormatCondition = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): FormatCondition = js.native
  def Item(Index: Double): FormatCondition = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Any = js.native
}
