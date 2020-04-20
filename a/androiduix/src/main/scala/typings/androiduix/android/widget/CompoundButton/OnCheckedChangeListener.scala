package typings.androiduix.android.widget.CompoundButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(buttonView: typings.androiduix.android.widget.CompoundButton, isChecked: Boolean): Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (typings.androiduix.android.widget.CompoundButton, Boolean) => Unit): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

