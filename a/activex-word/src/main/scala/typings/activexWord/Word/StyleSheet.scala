package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val FullName: String
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Path: String
  var Title: String
  var Type: WdStyleSheetLinkType
  @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: StyleSheet
  def Delete(): Unit
  def Move(Precedence: WdStyleSheetPrecedence): Unit
}

object StyleSheet {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    FullName: String,
    Index: Double,
    Move: WdStyleSheetPrecedence => Unit,
    Name: String,
    Parent: js.Any,
    Path: String,
    Title: String,
    Type: WdStyleSheetLinkType,
    WordDotStyleSheet_typekey: StyleSheet
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FullName = FullName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Move = js.Any.fromFunction1(Move), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StyleSheet_typekey")(WordDotStyleSheet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
}

