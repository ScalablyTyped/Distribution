package typings.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSuggestion
  extends SuggestionBase
     with AnySuggestion {
  /** The text which will be inserted into the editor, in place of the prefix. */
  var text: String
}

object TextSuggestion {
  @scala.inline
  def apply(
    text: String,
    className: String = null,
    description: String = null,
    descriptionMarkdown: String = null,
    descriptionMoreURL: String = null,
    displayText: String = null,
    iconHTML: String = null,
    leftLabel: String = null,
    leftLabelHTML: String = null,
    replacementPrefix: String = null,
    rightLabel: String = null,
    rightLabelHTML: String = null,
    `type`: String = null
  ): TextSuggestion = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptionMarkdown != null) __obj.updateDynamic("descriptionMarkdown")(descriptionMarkdown.asInstanceOf[js.Any])
    if (descriptionMoreURL != null) __obj.updateDynamic("descriptionMoreURL")(descriptionMoreURL.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (leftLabelHTML != null) __obj.updateDynamic("leftLabelHTML")(leftLabelHTML.asInstanceOf[js.Any])
    if (replacementPrefix != null) __obj.updateDynamic("replacementPrefix")(replacementPrefix.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (rightLabelHTML != null) __obj.updateDynamic("rightLabelHTML")(rightLabelHTML.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSuggestion]
  }
}

