package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReflectionFormat extends js.Object {
  val Application: js.Any = js.native
  var Blur: Double = js.native
  val Creator: Double = js.native
  @JSName("Office.ReflectionFormat_typekey")
  var OfficeDotReflectionFormat_typekey: ReflectionFormat = js.native
  var Offset: Double = js.native
  var Size: Double = js.native
  var Transparency: Double = js.native
  var Type: MsoReflectionType = js.native
}

object ReflectionFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Blur: Double,
    Creator: Double,
    OfficeDotReflectionFormat_typekey: ReflectionFormat,
    Offset: Double,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ReflectionFormat_typekey")(OfficeDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
  @scala.inline
  implicit class ReflectionFormatOps[Self <: ReflectionFormat] (val x: Self) extends AnyVal {
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
    def setBlur(value: Double): Self = this.set("Blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotReflectionFormat_typekey(value: ReflectionFormat): Self = this.set("Office.ReflectionFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("Offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparency(value: Double): Self = this.set("Transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoReflectionType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

