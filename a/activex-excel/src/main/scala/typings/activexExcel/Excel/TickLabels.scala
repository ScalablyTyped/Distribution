package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickLabels extends StObject {
  
  var Alignment: Double
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoScaleFont: Any
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  val Depth: Double
  
  /* private */ @JSName("Excel.TickLabels_typekey")
  var ExcelDotTickLabels_typekey: TickLabels
  
  val Font: typings.activexExcel.Excel.Font
  
  val Format: ChartFormat
  
  var MultiLevel: Boolean
  
  val Name: String
  
  var NumberFormat: String
  
  var NumberFormatLinked: Boolean
  
  var NumberFormatLocal: String
  
  var Offset: Double
  
  var Orientation: XlTickLabelOrientation
  
  val Parent: Any
  
  var ReadingOrder: Double
  
  def Select(): Any
}
object TickLabels {
  
  inline def apply(
    Alignment: Double,
    Application: Application,
    AutoScaleFont: Any,
    Creator: XlCreator,
    Delete: () => Any,
    Depth: Double,
    ExcelDotTickLabels_typekey: TickLabels,
    Font: Font,
    Format: ChartFormat,
    MultiLevel: Boolean,
    Name: String,
    NumberFormat: String,
    NumberFormatLinked: Boolean,
    NumberFormatLocal: String,
    Offset: Double,
    Orientation: XlTickLabelOrientation,
    Parent: Any,
    ReadingOrder: Double,
    Select: () => Any
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.TickLabels_typekey")(ExcelDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
  
  extension [Self <: TickLabels](x: Self) {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setExcelDotTickLabels_typekey(value: TickLabels): Self = StObject.set(x, "Excel.TickLabels_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setMultiLevel(value: Boolean): Self = StObject.set(x, "MultiLevel", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLinked(value: Boolean): Self = StObject.set(x, "NumberFormatLinked", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocal(value: String): Self = StObject.set(x, "NumberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: XlTickLabelOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReadingOrder(value: Double): Self = StObject.set(x, "ReadingOrder", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
