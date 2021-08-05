package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelNumbers.`5`
import typings.activexExcel.activexExcelNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validation extends StObject {
  
  def Add(): Unit = js.native
  def Add(
    Type: `1` | `4` | `2` | `6` | `5`,
    AlertStyle: js.UndefOr[XlDVAlertStyle],
    Operator: js.UndefOr[`1` | `2`],
    Formula1: js.UndefOr[String],
    Formula2: js.UndefOr[String]
  ): Unit = js.native
  def Add(Type: Unit, AlertStyle: Unit, Operator: Unit, Formula1: String): Unit = js.native
  def Add(Type: Unit, AlertStyle: Unit, Operator: XlFormatConditionOperator): Unit = js.native
  def Add(Type: Unit, AlertStyle: Unit, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Add(Type: Unit, AlertStyle: XlDVAlertStyle): Unit = js.native
  def Add(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: Unit, Formula1: String): Unit = js.native
  def Add(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): Unit = js.native
  def Add(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Add(Type: XlDVType): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: Unit, Operator: Unit, Formula1: String): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: Unit, Operator: XlFormatConditionOperator): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: Unit, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: Unit, Formula1: String): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  @JSName("Add")
  def Add_0(Type: `0`): Unit = js.native
  
  val AlertStyle: Double = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  var ErrorMessage: String = js.native
  
  var ErrorTitle: String = js.native
  
  /* private */ @JSName("Excel.Validation_typekey")
  var ExcelDotValidation_typekey: Validation = js.native
  
  val Formula1: String = js.native
  
  val Formula2: String = js.native
  
  var IMEMode: Double = js.native
  
  var IgnoreBlank: Boolean = js.native
  
  var InCellDropdown: Boolean = js.native
  
  var InputMessage: String = js.native
  
  var InputTitle: String = js.native
  
  def Modify(): Unit = js.native
  def Modify(
    Type: `1` | `4` | `2` | `6` | `5`,
    AlertStyle: js.UndefOr[XlDVAlertStyle],
    Operator: js.UndefOr[`1` | `2`],
    Formula1: js.UndefOr[String],
    Formula2: js.UndefOr[String]
  ): Unit = js.native
  def Modify(Type: Unit, AlertStyle: Unit, Operator: Unit, Formula1: String): Unit = js.native
  def Modify(Type: Unit, AlertStyle: Unit, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: Unit, AlertStyle: Unit, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Modify(Type: Unit, AlertStyle: XlDVAlertStyle): Unit = js.native
  def Modify(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: Unit, Formula1: String): Unit = js.native
  def Modify(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: Unit, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Modify(Type: XlDVType): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: Unit, Operator: Unit, Formula1: String): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: Unit, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: Unit, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: Unit, Formula1: String): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: `0`): Unit = js.native
  
  val Operator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var ShowError: Boolean = js.native
  
  var ShowInput: Boolean = js.native
  
  val Type: Double = js.native
  
  val Value: Boolean = js.native
}
