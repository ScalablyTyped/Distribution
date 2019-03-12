package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWatcher extends js.Object {
  def afterTextChanged(s: java.lang.String): scala.Unit
  def beforeTextChanged(s: java.lang.String, start: scala.Double, count: scala.Double, after: scala.Double): scala.Unit
  def onTextChanged(s: java.lang.String, start: scala.Double, before: scala.Double, count: scala.Double): scala.Unit
}

object TextWatcher {
  @scala.inline
  def apply(
    afterTextChanged: java.lang.String => scala.Unit,
    beforeTextChanged: (java.lang.String, scala.Double, scala.Double, scala.Double) => scala.Unit,
    onTextChanged: (java.lang.String, scala.Double, scala.Double, scala.Double) => scala.Unit
  ): TextWatcher = {
    val __obj = js.Dynamic.literal(afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), onTextChanged = js.Any.fromFunction4(onTextChanged))
  
    __obj.asInstanceOf[TextWatcher]
  }
}

