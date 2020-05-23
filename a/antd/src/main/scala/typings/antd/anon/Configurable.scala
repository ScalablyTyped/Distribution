package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable extends js.Object {
  var configurable: Boolean
  def get(): js.Any
}

object Configurable {
  @scala.inline
  def apply(configurable: Boolean, get: () => js.Any): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable]
  }
}

