package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartArea extends StObject {
  
  val Application: js.Any
  
  var AutoScaleFont: js.Any
  
  val Border: ChartBorder
  
  def Clear(): js.Any
  
  def ClearContents(): js.Any
  
  def ClearFormats(): js.Any
  
  def Copy(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Font: ChartFont
  
  val Format: ChartFormat
  
  var Height: Double
  
  val Interior: typings.activexWord.Word.Interior
  
  var Left: Double
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
  
  var Shadow: Boolean
  
  var Top: Double
  
  var Width: Double
  
  @JSName("Word.ChartArea_typekey")
  var WordDotChartArea_typekey: ChartArea
}
object ChartArea {
  
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: ChartBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double,
    WordDotChartArea_typekey: ChartArea
  ): ChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartArea_typekey")(WordDotChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
  
  @scala.inline
  implicit class ChartAreaMutableBuilder[Self <: ChartArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => js.Any): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearContents(value: () => js.Any): Self = StObject.set(x, "ClearContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => js.Any): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotChartArea_typekey(value: ChartArea): Self = StObject.set(x, "Word.ChartArea_typekey", value.asInstanceOf[js.Any])
  }
}
