package typings.accessibility.mod

import typings.accessibility.anon.Buttons
import typings.accessibility.anon.CBackground
import typings.accessibility.anon.Font
import typings.accessibility.anon.Persistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var animations: js.UndefOr[Buttons] = js.undefined
  var buttons: js.UndefOr[Font] = js.undefined
  var guide: js.UndefOr[CBackground] = js.undefined
  var hotkeys: js.UndefOr[HotKeys] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var menu: js.UndefOr[typings.accessibility.anon.Dimensions] = js.undefined
  var modules: js.UndefOr[Modules] = js.undefined
  var session: js.UndefOr[Persistent] = js.undefined
  /** @default 'en-US' */
  var speechToTextLang: js.UndefOr[String] = js.undefined
  /** @default true */
  var textEmlMode: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var textPixelMode: js.UndefOr[Boolean] = js.undefined
  /** @default 'en-US' */
  var textToSpeechLang: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animations: Buttons = null,
    buttons: Font = null,
    guide: CBackground = null,
    hotkeys: HotKeys = null,
    icon: Icon = null,
    labels: Labels = null,
    menu: typings.accessibility.anon.Dimensions = null,
    modules: Modules = null,
    session: Persistent = null,
    speechToTextLang: String = null,
    textEmlMode: js.UndefOr[Boolean] = js.undefined,
    textPixelMode: js.UndefOr[Boolean] = js.undefined,
    textToSpeechLang: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (hotkeys != null) __obj.updateDynamic("hotkeys")(hotkeys.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (speechToTextLang != null) __obj.updateDynamic("speechToTextLang")(speechToTextLang.asInstanceOf[js.Any])
    if (!js.isUndefined(textEmlMode)) __obj.updateDynamic("textEmlMode")(textEmlMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textPixelMode)) __obj.updateDynamic("textPixelMode")(textPixelMode.get.asInstanceOf[js.Any])
    if (textToSpeechLang != null) __obj.updateDynamic("textToSpeechLang")(textToSpeechLang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

