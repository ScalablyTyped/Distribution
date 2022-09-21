package typings.activexWord.Word

import typings.activexOffice.Office.Crop
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Brightness: Double
  
  var ColorType: MsoPictureColorType
  
  var Contrast: Double
  
  val Creator: Double
  
  var Crop: typings.activexOffice.Office.Crop
  
  var CropBottom: Double
  
  var CropLeft: Double
  
  var CropRight: Double
  
  var CropTop: Double
  
  def IncrementBrightness(Increment: Double): Unit
  
  def IncrementContrast(Increment: Double): Unit
  
  val Parent: Any
  
  var TransparencyColor: Double
  
  var TransparentBackground: MsoTriState
  
  /* private */ @JSName("Word.PictureFormat_typekey")
  var WordDotPictureFormat_typekey: PictureFormat
}
object PictureFormat {
  
  inline def apply(
    Application: Application,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: Double,
    Crop: Crop,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    IncrementBrightness: Double => Unit,
    IncrementContrast: Double => Unit,
    Parent: Any,
    TransparencyColor: Double,
    TransparentBackground: MsoTriState,
    WordDotPictureFormat_typekey: PictureFormat
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PictureFormat_typekey")(WordDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
  
  extension [Self <: PictureFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: MsoPictureColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCrop(value: Crop): Self = StObject.set(x, "Crop", value.asInstanceOf[js.Any])
    
    inline def setCropBottom(value: Double): Self = StObject.set(x, "CropBottom", value.asInstanceOf[js.Any])
    
    inline def setCropLeft(value: Double): Self = StObject.set(x, "CropLeft", value.asInstanceOf[js.Any])
    
    inline def setCropRight(value: Double): Self = StObject.set(x, "CropRight", value.asInstanceOf[js.Any])
    
    inline def setCropTop(value: Double): Self = StObject.set(x, "CropTop", value.asInstanceOf[js.Any])
    
    inline def setIncrementBrightness(value: Double => Unit): Self = StObject.set(x, "IncrementBrightness", js.Any.fromFunction1(value))
    
    inline def setIncrementContrast(value: Double => Unit): Self = StObject.set(x, "IncrementContrast", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setTransparencyColor(value: Double): Self = StObject.set(x, "TransparencyColor", value.asInstanceOf[js.Any])
    
    inline def setTransparentBackground(value: MsoTriState): Self = StObject.set(x, "TransparentBackground", value.asInstanceOf[js.Any])
    
    inline def setWordDotPictureFormat_typekey(value: PictureFormat): Self = StObject.set(x, "Word.PictureFormat_typekey", value.asInstanceOf[js.Any])
  }
}
