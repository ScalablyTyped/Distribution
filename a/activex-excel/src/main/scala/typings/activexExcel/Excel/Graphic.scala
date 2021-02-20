package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// there is no way to use the Globals class from within Javascript
@js.native
trait Graphic extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Brightness: Double = js.native
  
  var ColorType: MsoPictureColorType = js.native
  
  var Contrast: Double = js.native
  
  val Creator: XlCreator = js.native
  
  var CropBottom: Double = js.native
  
  var CropLeft: Double = js.native
  
  var CropRight: Double = js.native
  
  var CropTop: Double = js.native
  
  @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: Graphic = js.native
  
  var Filename: String = js.native
  
  var Height: Double = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  val Parent: js.Any = js.native
  
  var Width: Double = js.native
}
object Graphic {
  
  @scala.inline
  def apply(
    Application: Application,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: XlCreator,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    ExcelDotGraphic_typekey: Graphic,
    Filename: String,
    Height: Double,
    LockAspectRatio: MsoTriState,
    Parent: js.Any,
    Width: Double
  ): Graphic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Graphic_typekey")(ExcelDotGraphic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  
  @scala.inline
  implicit class GraphicMutableBuilder[Self <: Graphic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: MsoPictureColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBottom(value: Double): Self = StObject.set(x, "CropBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropLeft(value: Double): Self = StObject.set(x, "CropLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropRight(value: Double): Self = StObject.set(x, "CropRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropTop(value: Double): Self = StObject.set(x, "CropTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotGraphic_typekey(value: Graphic): Self = StObject.set(x, "Excel.Graphic_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "Filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatio(value: MsoTriState): Self = StObject.set(x, "LockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
