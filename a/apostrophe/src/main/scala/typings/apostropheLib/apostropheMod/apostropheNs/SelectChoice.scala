package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChoice extends js.Object {
  var label: java.lang.String
  var value: java.lang.String
}

object SelectChoice {
  @scala.inline
  def apply(label: java.lang.String, value: java.lang.String): SelectChoice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectChoice]
  }
}

