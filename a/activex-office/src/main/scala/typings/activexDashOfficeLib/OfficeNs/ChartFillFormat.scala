package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: scala.Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: scala.Double = js.native
  val GradientDegree: scala.Double = js.native
  val GradientStyle: scala.Double = js.native
  val GradientVariant: scala.Double = js.native
  var `Office.ChartFillFormat_typekey`: ChartFillFormat = js.native
  val Parent: js.Any = js.native
  val Pattern: scala.Double = js.native
  val PresetGradientType: scala.Double = js.native
  val PresetTexture: scala.Double = js.native
  val TextureName: java.lang.String = js.native
  val TextureType: scala.Double = js.native
  val Type: scala.Double = js.native
  var Visible: scala.Double = js.native
  def OneColorGradient(Style: scala.Double, Variant: scala.Double, Degree: scala.Double): scala.Unit = js.native
  def Patterned(Pattern: scala.Double): scala.Unit = js.native
  def PresetGradient(Style: scala.Double, Variant: scala.Double, PresetGradientType: scala.Double): scala.Unit = js.native
  def PresetTextured(PresetTexture: scala.Double): scala.Unit = js.native
  def Solid(): scala.Unit = js.native
  def TwoColorGradient(Style: scala.Double, Variant: scala.Double): scala.Unit = js.native
  def UserPicture(
    PictureFile: java.lang.String,
    PictureFormat: js.Any,
    PictureStackUnit: js.Any,
    PicturePlacement: js.Any
  ): scala.Unit = js.native
  def UserTextured(TextureFile: java.lang.String): scala.Unit = js.native
}

