package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoArrowheadLength
import typings.activexOffice.Office.MsoArrowheadStyle
import typings.activexOffice.Office.MsoArrowheadWidth
import typings.activexOffice.Office.MsoLineDashStyle
import typings.activexOffice.Office.MsoLineStyle
import typings.activexOffice.Office.MsoPatternType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineFormat extends StObject {
  
  val Application: js.Any
  
  var BackColor: ColorFormat
  
  var BeginArrowheadLength: MsoArrowheadLength
  
  var BeginArrowheadStyle: MsoArrowheadStyle
  
  var BeginArrowheadWidth: MsoArrowheadWidth
  
  val Creator: Double
  
  var DashStyle: MsoLineDashStyle
  
  var EndArrowheadLength: MsoArrowheadLength
  
  var EndArrowheadStyle: MsoArrowheadStyle
  
  var EndArrowheadWidth: MsoArrowheadWidth
  
  var ForeColor: ColorFormat
  
  var InsetPen: MsoTriState
  
  val Parent: js.Any
  
  var Pattern: MsoPatternType
  
  @JSName("PowerPoint.LineFormat_typekey")
  var PowerPointDotLineFormat_typekey: LineFormat
  
  var Style: MsoLineStyle
  
  var Transparency: Double
  
  var Visible: MsoTriState
  
  var Weight: Double
}
object LineFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ColorFormat,
    BeginArrowheadLength: MsoArrowheadLength,
    BeginArrowheadStyle: MsoArrowheadStyle,
    BeginArrowheadWidth: MsoArrowheadWidth,
    Creator: Double,
    DashStyle: MsoLineDashStyle,
    EndArrowheadLength: MsoArrowheadLength,
    EndArrowheadStyle: MsoArrowheadStyle,
    EndArrowheadWidth: MsoArrowheadWidth,
    ForeColor: ColorFormat,
    InsetPen: MsoTriState,
    Parent: js.Any,
    Pattern: MsoPatternType,
    PowerPointDotLineFormat_typekey: LineFormat,
    Style: MsoLineStyle,
    Transparency: Double,
    Visible: MsoTriState,
    Weight: Double
  ): LineFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BeginArrowheadLength = BeginArrowheadLength.asInstanceOf[js.Any], BeginArrowheadStyle = BeginArrowheadStyle.asInstanceOf[js.Any], BeginArrowheadWidth = BeginArrowheadWidth.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], EndArrowheadLength = EndArrowheadLength.asInstanceOf[js.Any], EndArrowheadStyle = EndArrowheadStyle.asInstanceOf[js.Any], EndArrowheadWidth = EndArrowheadWidth.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], InsetPen = InsetPen.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.LineFormat_typekey")(PowerPointDotLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineFormat]
  }
  
  @scala.inline
  implicit class LineFormatMutableBuilder[Self <: LineFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: ColorFormat): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadLength(value: MsoArrowheadLength): Self = StObject.set(x, "BeginArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadStyle(value: MsoArrowheadStyle): Self = StObject.set(x, "BeginArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginArrowheadWidth(value: MsoArrowheadWidth): Self = StObject.set(x, "BeginArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyle(value: MsoLineDashStyle): Self = StObject.set(x, "DashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadLength(value: MsoArrowheadLength): Self = StObject.set(x, "EndArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadStyle(value: MsoArrowheadStyle): Self = StObject.set(x, "EndArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowheadWidth(value: MsoArrowheadWidth): Self = StObject.set(x, "EndArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetPen(value: MsoTriState): Self = StObject.set(x, "InsetPen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: MsoPatternType): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotLineFormat_typekey(value: LineFormat): Self = StObject.set(x, "PowerPoint.LineFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MsoLineStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
