package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSelector extends js.Object {
  /**
    * When specified this field indicates the three letter language code of the caption track to extract from the source.
    */
  var LanguageCode: js.UndefOr[__string] = js.undefined
  /**
    * Name identifier for a caption selector.  This name is used to associate this caption selector with one or more caption descriptions.  Names must be unique within an event.
    */
  var Name: __stringMin1
  /**
    * Caption selector settings.
    */
  var SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.undefined
}

object CaptionSelector {
  @scala.inline
  def apply(
    Name: __stringMin1,
    LanguageCode: __string = null,
    SelectorSettings: CaptionSelectorSettings = null
  ): CaptionSelector = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (SelectorSettings != null) __obj.updateDynamic("SelectorSettings")(SelectorSettings)
    __obj.asInstanceOf[CaptionSelector]
  }
}

