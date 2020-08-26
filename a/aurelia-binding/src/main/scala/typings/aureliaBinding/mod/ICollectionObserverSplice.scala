package typings.aureliaBinding.mod

import typings.aureliaBinding.aureliaBindingStrings.add
import typings.aureliaBinding.aureliaBindingStrings.clear
import typings.aureliaBinding.aureliaBindingStrings.delete
import typings.aureliaBinding.aureliaBindingStrings.update
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionObserverSplice[T, K] extends js.Object {
  /* ArrayObserverSplice */
  /**
    * Number of items added to the collection.
    */
  var addedCount: Double = js.native
  /**
    * The position at which the items were added.
    */
  var index: Double = js.native
  /**
    * The key of the Map item that was changed.
    */
  var key: K = js.native
  /* End ArrayObserverSplice */
  /**
    * The observed Set or Map after the change.
    */
  var `object`: Set[T] | (Map[K, T]) = js.native
  /**
    * The value of the Map item prior to the change.
    */
  var oldValue: T = js.native
  /**
    * A collection of items that were removed from the collection.
    */
  var removed: js.Array[T] = js.native
  /**
    * The type of change that has taken place. Valid options are "add", "delete", "update", and  "clear".
    * 
    * *Note:* "update" is invalid for Set.
    * 
    * *Note:* "clear" is only valid for Map and Set.
    */
  var `type`: add | delete | update | clear = js.native
  /**
    * The Set value that was either added or removed.
    */
  var value: T = js.native
}

object ICollectionObserverSplice {
  @scala.inline
  def apply[T, K](
    addedCount: Double,
    index: Double,
    key: K,
    `object`: Set[T] | (Map[K, T]),
    oldValue: T,
    removed: js.Array[T],
    `type`: add | delete | update | clear,
    value: T
  ): ICollectionObserverSplice[T, K] = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionObserverSplice[T, K]]
  }
  @scala.inline
  implicit class ICollectionObserverSpliceOps[Self <: ICollectionObserverSplice[_, _], T, K] (val x: Self with (ICollectionObserverSplice[T, K])) extends AnyVal {
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
    def setAddedCount(value: Double): Self = this.set("addedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Set[T] | (Map[K, T])): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: T*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[T]): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: add | delete | update | clear): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

