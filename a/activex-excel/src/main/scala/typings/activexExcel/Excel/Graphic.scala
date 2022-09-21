package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// there is no way to use the Globals class from within Javascript
trait Graphic extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Brightness: Double
  
  var ColorType: MsoPictureColorType
  
  var Contrast: Double
  
  val Creator: XlCreator
  
  var CropBottom: Double
  
  var CropLeft: Double
  
  var CropRight: Double
  
  var CropTop: Double
  
  /* private */ @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: Graphic
  
  var Filename: String
  
  var Height: Double
  
  var LockAspectRatio: MsoTriState
  
  val Parent: Any
  
  var Width: Double
}
object Graphic {
  
  inline def apply(
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
    Parent: Any,
    Width: Double
  ): Graphic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Graphic_typekey")(ExcelDotGraphic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  
  extension [Self <: Graphic](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: MsoPictureColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCropBottom(value: Double): Self = StObject.set(x, "CropBottom", value.asInstanceOf[js.Any])
    
    inline def setCropLeft(value: Double): Self = StObject.set(x, "CropLeft", value.asInstanceOf[js.Any])
    
    inline def setCropRight(value: Double): Self = StObject.set(x, "CropRight", value.asInstanceOf[js.Any])
    
    inline def setCropTop(value: Double): Self = StObject.set(x, "CropTop", value.asInstanceOf[js.Any])
    
    inline def setExcelDotGraphic_typekey(value: Graphic): Self = StObject.set(x, "Excel.Graphic_typekey", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "Filename", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatio(value: MsoTriState): Self = StObject.set(x, "LockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
