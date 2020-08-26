package typings.androiduix.android.widget.TextView

import typings.androiduix.android.text.SpanWatcher
import typings.androiduix.android.text.Spannable
import typings.androiduix.android.text.TextWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeWatcher
  extends TextWatcher
     with SpanWatcher {
  var _TextView_this: typings.androiduix.android.widget.TextView = js.native
  var mBeforeText: js.Any = js.native
}

object ChangeWatcher {
  @scala.inline
  def apply(
    _TextView_this: typings.androiduix.android.widget.TextView,
    afterTextChanged: String => Unit,
    beforeTextChanged: (String, Double, Double, Double) => Unit,
    mBeforeText: js.Any,
    onSpanAdded: (Spannable, js.Any, Double, Double) => Unit,
    onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Unit,
    onSpanRemoved: (Spannable, js.Any, Double, Double) => Unit,
    onTextChanged: (String, Double, Double, Double) => Unit
  ): ChangeWatcher = {
    val __obj = js.Dynamic.literal(_TextView_this = _TextView_this.asInstanceOf[js.Any], afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), mBeforeText = mBeforeText.asInstanceOf[js.Any], onSpanAdded = js.Any.fromFunction4(onSpanAdded), onSpanChanged = js.Any.fromFunction6(onSpanChanged), onSpanRemoved = js.Any.fromFunction4(onSpanRemoved), onTextChanged = js.Any.fromFunction4(onTextChanged))
    __obj.asInstanceOf[ChangeWatcher]
  }
  @scala.inline
  implicit class ChangeWatcherOps[Self <: ChangeWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_TextView_this(value: typings.androiduix.android.widget.TextView): Self = this.set("_TextView_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMBeforeText(value: js.Any): Self = this.set("mBeforeText", value.asInstanceOf[js.Any])
  }
  
}

