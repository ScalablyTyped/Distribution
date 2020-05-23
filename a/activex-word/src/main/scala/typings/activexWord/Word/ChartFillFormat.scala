package typings.activexWord.Word

import typings.activexOffice.Office.MsoFillType
import typings.activexOffice.Office.MsoGradientColorType
import typings.activexOffice.Office.MsoGradientStyle
import typings.activexOffice.Office.MsoPatternType
import typings.activexOffice.Office.MsoPresetGradientType
import typings.activexOffice.Office.MsoPresetTexture
import typings.activexOffice.Office.MsoTextureType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFillFormat extends js.Object {
  val Application: js.Any = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: MsoGradientColorType = js.native
  val GradientDegree: Double = js.native
  val GradientStyle: MsoGradientStyle = js.native
  val GradientVariant: Double = js.native
  val Parent: js.Any = js.native
  val Pattern: MsoPatternType = js.native
  val PresetGradientType: MsoPresetGradientType = js.native
  val PresetTexture: MsoPresetTexture = js.native
  val TextureName: String = js.native
  val TextureType: MsoTextureType = js.native
  val Type: MsoFillType = js.native
  var Visible: MsoTriState = js.native
  @JSName("Word.ChartFillFormat_typekey")
  var WordDotChartFillFormat_typekey: ChartFillFormat = js.native
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  def UserPicture(): Unit = js.native
  def UserPicture(PictureFile: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

