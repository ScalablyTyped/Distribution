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

