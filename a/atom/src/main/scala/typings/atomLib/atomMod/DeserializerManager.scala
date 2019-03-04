package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerManager extends js.Object {
  /** Register the given class(es) as deserializers. */
  def add(deserializers: Deserializer*): Disposable
  /** Deserialize the state and params. */
  def deserialize(state: js.Object): js.UndefOr[js.Object]
}

object DeserializerManager {
  @scala.inline
  def apply(
    add: js.Function1[/* repeated */ Deserializer, Disposable],
    deserialize: js.Function1[js.Object, js.UndefOr[js.Object]]
  ): DeserializerManager = {
    val __obj = js.Dynamic.literal(add = add, deserialize = deserialize)
  
    __obj.asInstanceOf[DeserializerManager]
  }
}

