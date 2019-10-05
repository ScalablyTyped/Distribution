package typings.androiduix.android.widget.RadioGroup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(group: typings.androiduix.android.widget.RadioGroup, checkedId: String): Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (typings.androiduix.android.widget.RadioGroup, String) => Unit): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
  
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

