package typings.androiduix.androidNs.widgetNs.CompoundButtonNs

import typings.androiduix.androidNs.widgetNs.CompoundButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean): Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (CompoundButton, Boolean) => Unit): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
  
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

