package typings.alt.AltJSNs

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
    val __obj = js.Dynamic.literal(action = action, data = data)
  
    __obj.asInstanceOf[StoreReduce]
  }
}

