package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  /** @default 'gray hues' */
  var bigCursor: js.UndefOr[String] = js.undefined
  /** @default 'Close' */
  var closeTitle: js.UndefOr[String] = js.undefined
  /** @default 'decrease text size' */
  var decreaseText: js.UndefOr[String] = js.undefined
  /** @default 'decrease text spacing' */
  var decreaseTextSpacing: js.UndefOr[String] = js.undefined
  /** @default 'gray hues' */
  var grayHues: js.UndefOr[String] = js.undefined
  /** @default 'increase text size' */
  var increaseText: js.UndefOr[String] = js.undefined
  /** @default 'increase text spacing' */
  var increaseTextSpacing: js.UndefOr[String] = js.undefined
  /** @default 'invert colors' */
  var invertColors: js.UndefOr[String] = js.undefined
  /** @default 'Accessibility Options' */
  var menuTitle: js.UndefOr[String] = js.undefined
  /** @default 'reading guide' */
  var readingGuide: js.UndefOr[String] = js.undefined
  /** @default 'Reset' */
  var resetTitle: js.UndefOr[String] = js.undefined
  /** @default 'speech to text' */
  var speechToText: js.UndefOr[String] = js.undefined
  /** @default 'underline links' */
  var textToSpeech: js.UndefOr[String] = js.undefined
  /** @default 'underline links' */
  var underlineLinks: js.UndefOr[String] = js.undefined
}

object Labels {
  @scala.inline
  def apply(
    bigCursor: String = null,
    closeTitle: String = null,
    decreaseText: String = null,
    decreaseTextSpacing: String = null,
    grayHues: String = null,
    increaseText: String = null,
    increaseTextSpacing: String = null,
    invertColors: String = null,
    menuTitle: String = null,
    readingGuide: String = null,
    resetTitle: String = null,
    speechToText: String = null,
    textToSpeech: String = null,
    underlineLinks: String = null
  ): Labels = {
    val __obj = js.Dynamic.literal()
    if (bigCursor != null) __obj.updateDynamic("bigCursor")(bigCursor.asInstanceOf[js.Any])
    if (closeTitle != null) __obj.updateDynamic("closeTitle")(closeTitle.asInstanceOf[js.Any])
    if (decreaseText != null) __obj.updateDynamic("decreaseText")(decreaseText.asInstanceOf[js.Any])
    if (decreaseTextSpacing != null) __obj.updateDynamic("decreaseTextSpacing")(decreaseTextSpacing.asInstanceOf[js.Any])
    if (grayHues != null) __obj.updateDynamic("grayHues")(grayHues.asInstanceOf[js.Any])
    if (increaseText != null) __obj.updateDynamic("increaseText")(increaseText.asInstanceOf[js.Any])
    if (increaseTextSpacing != null) __obj.updateDynamic("increaseTextSpacing")(increaseTextSpacing.asInstanceOf[js.Any])
    if (invertColors != null) __obj.updateDynamic("invertColors")(invertColors.asInstanceOf[js.Any])
    if (menuTitle != null) __obj.updateDynamic("menuTitle")(menuTitle.asInstanceOf[js.Any])
    if (readingGuide != null) __obj.updateDynamic("readingGuide")(readingGuide.asInstanceOf[js.Any])
    if (resetTitle != null) __obj.updateDynamic("resetTitle")(resetTitle.asInstanceOf[js.Any])
    if (speechToText != null) __obj.updateDynamic("speechToText")(speechToText.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    if (underlineLinks != null) __obj.updateDynamic("underlineLinks")(underlineLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

