package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheets")
@js.native
class StyleSheets protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: StyleSheets = js.native
  def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): StyleSheet = js.native
  def Item(Index: js.Any): StyleSheet = js.native
}

