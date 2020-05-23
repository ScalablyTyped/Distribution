package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLChildNodeSuggestions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.XMLChildNodeSuggestions_typekey")
  var WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions
  def Item(Index: js.Any): XMLChildNodeSuggestion
}

object XMLChildNodeSuggestions {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => XMLChildNodeSuggestion,
    Parent: js.Any,
    WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions
  ): XMLChildNodeSuggestions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.XMLChildNodeSuggestions_typekey")(WordDotXMLChildNodeSuggestions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLChildNodeSuggestions]
  }
}

