package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreReduce extends js.Object {
  var action: js.Any
  var data: js.Any
}

object StoreReduce {
  @scala.inline
  def apply(action: js.Any, data: js.Any): StoreReduce = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[StoreReduce]
  }
}

