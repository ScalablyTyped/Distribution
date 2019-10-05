package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWatcher extends js.Object {
  def afterTextChanged(s: String): Unit
  def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit
  def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit
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
}

