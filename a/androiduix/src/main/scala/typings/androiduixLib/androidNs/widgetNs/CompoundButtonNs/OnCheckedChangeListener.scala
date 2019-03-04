package typings
package androiduixLib.androidNs.widgetNs.CompoundButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(buttonView: androiduixLib.androidNs.widgetNs.CompoundButton, isChecked: scala.Boolean): scala.Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(
    onCheckedChanged: js.Function2[androiduixLib.androidNs.widgetNs.CompoundButton, scala.Boolean, scala.Unit]
  ): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = onCheckedChanged)
  
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

