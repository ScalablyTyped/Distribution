package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trendline extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Backward: Double = js.native
  var Backward2: Double = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  val DataLabel: typings.activexExcel.Excel.DataLabel = js.native
  var DisplayEquation: Boolean = js.native
  var DisplayRSquared: Boolean = js.native
  @JSName("Excel.Trendline_typekey")
  var ExcelDotTrendline_typekey: Trendline = js.native
  val Format: ChartFormat = js.native
  var Forward: Double = js.native
  var Forward2: Double = js.native
  val Index: Double = js.native
  var Intercept: Double = js.native
  var InterceptIsAuto: Boolean = js.native
  var Name: String = js.native
  var NameIsAuto: Boolean = js.native
  var Order: Double = js.native
  val Parent: js.Any = js.native
  var Period: Double = js.native
  var Type: XlTrendlineType = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
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
  @scala.inline
  implicit class TrendlineOps[Self <: Trendline] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackward(value: Double): Self = this.set("Backward", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackward2(value: Double): Self = this.set("Backward2", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: Border): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataLabel(value: DataLabel): Self = this.set("DataLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayEquation(value: Boolean): Self = this.set("DisplayEquation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayRSquared(value: Boolean): Self = this.set("DisplayRSquared", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotTrendline_typekey(value: Trendline): Self = this.set("Excel.Trendline_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setForward(value: Double): Self = this.set("Forward", value.asInstanceOf[js.Any])
    @scala.inline
    def setForward2(value: Double): Self = this.set("Forward2", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntercept(value: Double): Self = this.set("Intercept", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterceptIsAuto(value: Boolean): Self = this.set("InterceptIsAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameIsAuto(value: Boolean): Self = this.set("NameIsAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: Double): Self = this.set("Period", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: XlTrendlineType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

