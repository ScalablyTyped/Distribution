package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Validation")
@js.native
class Validation protected () extends js.Object {
  val AlertStyle: scala.Double = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var ErrorMessage: java.lang.String = js.native
  var ErrorTitle: java.lang.String = js.native
  var `Excel.Validation_typekey`: Validation = js.native
  val Formula1: java.lang.String = js.native
  val Formula2: java.lang.String = js.native
  var IMEMode: scala.Double = js.native
  var IgnoreBlank: scala.Boolean = js.native
  var InCellDropdown: scala.Boolean = js.native
  var InputMessage: java.lang.String = js.native
  var InputTitle: java.lang.String = js.native
  val Operator: scala.Double = js.native
  val Parent: js.Any = js.native
  var ShowError: scala.Boolean = js.native
  var ShowInput: scala.Boolean = js.native
  val Type: scala.Double = js.native
  val Value: scala.Boolean = js.native
  def Add(): scala.Unit = js.native
  def Add(Type: XlDVType): scala.Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle): scala.Unit = js.native
  def Add(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): scala.Unit = js.native
  def Add(
    Type: XlDVType,
    AlertStyle: XlDVAlertStyle,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String
  ): scala.Unit = js.native
  def Add(
    Type: XlDVType,
    AlertStyle: XlDVAlertStyle,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String
  ): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Modify(): scala.Unit = js.native
  def Modify(Type: XlDVType): scala.Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle): scala.Unit = js.native
  def Modify(Type: XlDVType, AlertStyle: XlDVAlertStyle, Operator: XlFormatConditionOperator): scala.Unit = js.native
  def Modify(
    Type: XlDVType,
    AlertStyle: XlDVAlertStyle,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String
  ): scala.Unit = js.native
  def Modify(
    Type: XlDVType,
    AlertStyle: XlDVAlertStyle,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String
  ): scala.Unit = js.native
}

