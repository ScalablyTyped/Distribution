package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickLabels extends StObject {
  
  var Alignment: Double
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoScaleFont: js.Any
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Depth: Double
  
  val Font: ChartFont
  
  val Format: ChartFormat
  
  var MultiLevel: Boolean
  
  val Name: String
  
  var NumberFormat: String
  
  var NumberFormatLinked: Boolean
  
  var NumberFormatLocal: js.Any
  
  var Offset: Double
  
  var Orientation: XlTickLabelOrientation
  
  val Parent: js.Any
  
  @JSName("PowerPoint.TickLabels_typekey")
  var PowerPointDotTickLabels_typekey: TickLabels
  
  var ReadingOrder: Double
  
  def Select(): js.Any
}
object TickLabels {
  
  @scala.inline
  def apply(
    Alignment: Double,
    Application: Application,
    AutoScaleFont: js.Any,
    Creator: Double,
    Delete: () => js.Any,
    Depth: Double,
    Font: ChartFont,
    Format: ChartFormat,
    MultiLevel: Boolean,
    Name: String,
    NumberFormat: String,
    NumberFormatLinked: Boolean,
    NumberFormatLocal: js.Any,
    Offset: Double,
    Orientation: XlTickLabelOrientation,
    Parent: js.Any,
    PowerPointDotTickLabels_typekey: TickLabels,
    ReadingOrder: Double,
    Select: () => js.Any
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.TickLabels_typekey")(PowerPointDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
  
  @scala.inline
  implicit class TickLabelsMutableBuilder[Self <: TickLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLevel(value: Boolean): Self = StObject.set(x, "MultiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLinked(value: Boolean): Self = StObject.set(x, "NumberFormatLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: js.Any): Self = StObject.set(x, "NumberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: XlTickLabelOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTickLabels_typekey(value: TickLabels): Self = StObject.set(x, "PowerPoint.TickLabels_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrder(value: Double): Self = StObject.set(x, "ReadingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
