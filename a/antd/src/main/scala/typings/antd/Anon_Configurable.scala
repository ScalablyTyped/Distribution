package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: Boolean
  def get(): js.Any
}

object Anon_Configurable {
  @scala.inline
  def apply(configurable: Boolean, get: () => js.Any): Anon_Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[Anon_Configurable]
  }
}

