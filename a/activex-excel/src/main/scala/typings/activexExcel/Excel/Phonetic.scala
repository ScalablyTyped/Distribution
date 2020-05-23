package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phonetic extends js.Object {
  var Alignment: Double
  val Application: typings.activexExcel.Excel.Application
  var CharacterType: Double
  val Creator: XlCreator
  @JSName("Excel.Phonetic_typekey")
  var ExcelDotPhonetic_typekey: Phonetic
  val Font: typings.activexExcel.Excel.Font
  val Parent: js.Any
  var Text: String
  var Visible: Boolean
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
}

