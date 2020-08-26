package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartColorFormat extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val RGB: Double = js.native
  var SchemeColor: Double = js.native
  val Type: Double = js.native
  @JSName("Word.ChartColorFormat_typekey")
  var WordDotChartColorFormat_typekey: ChartColorFormat = js.native
  val _Default: Double = js.native
}

object ChartColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    WordDotChartColorFormat_typekey: ChartColorFormat,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartColorFormat_typekey")(WordDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
  @scala.inline
  implicit class ChartColorFormatOps[Self <: ChartColorFormat] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB(value: Double): Self = this.set("RGB", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemeColor(value: Double): Self = this.set("SchemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotChartColorFormat_typekey(value: ChartColorFormat): Self = this.set("Word.ChartColorFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Default(value: Double): Self = this.set("_Default", value.asInstanceOf[js.Any])
  }
  
}

