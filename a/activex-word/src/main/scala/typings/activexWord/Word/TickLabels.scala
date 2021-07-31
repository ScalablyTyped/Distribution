package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickLabels extends StObject {
  
  var Alignment: Double
  
  val Application: js.Any
  
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
  
  var ReadingOrder: Double
  
  def Select(): js.Any
  
  @JSName("Word.TickLabels_typekey")
  var WordDotTickLabels_typekey: TickLabels
}
object TickLabels {
  
  @scala.inline
  def apply(
    Alignment: Double,
    Application: js.Any,
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
    ReadingOrder: Double,
    Select: () => js.Any,
    WordDotTickLabels_typekey: TickLabels
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.TickLabels_typekey")(WordDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
  
  @scala.inline
  implicit class TickLabelsMutableBuilder[Self <: TickLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
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
    def setReadingOrder(value: Double): Self = StObject.set(x, "ReadingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotTickLabels_typekey(value: TickLabels): Self = StObject.set(x, "Word.TickLabels_typekey", value.asInstanceOf[js.Any])
  }
}
