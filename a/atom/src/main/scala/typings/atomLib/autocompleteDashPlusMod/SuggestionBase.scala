package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionBase extends js.Object {
  /**
    *  Class name for the suggestion in the suggestion list. Allows you to style your
    *  suggestion via CSS, if desired.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A doc-string summary or short description of the suggestion. When specified, it
    *  will be displayed at the bottom of the suggestions list.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  (experimental) Description with Markdown formatting.
    *  Takes precedence over plaintext description.
    */
  var descriptionMarkdown: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A url to the documentation or more information about this suggestion.
    *  When specified, a More.. link will be displayed in the description area.
    */
  var descriptionMoreURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A string that will show in the UI for this suggestion.
    *  When not set, snippet || text is displayed.
    */
  var displayText: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  If you want complete control over the icon shown against the suggestion.
    *  e.g. iconHTML: <i class="icon-move-right"></i>
    */
  var iconHTML: js.UndefOr[java.lang.String] = js.undefined
  /** This is shown before the suggestion. Useful for return values. */
  var leftLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Use this instead of leftLabel if you want to use html for the left label. */
  var leftLabelHTML: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The text immediately preceding the cursor, which will be replaced by the text.
    *  If not provided, the prefix passed into getSuggestions will be used.
    */
  var replacementPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  An indicator (e.g. function, variable) denoting the "kind" of suggestion this
    *  represents.
    */
  var rightLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Use this instead of rightLabel if you want to use html for the right label. */
  var rightLabelHTML: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The suggestion type. It will be converted into an icon shown against the
    *  suggestion.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SuggestionBase {
  @scala.inline
  def apply(
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
  ): SuggestionBase = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[SuggestionBase]
  }
}

