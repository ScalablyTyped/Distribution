package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoCharacters extends js.Object {
  val Application: js.Any
  var Caption: String
  val Count: Double
  val Creator: Double
  val Font: ChartFont
  @JSName("Office.IMsoCharacters_typekey")
  var OfficeDotIMsoCharacters_typekey: IMsoCharacters
  val Parent: js.Any
  var PhoneticCharacters: String
  var Text: String
  def Delete(): js.Any
  def Insert(bstr: String): js.Any
}

object IMsoCharacters {
  @scala.inline
  def apply(
    Application: js.Any,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    OfficeDotIMsoCharacters_typekey: IMsoCharacters,
    Parent: js.Any,
    PhoneticCharacters: String,
    Text: String
  ): IMsoCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoCharacters_typekey")(OfficeDotIMsoCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoCharacters]
  }
}

