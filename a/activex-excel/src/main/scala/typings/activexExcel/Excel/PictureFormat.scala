package typings.activexExcel.Excel

import typings.activexOffice.Office.Crop
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureFormat extends StObject {
  
  val Application: js.Any = js.native
  
  var Brightness: Double = js.native
  
  var ColorType: MsoPictureColorType = js.native
  
  var Contrast: Double = js.native
  
  val Creator: Double = js.native
  
  val Crop: typings.activexOffice.Office.Crop = js.native
  
  var CropBottom: Double = js.native
  
  var CropLeft: Double = js.native
  
  var CropRight: Double = js.native
  
  var CropTop: Double = js.native
  
  @JSName("Excel.PictureFormat_typekey")
  var ExcelDotPictureFormat_typekey: PictureFormat = js.native
  
  def IncrementBrightness(Increment: Double): Unit = js.native
  
  def IncrementContrast(Increment: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var TransparencyColor: MsoRGBType = js.native
  
  var TransparentBackground: MsoTriState = js.native
}
object PictureFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: Double,
    Crop: Crop,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    ExcelDotPictureFormat_typekey: PictureFormat,
    IncrementBrightness: Double => Unit,
    IncrementContrast: Double => Unit,
    Parent: js.Any,
    TransparencyColor: MsoRGBType,
    TransparentBackground: MsoTriState
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PictureFormat_typekey")(ExcelDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
  
  @scala.inline
  implicit class PictureFormatMutableBuilder[Self <: PictureFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: MsoPictureColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop(value: Crop): Self = StObject.set(x, "Crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBottom(value: Double): Self = StObject.set(x, "CropBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropLeft(value: Double): Self = StObject.set(x, "CropLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropRight(value: Double): Self = StObject.set(x, "CropRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropTop(value: Double): Self = StObject.set(x, "CropTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotPictureFormat_typekey(value: PictureFormat): Self = StObject.set(x, "Excel.PictureFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementBrightness(value: Double => Unit): Self = StObject.set(x, "IncrementBrightness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementContrast(value: Double => Unit): Self = StObject.set(x, "IncrementContrast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyColor(value: MsoRGBType): Self = StObject.set(x, "TransparencyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentBackground(value: MsoTriState): Self = StObject.set(x, "TransparentBackground", value.asInstanceOf[js.Any])
  }
}
