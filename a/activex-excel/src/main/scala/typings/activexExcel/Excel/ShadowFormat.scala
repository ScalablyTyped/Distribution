package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowFormat extends StObject {
  
  val Application: Any
  
  var Blur: Double
  
  val Creator: Double
  
  /* private */ @JSName("Excel.ShadowFormat_typekey")
  var ExcelDotShadowFormat_typekey: ShadowFormat
  
  var ForeColor: ColorFormat
  
  def IncrementOffsetX(Increment: Double): Unit
  
  def IncrementOffsetY(Increment: Double): Unit
  
  var Obscured: MsoTriState
  
  var OffsetX: Double
  
  var OffsetY: Double
  
  val Parent: Any
  
  var RotateWithShape: MsoTriState
  
  var Size: Double
  
  var Style: MsoShadowStyle
  
  var Transparency: Double
  
  var Type: MsoShadowType
  
  var Visible: MsoTriState
}
object ShadowFormat {
  
  inline def apply(
    Application: Any,
    Blur: Double,
    Creator: Double,
    ExcelDotShadowFormat_typekey: ShadowFormat,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Unit,
    IncrementOffsetY: Double => Unit,
    Obscured: MsoTriState,
    OffsetX: Double,
    OffsetY: Double,
    Parent: Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1(IncrementOffsetX), IncrementOffsetY = js.Any.fromFunction1(IncrementOffsetY), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ShadowFormat_typekey")(ExcelDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotShadowFormat_typekey(value: ShadowFormat): Self = StObject.set(x, "Excel.ShadowFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setIncrementOffsetX(value: Double => Unit): Self = StObject.set(x, "IncrementOffsetX", js.Any.fromFunction1(value))
    
    inline def setIncrementOffsetY(value: Double => Unit): Self = StObject.set(x, "IncrementOffsetY", js.Any.fromFunction1(value))
    
    inline def setObscured(value: MsoTriState): Self = StObject.set(x, "Obscured", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "OffsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "OffsetY", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRotateWithShape(value: MsoTriState): Self = StObject.set(x, "RotateWithShape", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: MsoShadowStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoShadowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
