package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSelector extends js.Object {
  /**
    * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.  Selector names should be unique per input.
    */
  var Name: __stringMin1
  /**
    * The audio selector settings.
    */
  var SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.undefined
}

object AudioSelector {
  @scala.inline
  def apply(Name: __stringMin1, SelectorSettings: AudioSelectorSettings = null): AudioSelector = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (SelectorSettings != null) __obj.updateDynamic("SelectorSettings")(SelectorSettings)
    __obj.asInstanceOf[AudioSelector]
  }
}

