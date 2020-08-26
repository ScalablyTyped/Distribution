package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWatcher extends js.Object {
  def afterTextChanged(s: String): Unit = js.native
  def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit = js.native
  def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit = js.native
}

object TextWatcher {
  @scala.inline
  def apply(
    afterTextChanged: String => Unit,
    beforeTextChanged: (String, Double, Double, Double) => Unit,
    onTextChanged: (String, Double, Double, Double) => Unit
  ): TextWatcher = {
    val __obj = js.Dynamic.literal(afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), onTextChanged = js.Any.fromFunction4(onTextChanged))
    __obj.asInstanceOf[TextWatcher]
  }
  @scala.inline
  implicit class TextWatcherOps[Self <: TextWatcher] (val x: Self) extends AnyVal {
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
    def setAfterTextChanged(value: String => Unit): Self = this.set("afterTextChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeTextChanged(value: (String, Double, Double, Double) => Unit): Self = this.set("beforeTextChanged", js.Any.fromFunction4(value))
    @scala.inline
    def setOnTextChanged(value: (String, Double, Double, Double) => Unit): Self = this.set("onTextChanged", js.Any.fromFunction4(value))
  }
  
}

