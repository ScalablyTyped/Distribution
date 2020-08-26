package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownBars extends js.Object {
  val Application: js.Any = js.native
  val Border: ChartBorder = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  val Interior: typings.activexWord.Word.Interior = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.DownBars_typekey")
  var WordDotDownBars_typekey: DownBars = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object DownBars {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotDownBars_typekey: DownBars
  ): DownBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.DownBars_typekey")(WordDotDownBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownBars]
  }
  @scala.inline
  implicit class DownBarsOps[Self <: DownBars] (val x: Self) extends AnyVal {
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
    def setBorder(value: ChartBorder): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFill(value: ChartFillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterior(value: Interior): Self = this.set("Interior", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotDownBars_typekey(value: DownBars): Self = this.set("Word.DownBars_typekey", value.asInstanceOf[js.Any])
  }
  
}

