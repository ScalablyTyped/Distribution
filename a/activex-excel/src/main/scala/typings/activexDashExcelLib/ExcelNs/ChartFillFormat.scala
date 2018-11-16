package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: Application = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: XlCreator = js.native
  var `Excel.ChartFillFormat_typekey`: ChartFillFormat = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: activexDashOfficeLib.OfficeNs.MsoGradientColorType = js.native
  val GradientDegree: scala.Double = js.native
  val GradientStyle: activexDashOfficeLib.OfficeNs.MsoGradientStyle = js.native
  val GradientVariant: scala.Double = js.native
  val Parent: js.Any = js.native
  val Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType = js.native
  val PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType = js.native
  val PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture = js.native
  val TextureName: java.lang.String = js.native
  val TextureType: activexDashOfficeLib.OfficeNs.MsoTextureType = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoFillType = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  def OneColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double, Degree: scala.Double): scala.Unit = js.native
  def Patterned(Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType): scala.Unit = js.native
  def PresetGradient(
    Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle,
    Variant: scala.Double,
    PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType
  ): scala.Unit = js.native
  def PresetTextured(PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture): scala.Unit = js.native
  def Solid(): scala.Unit = js.native
  def TwoColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double): scala.Unit = js.native
  def UserPicture(): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): scala.Unit = js.native
  def UserTextured(TextureFile: java.lang.String): scala.Unit = js.native
}

