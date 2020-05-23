package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRetrievalMode extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Duplicate: TextRetrievalMode
  var IncludeFieldCodes: Boolean
  var IncludeHiddenText: Boolean
  val Parent: js.Any
  var ViewType: WdViewType
  @JSName("Word.TextRetrievalMode_typekey")
  var WordDotTextRetrievalMode_typekey: TextRetrievalMode
}

object TextRetrievalMode {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Duplicate: TextRetrievalMode,
    IncludeFieldCodes: Boolean,
    IncludeHiddenText: Boolean,
    Parent: js.Any,
    ViewType: WdViewType,
    WordDotTextRetrievalMode_typekey: TextRetrievalMode
  ): TextRetrievalMode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], IncludeFieldCodes = IncludeFieldCodes.asInstanceOf[js.Any], IncludeHiddenText = IncludeHiddenText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextRetrievalMode_typekey")(WordDotTextRetrievalMode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRetrievalMode]
  }
}

