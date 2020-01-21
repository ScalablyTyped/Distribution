package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueChangeRecord[K, V] extends js.Object {
  /**
    * Current value for the key or `null` if removed.
    */
  val currentValue: V | Null
  /**
    * Current key in the Map.
    */
  val key: K
  /**
    * Previous value for the key or `null` if added.
    */
  val previousValue: V | Null
}

object KeyValueChangeRecord {
  @scala.inline
  def apply[K, V](key: K, currentValue: V = null, previousValue: V = null): KeyValueChangeRecord[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueChangeRecord[K, V]]
  }
}

