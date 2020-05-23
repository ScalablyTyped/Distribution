package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheets extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: StyleSheets
  def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): StyleSheet
  def Item(Index: js.Any): StyleSheet
}

object StyleSheets {
  @scala.inline
  def apply(
    Add: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => StyleSheet,
    Parent: js.Any,
    WordDotStyleSheets_typekey: StyleSheets
  ): StyleSheets = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction4(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StyleSheets_typekey")(WordDotStyleSheets_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheets]
  }
}

