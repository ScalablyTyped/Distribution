package typings
package androiduixLib.androidNs.widgetNs.RadioGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(group: androiduixLib.androidNs.widgetNs.RadioGroup, checkedId: java.lang.String): scala.Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(
    onCheckedChanged: js.Function2[androiduixLib.androidNs.widgetNs.RadioGroup, java.lang.String, scala.Unit]
  ): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCheckedChanged")(onCheckedChanged)
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

