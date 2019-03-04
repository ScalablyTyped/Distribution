package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnippetSuggestion
  extends SuggestionBase
     with AnySuggestion {
  /**
    *  A snippet string. This will allow users to tab through function arguments
    *  or other options.
    */
  var snippet: java.lang.String
}

object SnippetSuggestion {
  @scala.inline
  def apply(
    snippet: java.lang.String,
    className: java.lang.String = null,
    description: java.lang.String = null,
    descriptionMarkdown: java.lang.String = null,
    descriptionMoreURL: java.lang.String = null,
    displayText: java.lang.String = null,
    iconHTML: java.lang.String = null,
    leftLabel: java.lang.String = null,
    leftLabelHTML: java.lang.String = null,
    replacementPrefix: java.lang.String = null,
    rightLabel: java.lang.String = null,
    rightLabelHTML: java.lang.String = null,
    `type`: java.lang.String = null
  ): SnippetSuggestion = {
    val __obj = js.Dynamic.literal(snippet = snippet)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (descriptionMarkdown != null) __obj.updateDynamic("descriptionMarkdown")(descriptionMarkdown)
    if (descriptionMoreURL != null) __obj.updateDynamic("descriptionMoreURL")(descriptionMoreURL)
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML)
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel)
    if (leftLabelHTML != null) __obj.updateDynamic("leftLabelHTML")(leftLabelHTML)
    if (replacementPrefix != null) __obj.updateDynamic("replacementPrefix")(replacementPrefix)
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel)
    if (rightLabelHTML != null) __obj.updateDynamic("rightLabelHTML")(rightLabelHTML)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SnippetSuggestion]
  }
}

