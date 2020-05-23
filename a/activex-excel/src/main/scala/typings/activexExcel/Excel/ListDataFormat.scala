package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataFormat extends js.Object {
  val AllowFillIn: Boolean
  val Application: typings.activexExcel.Excel.Application
  val Choices: SafeArray[String]
  val Creator: XlCreator
  val DecimalPlaces: Double
  val DefaultValue: js.Any
  @JSName("Excel.ListDataFormat_typekey")
  var ExcelDotListDataFormat_typekey: ListDataFormat
  val IsPercent: Boolean
  val MaxCharacters: Double
  val MaxNumber: Double | Null
  val MinNumber: Double | Null
  val Parent: js.Any
  val ReadOnly: Boolean
  val Required: Boolean
  val Type: XlListDataType
  val _Default: XlListDataType
  val lcid: Double
}

object ListDataFormat {
  @scala.inline
  def apply(
    AllowFillIn: Boolean,
    Application: Application,
    Choices: SafeArray[String],
    Creator: XlCreator,
    DecimalPlaces: Double,
    DefaultValue: js.Any,
    ExcelDotListDataFormat_typekey: ListDataFormat,
    IsPercent: Boolean,
    MaxCharacters: Double,
    Parent: js.Any,
    ReadOnly: Boolean,
    Required: Boolean,
    Type: XlListDataType,
    _Default: XlListDataType,
    lcid: Double,
    MaxNumber: Double = null.asInstanceOf[Double],
    MinNumber: Double = null.asInstanceOf[Double]
  ): ListDataFormat = {
    val __obj = js.Dynamic.literal(AllowFillIn = AllowFillIn.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Choices = Choices.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], IsPercent = IsPercent.asInstanceOf[js.Any], MaxCharacters = MaxCharacters.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], MaxNumber = MaxNumber.asInstanceOf[js.Any], MinNumber = MinNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ListDataFormat_typekey")(ExcelDotListDataFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataFormat]
  }
}

