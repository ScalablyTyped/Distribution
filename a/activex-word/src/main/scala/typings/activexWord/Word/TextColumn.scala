package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextColumn extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var SpaceAfter: Double = js.native
  var Width: Double = js.native
  @JSName("Word.TextColumn_typekey")
  var WordDotTextColumn_typekey: TextColumn = js.native
}

object TextColumn {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    SpaceAfter: Double,
    Width: Double,
    WordDotTextColumn_typekey: TextColumn
  ): TextColumn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextColumn_typekey")(WordDotTextColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
  @scala.inline
  implicit class TextColumnOps[Self <: TextColumn] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceAfter(value: Double): Self = this.set("SpaceAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTextColumn_typekey(value: TextColumn): Self = this.set("Word.TextColumn_typekey", value.asInstanceOf[js.Any])
  }
  
}

