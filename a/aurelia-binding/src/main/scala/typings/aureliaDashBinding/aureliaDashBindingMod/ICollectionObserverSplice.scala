package typings.aureliaDashBinding.aureliaDashBindingMod

import typings.aureliaDashBinding.aureliaDashBindingStrings.add
import typings.aureliaDashBinding.aureliaDashBindingStrings.clear
import typings.aureliaDashBinding.aureliaDashBindingStrings.delete
import typings.aureliaDashBinding.aureliaDashBindingStrings.update
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollectionObserverSplice[T, K] extends js.Object {
  /* ArrayObserverSplice */
  /**
    * Number of items added to the collection.
    */
  var addedCount: Double
  /**
    * The position at which the items were added.
    */
  var index: Double
  /**
    * The key of the Map item that was changed.
    */
  var key: K
  /* End ArrayObserverSplice */
  /**
    * The observed Set or Map after the change.
    */
  var `object`: Set[T] | (Map[K, T])
  /**
    * The value of the Map item prior to the change.
    */
  var oldValue: T
  /**
    * A collection of items that were removed from the collection.
    */
  var removed: js.Array[T]
  /**
    * The type of change that has taken place. Valid options are "add", "delete", "update", and  "clear".
    * 
    * *Note:* "update" is invalid for Set.
    * 
    * *Note:* "clear" is only valid for Map and Set.
    */
  var `type`: add | delete | update | clear
  /**
    * The Set value that was either added or removed.
    */
  var value: T
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
}

