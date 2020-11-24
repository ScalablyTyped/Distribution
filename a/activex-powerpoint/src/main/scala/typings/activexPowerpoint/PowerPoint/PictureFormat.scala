package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.Crop
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureFormat extends js.Object {
  
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
  
  def IncrementBrightness(Increment: Double): Unit = js.native
  
  def IncrementContrast(Increment: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PictureFormat_typekey")
  var PowerPointDotPictureFormat_typekey: PictureFormat = js.native
  
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
    IncrementBrightness: Double => Unit,
    IncrementContrast: Double => Unit,
    Parent: js.Any,
    PowerPointDotPictureFormat_typekey: PictureFormat,
    TransparencyColor: MsoRGBType,
    TransparentBackground: MsoTriState
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PictureFormat_typekey")(PowerPointDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
  
  @scala.inline
  implicit class PictureFormatOps[Self <: PictureFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: MsoPictureColorType): Self = this.set("ColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop(value: Crop): Self = this.set("Crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBottom(value: Double): Self = this.set("CropBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropLeft(value: Double): Self = this.set("CropLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropRight(value: Double): Self = this.set("CropRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropTop(value: Double): Self = this.set("CropTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementBrightness(value: Double => Unit): Self = this.set("IncrementBrightness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementContrast(value: Double => Unit): Self = this.set("IncrementContrast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPictureFormat_typekey(value: PictureFormat): Self = this.set("PowerPoint.PictureFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyColor(value: MsoRGBType): Self = this.set("TransparencyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentBackground(value: MsoTriState): Self = this.set("TransparentBackground", value.asInstanceOf[js.Any])
  }
}
