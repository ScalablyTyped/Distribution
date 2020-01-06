package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSelector extends js.Object {
  /**
    * When specified this field indicates the three letter language code of the caption track to extract from the source.
    */
  var LanguageCode: js.UndefOr[__string] = js.native
  /**
    * Name identifier for a caption selector.  This name is used to associate this caption selector with one or more caption descriptions.  Names must be unique within an event.
    */
  var Name: __stringMin1 = js.native
  /**
    * Caption selector settings.
    */
  var SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.native
}

object CaptionSelector {
  @scala.inline
  def apply(
    Name: __stringMin1,
    LanguageCode: __string = null,
    SelectorSettings: CaptionSelectorSettings = null
  ): CaptionSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (SelectorSettings != null) __obj.updateDynamic("SelectorSettings")(SelectorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSelector]
  }
}

