package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[V] extends js.Object {
  var value: V
}

object Value {
  @scala.inline
  def apply[V](value: V): Value[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[V]]
  }
}

