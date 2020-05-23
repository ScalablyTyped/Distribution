package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// there is no way to use the Globals class from within Javascript
trait Graphic extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Brightness: Double
  var ColorType: MsoPictureColorType
  var Contrast: Double
  val Creator: XlCreator
  var CropBottom: Double
  var CropLeft: Double
  var CropRight: Double
  var CropTop: Double
  @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: Graphic
  var Filename: String
  var Height: Double
  var LockAspectRatio: MsoTriState
  val Parent: js.Any
  var Width: Double
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
}

