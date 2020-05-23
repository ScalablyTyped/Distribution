package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFillFormat extends js.Object {
  val Application: js.Any
  val BackColor: ChartColorFormat
  val Creator: Double
  val ForeColor: ChartColorFormat
  val GradientColorType: Double
  val GradientDegree: Double
  val GradientStyle: Double
  val GradientVariant: Double
  @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat
  val Parent: js.Any
  val Pattern: Double
  val PresetGradientType: Double
  val PresetTexture: Double
  val TextureName: String
  val TextureType: Double
  val Type: Double
  var Visible: Double
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit
  def Patterned(Pattern: Double): Unit
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit
  def PresetTextured(PresetTexture: Double): Unit
  def Solid(): Unit
  def TwoColorGradient(Style: Double, Variant: Double): Unit
  def UserPicture(PictureFile: String, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit
  def UserTextured(TextureFile: String): Unit
}

object ChartFillFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ChartColorFormat,
    Creator: Double,
    ForeColor: ChartColorFormat,
    GradientColorType: Double,
    GradientDegree: Double,
    GradientStyle: Double,
    GradientVariant: Double,
    OfficeDotChartFillFormat_typekey: ChartFillFormat,
    OneColorGradient: (Double, Double, Double) => Unit,
    Parent: js.Any,
    Pattern: Double,
    Patterned: Double => Unit,
    PresetGradient: (Double, Double, Double) => Unit,
    PresetGradientType: Double,
    PresetTexture: Double,
    PresetTextured: Double => Unit,
    Solid: () => Unit,
    TextureName: String,
    TextureType: Double,
    TwoColorGradient: (Double, Double) => Unit,
    Type: Double,
    UserPicture: (String, js.Any, js.Any, js.Any) => Unit,
    UserTextured: String => Unit,
    Visible: Double
  ): ChartFillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3(OneColorGradient), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1(Patterned), PresetGradient = js.Any.fromFunction3(PresetGradient), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1(PresetTextured), Solid = js.Any.fromFunction0(Solid), TextureName = TextureName.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2(TwoColorGradient), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction4(UserPicture), UserTextured = js.Any.fromFunction1(UserTextured), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartFillFormat_typekey")(OfficeDotChartFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFillFormat]
  }
}

