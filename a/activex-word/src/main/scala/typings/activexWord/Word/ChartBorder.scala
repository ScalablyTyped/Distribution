package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBorder extends js.Object {
  val Application: js.Any = js.native
  var Color: js.Any = js.native
  var ColorIndex: js.Any = js.native
  val Creator: Double = js.native
  var LineStyle: js.Any = js.native
  val Parent: js.Any = js.native
  var Weight: js.Any = js.native
  @JSName("Word.ChartBorder_typekey")
  var WordDotChartBorder_typekey: ChartBorder = js.native
}

object ChartBorder {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    Parent: js.Any,
    Weight: js.Any,
    WordDotChartBorder_typekey: ChartBorder
  ): ChartBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartBorder_typekey")(WordDotChartBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorder]
  }
  @scala.inline
  implicit class ChartBorderOps[Self <: ChartBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: js.Any): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorIndex(value: js.Any): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyle(value: js.Any): Self = this.set("LineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: js.Any): Self = this.set("Weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotChartBorder_typekey(value: ChartBorder): Self = this.set("Word.ChartBorder_typekey", value.asInstanceOf[js.Any])
  }
  
}

