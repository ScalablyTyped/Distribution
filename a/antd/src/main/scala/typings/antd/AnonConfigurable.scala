package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigurable extends js.Object {
  var configurable: Boolean
  def get(): js.Any
}

object AnonConfigurable {
  @scala.inline
  def apply(configurable: Boolean, get: () => js.Any): AnonConfigurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[AnonConfigurable]
  }
}

