package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiLoLines extends js.Object {
  val Application: js.Any = js.native
  val Border: ChartBorder = js.native
  val Creator: Double = js.native
  val Format: ChartFormat = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.HiLoLines_typekey")
  var WordDotHiLoLines_typekey: HiLoLines = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object HiLoLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => Unit,
    WordDotHiLoLines_typekey: HiLoLines
  ): HiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.HiLoLines_typekey")(WordDotHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiLoLines]
  }
  @scala.inline
  implicit class HiLoLinesOps[Self <: HiLoLines] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotHiLoLines_typekey(value: HiLoLines): Self = this.set("Word.HiLoLines_typekey", value.asInstanceOf[js.Any])
  }
  
}

