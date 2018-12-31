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

