package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowFormat extends js.Object {
  val Application: js.Any
  var Blur: Double
  val Creator: Double
  var ForeColor: ColorFormat
  var Obscured: MsoTriState
  @JSName("Office.ShadowFormat_typekey")
  var OfficeDotShadowFormat_typekey: ShadowFormat
  var OffsetX: Double
  var OffsetY: Double
  val Parent: js.Any
  var RotateWithShape: MsoTriState
  var Size: Double
  var Style: MsoShadowStyle
  var Transparency: Double
  var Type: MsoShadowType
  var Visible: MsoTriState
  def IncrementOffsetX(Increment: Double): Unit
  def IncrementOffsetY(Increment: Double): Unit
}

object ShadowFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Blur: Double,
    Creator: Double,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Unit,
    IncrementOffsetY: Double => Unit,
    Obscured: MsoTriState,
    OfficeDotShadowFormat_typekey: ShadowFormat,
    OffsetX: Double,
    OffsetY: Double,
    Parent: js.Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1(IncrementOffsetX), IncrementOffsetY = js.Any.fromFunction1(IncrementOffsetY), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ShadowFormat_typekey")(OfficeDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
}

