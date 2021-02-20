package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trendline extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Backward: Double = js.native
  
  var Backward2: Double = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def ClearFormats(): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  val DataLabel: typings.activexExcel.Excel.DataLabel = js.native
  
  def Delete(): js.Any = js.native
  
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
  
  def Select(): js.Any = js.native
  
  var Type: XlTrendlineType = js.native
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
  implicit class TrendlineMutableBuilder[Self <: Trendline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackward(value: Double): Self = StObject.set(x, "Backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackward2(value: Double): Self = StObject.set(x, "Backward2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabel(value: DataLabel): Self = StObject.set(x, "DataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayEquation(value: Boolean): Self = StObject.set(x, "DisplayEquation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayRSquared(value: Boolean): Self = StObject.set(x, "DisplayRSquared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotTrendline_typekey(value: Trendline): Self = StObject.set(x, "Excel.Trendline_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: Double): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward2(value: Double): Self = StObject.set(x, "Forward2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntercept(value: Double): Self = StObject.set(x, "Intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptIsAuto(value: Boolean): Self = StObject.set(x, "InterceptIsAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIsAuto(value: Boolean): Self = StObject.set(x, "NameIsAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: XlTrendlineType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
