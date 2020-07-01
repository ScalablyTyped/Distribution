package typings.accessibility.mod

import typings.accessibility.accessibilityBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modules extends js.Object {
  /** @default true */
  var bigCursor: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var decreaseText: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var decreaseTextSpacing: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var grayHues: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var increaseText: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var increaseTextSpacing: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var invertColors: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var readingGuide: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var speechToText: js.UndefOr[`true`] = js.undefined
  /** @default true */
  var textToSpeech: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var underlineLinks: js.UndefOr[Boolean] = js.undefined
}

object Modules {
  @scala.inline
  def apply(
    bigCursor: js.UndefOr[Boolean] = js.undefined,
    decreaseText: js.UndefOr[Boolean] = js.undefined,
    decreaseTextSpacing: js.UndefOr[Boolean] = js.undefined,
    grayHues: js.UndefOr[Boolean] = js.undefined,
    increaseText: js.UndefOr[Boolean] = js.undefined,
    increaseTextSpacing: js.UndefOr[Boolean] = js.undefined,
    invertColors: js.UndefOr[Boolean] = js.undefined,
    readingGuide: js.UndefOr[Boolean] = js.undefined,
    speechToText: `true` = null,
    textToSpeech: js.UndefOr[Boolean] = js.undefined,
    underlineLinks: js.UndefOr[Boolean] = js.undefined
  ): Modules = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigCursor)) __obj.updateDynamic("bigCursor")(bigCursor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decreaseText)) __obj.updateDynamic("decreaseText")(decreaseText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decreaseTextSpacing)) __obj.updateDynamic("decreaseTextSpacing")(decreaseTextSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grayHues)) __obj.updateDynamic("grayHues")(grayHues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increaseText)) __obj.updateDynamic("increaseText")(increaseText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increaseTextSpacing)) __obj.updateDynamic("increaseTextSpacing")(increaseTextSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invertColors)) __obj.updateDynamic("invertColors")(invertColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readingGuide)) __obj.updateDynamic("readingGuide")(readingGuide.get.asInstanceOf[js.Any])
    if (speechToText != null) __obj.updateDynamic("speechToText")(speechToText.asInstanceOf[js.Any])
    if (!js.isUndefined(textToSpeech)) __obj.updateDynamic("textToSpeech")(textToSpeech.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineLinks)) __obj.updateDynamic("underlineLinks")(underlineLinks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
}

