package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataFormat extends js.Object {
  val AllowFillIn: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Choices: SafeArray[String] = js.native
  val Creator: XlCreator = js.native
  val DecimalPlaces: Double = js.native
  val DefaultValue: js.Any = js.native
  @JSName("Excel.ListDataFormat_typekey")
  var ExcelDotListDataFormat_typekey: ListDataFormat = js.native
  val IsPercent: Boolean = js.native
  val MaxCharacters: Double = js.native
  val MaxNumber: Double | Null = js.native
  val MinNumber: Double | Null = js.native
  val Parent: js.Any = js.native
  val ReadOnly: Boolean = js.native
  val Required: Boolean = js.native
  val Type: XlListDataType = js.native
  val _Default: XlListDataType = js.native
  val lcid: Double = js.native
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
    lcid: Double
  ): ListDataFormat = {
    val __obj = js.Dynamic.literal(AllowFillIn = AllowFillIn.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Choices = Choices.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], IsPercent = IsPercent.asInstanceOf[js.Any], MaxCharacters = MaxCharacters.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ListDataFormat_typekey")(ExcelDotListDataFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataFormat]
  }
  @scala.inline
  implicit class ListDataFormatOps[Self <: ListDataFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowFillIn(value: Boolean): Self = this.set("AllowFillIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setChoices(value: SafeArray[String]): Self = this.set("Choices", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimalPlaces(value: Double): Self = this.set("DecimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotListDataFormat_typekey(value: ListDataFormat): Self = this.set("Excel.ListDataFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPercent(value: Boolean): Self = this.set("IsPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCharacters(value: Double): Self = this.set("MaxCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("Required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XlListDataType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Default(value: XlListDataType): Self = this.set("_Default", value.asInstanceOf[js.Any])
    @scala.inline
    def setLcid(value: Double): Self = this.set("lcid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxNumber(value: Double): Self = this.set("MaxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxNumberNull: Self = this.set("MaxNumber", null)
    @scala.inline
    def setMinNumber(value: Double): Self = this.set("MinNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinNumberNull: Self = this.set("MinNumber", null)
  }
  
}

