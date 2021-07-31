package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoChartArea extends StObject {
  
  val Application: js.Any
  
  var AutoScaleFont: js.Any
  
  val Border: IMsoBorder
  
  def Clear(): js.Any
  
  def ClearContents(): js.Any
  
  def ClearFormats(): js.Any
  
  def Copy(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Font: ChartFont
  
  val Format: IMsoChartFormat
  
  var Height: Double
  
  val Interior: IMsoInterior
  
  var Left: Double
  
  val Name: String
  
  @JSName("Office.IMsoChartArea_typekey")
  var OfficeDotIMsoChartArea_typekey: IMsoChartArea
  
  val Parent: js.Any
  
  var RoundedCorners: Boolean
  
  def Select(): js.Any
  
  var Shadow: Boolean
  
  var Top: Double
  
  var Width: Double
}
object IMsoChartArea {
  
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: IMsoChartFormat,
    Height: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoChartArea_typekey: IMsoChartArea,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): IMsoChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartArea_typekey")(OfficeDotIMsoChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartArea]
  }
  
  @scala.inline
  implicit class IMsoChartAreaMutableBuilder[Self <: IMsoChartArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
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
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoChartArea_typekey(value: IMsoChartArea): Self = StObject.set(x, "Office.IMsoChartArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = StObject.set(x, "RoundedCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
