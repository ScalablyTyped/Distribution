package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walls extends js.Object {
  val Application: js.Any = js.native
  val Border: ChartBorder = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  val Interior: typings.activexWord.Word.Interior = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var PictureType: js.Any = js.native
  var PictureUnit: js.Any = js.native
  var Thickness: Double = js.native
  @JSName("Word.Walls_typekey")
  var WordDotWalls_typekey: Walls = js.native
  def ClearFormats(): js.Any = js.native
  def Paste(): Unit = js.native
  def Select(): js.Any = js.native
}

object Walls {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PictureUnit: js.Any,
    Select: () => js.Any,
    Thickness: Double,
    WordDotWalls_typekey: Walls
  ): Walls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Walls_typekey")(WordDotWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Walls]
  }
  @scala.inline
  implicit class WallsOps[Self <: Walls] (val x: Self) extends AnyVal {
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
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
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
    def setPaste(value: () => Unit): Self = this.set("Paste", js.Any.fromFunction0(value))
    @scala.inline
    def setPictureType(value: js.Any): Self = this.set("PictureType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPictureUnit(value: js.Any): Self = this.set("PictureUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setThickness(value: Double): Self = this.set("Thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotWalls_typekey(value: Walls): Self = this.set("Word.Walls_typekey", value.asInstanceOf[js.Any])
  }
  
}

