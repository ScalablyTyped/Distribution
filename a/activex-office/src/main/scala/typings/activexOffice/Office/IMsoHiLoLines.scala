package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoHiLoLines extends js.Object {
  val Application: js.Any = js.native
  val Border: IMsoBorder = js.native
  val Creator: Double = js.native
  val Format: IMsoChartFormat = js.native
  val Name: String = js.native
  @JSName("Office.IMsoHiLoLines_typekey")
  var OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object IMsoHiLoLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines,
    Parent: js.Any,
    Select: () => Unit
  ): IMsoHiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoHiLoLines_typekey")(OfficeDotIMsoHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoHiLoLines]
  }
  @scala.inline
  implicit class IMsoHiLoLinesOps[Self <: IMsoHiLoLines] (val x: Self) extends AnyVal {
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
    def setBorder(value: IMsoBorder): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotIMsoHiLoLines_typekey(value: IMsoHiLoLines): Self = this.set("Office.IMsoHiLoLines_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
  }
  
}

