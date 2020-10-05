package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueChangeRecord[K, V] extends js.Object {
  /**
    * Current value for the key or `null` if removed.
    */
  val currentValue: V | Null = js.native
  /**
    * Current key in the Map.
    */
  val key: K = js.native
  /**
    * Previous value for the key or `null` if added.
    */
  val previousValue: V | Null = js.native
}

object KeyValueChangeRecord {
  @scala.inline
  def apply[K, V](key: K): KeyValueChangeRecord[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueChangeRecord[K, V]]
  }
  @scala.inline
  implicit class KeyValueChangeRecordOps[Self <: KeyValueChangeRecord[_, _], K, V] (val x: Self with (KeyValueChangeRecord[K, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentValue(value: V): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentValueNull: Self = this.set("currentValue", null)
    @scala.inline
    def setPreviousValue(value: V): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousValueNull: Self = this.set("previousValue", null)
  }
  
}

