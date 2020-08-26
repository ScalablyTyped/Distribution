package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorFormat extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  @JSName("Office.ColorFormat_typekey")
  var OfficeDotColorFormat_typekey: ColorFormat = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  var SchemeColor: Double = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
}

object ColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    Creator: Double,
    ObjectThemeColor: MsoThemeColorIndex,
    OfficeDotColorFormat_typekey: ColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ColorFormat_typekey")(OfficeDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  @scala.inline
  implicit class ColorFormatOps[Self <: ColorFormat] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectThemeColor(value: MsoThemeColorIndex): Self = this.set("ObjectThemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotColorFormat_typekey(value: ColorFormat): Self = this.set("Office.ColorFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB(value: Double): Self = this.set("RGB", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemeColor(value: Double): Self = this.set("SchemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("TintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoColorType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

