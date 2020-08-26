package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// there is no way to use the Globals class from within Javascript
@js.native
trait Graphic extends js.Object {
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
  implicit class GraphicOps[Self <: Graphic] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrightness(value: Double): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorType(value: MsoPictureColorType): Self = this.set("ColorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrast(value: Double): Self = this.set("Contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropBottom(value: Double): Self = this.set("CropBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropLeft(value: Double): Self = this.set("CropLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropRight(value: Double): Self = this.set("CropRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropTop(value: Double): Self = this.set("CropTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotGraphic_typekey(value: Graphic): Self = this.set("Excel.Graphic_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("Filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAspectRatio(value: MsoTriState): Self = this.set("LockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

