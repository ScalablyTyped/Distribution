package typings
package antdLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertState extends js.Object {
  var closed: scala.Boolean
  var closing: scala.Boolean
}

object AlertState {
  @scala.inline
  def apply(closed: scala.Boolean, closing: scala.Boolean): AlertState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("closing")(closing)
    __obj.asInstanceOf[AlertState]
  }
}

