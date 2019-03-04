package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromTo extends js.Object {
  var from: DatetimeInput
  var to: DatetimeInput
}

object FromTo {
  @scala.inline
  def apply(from: DatetimeInput, to: DatetimeInput): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FromTo]
  }
}

