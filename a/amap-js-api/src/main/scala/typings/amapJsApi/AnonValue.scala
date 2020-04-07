package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[V] extends js.Object {
  var value: V
}

object AnonValue {
  @scala.inline
  def apply[V](value: V): AnonValue[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue[V]]
  }
}

