package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCharacters extends js.Object {
  val Application: js.Any
  var Caption: String
  val Count: Double
  val Creator: Double
  val Font: ChartFont
  val Parent: js.Any
  var PhoneticCharacters: String
  var Text: String
  @JSName("Word.ChartCharacters_typekey")
  var WordDotChartCharacters_typekey: ChartCharacters
  def Delete(): js.Any
  def Insert(String: String): js.Any
}

object ChartCharacters {
  @scala.inline
  def apply(
    Application: js.Any,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    Parent: js.Any,
    PhoneticCharacters: String,
    Text: String,
    WordDotChartCharacters_typekey: ChartCharacters
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartCharacters_typekey")(WordDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
}

