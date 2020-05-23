package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trendline extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Backward: Double
  var Backward2: Double
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  val DataLabel: typings.activexExcel.Excel.DataLabel
  var DisplayEquation: Boolean
  var DisplayRSquared: Boolean
  @JSName("Excel.Trendline_typekey")
  var ExcelDotTrendline_typekey: Trendline
  val Format: ChartFormat
  var Forward: Double
  var Forward2: Double
  val Index: Double
  var Intercept: Double
  var InterceptIsAuto: Boolean
  var Name: String
  var NameIsAuto: Boolean
  var Order: Double
  val Parent: js.Any
  var Period: Double
  var Type: XlTrendlineType
  def ClearFormats(): js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object Trendline {
  @scala.inline
  def apply(
    Application: Application,
    Backward: Double,
    Backward2: Double,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    DataLabel: DataLabel,
    Delete: () => js.Any,
    DisplayEquation: Boolean,
    DisplayRSquared: Boolean,
    ExcelDotTrendline_typekey: Trendline,
    Format: ChartFormat,
    Forward: Double,
    Forward2: Double,
    Index: Double,
    Intercept: Double,
    InterceptIsAuto: Boolean,
    Name: String,
    NameIsAuto: Boolean,
    Order: Double,
    Parent: js.Any,
    Period: Double,
    Select: () => js.Any,
    Type: XlTrendlineType
  ): Trendline = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Backward = Backward.asInstanceOf[js.Any], Backward2 = Backward2.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], DataLabel = DataLabel.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayEquation = DisplayEquation.asInstanceOf[js.Any], DisplayRSquared = DisplayRSquared.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Forward2 = Forward2.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Intercept = Intercept.asInstanceOf[js.Any], InterceptIsAuto = InterceptIsAuto.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameIsAuto = NameIsAuto.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Trendline_typekey")(ExcelDotTrendline_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trendline]
  }
}

