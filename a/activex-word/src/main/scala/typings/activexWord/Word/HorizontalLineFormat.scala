package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalLineFormat extends js.Object {
  var Alignment: WdHorizontalLineAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var NoShade: Boolean = js.native
  val Parent: js.Any = js.native
  var PercentWidth: Double = js.native
  var WidthType: WdHorizontalLineWidthType = js.native
  @JSName("Word.HorizontalLineFormat_typekey")
  var WordDotHorizontalLineFormat_typekey: HorizontalLineFormat = js.native
}

object HorizontalLineFormat {
  @scala.inline
  def apply(
    Alignment: WdHorizontalLineAlignment,
    Application: Application,
    Creator: Double,
    NoShade: Boolean,
    Parent: js.Any,
    PercentWidth: Double,
    WidthType: WdHorizontalLineWidthType,
    WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
  ): HorizontalLineFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NoShade = NoShade.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentWidth = PercentWidth.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HorizontalLineFormat_typekey")(WordDotHorizontalLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineFormat]
  }
  @scala.inline
  implicit class HorizontalLineFormatOps[Self <: HorizontalLineFormat] (val x: Self) extends AnyVal {
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
    def setAlignment(value: WdHorizontalLineAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoShade(value: Boolean): Self = this.set("NoShade", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentWidth(value: Double): Self = this.set("PercentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthType(value: WdHorizontalLineWidthType): Self = this.set("WidthType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotHorizontalLineFormat_typekey(value: HorizontalLineFormat): Self = this.set("Word.HorizontalLineFormat_typekey", value.asInstanceOf[js.Any])
  }
  
}

