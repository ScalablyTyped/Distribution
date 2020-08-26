package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phonetic extends js.Object {
  var Alignment: Double = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var CharacterType: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Phonetic_typekey")
  var ExcelDotPhonetic_typekey: Phonetic = js.native
  val Font: typings.activexExcel.Excel.Font = js.native
  val Parent: js.Any = js.native
  var Text: String = js.native
  var Visible: Boolean = js.native
}

object Phonetic {
  @scala.inline
  def apply(
    Alignment: Double,
    Application: Application,
    CharacterType: Double,
    Creator: XlCreator,
    ExcelDotPhonetic_typekey: Phonetic,
    Font: Font,
    Parent: js.Any,
    Text: String,
    Visible: Boolean
  ): Phonetic = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CharacterType = CharacterType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Phonetic_typekey")(ExcelDotPhonetic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phonetic]
  }
  @scala.inline
  implicit class PhoneticOps[Self <: Phonetic] (val x: Self) extends AnyVal {
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
    def setAlignment(value: Double): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterType(value: Double): Self = this.set("CharacterType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotPhonetic_typekey(value: Phonetic): Self = this.set("Excel.Phonetic_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

