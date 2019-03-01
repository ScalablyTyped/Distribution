package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollectionObserverSplice[T, K] extends js.Object {
  /* ArrayObserverSplice */
  /**
    * Number of items added to the collection.
    */
  var addedCount: scala.Double
  /**
    * The position at which the items were added.
    */
  var index: scala.Double
  /**
    * The key of the Map item that was changed.
    */
  var key: K
  /* End ArrayObserverSplice */
  /**
    * The observed Set or Map after the change.
    */
  var `object`: stdLib.Set[T] | (stdLib.Map[K, T])
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
  var `type`: aureliaDashBindingLib.aureliaDashBindingLibStrings.add | aureliaDashBindingLib.aureliaDashBindingLibStrings.delete | aureliaDashBindingLib.aureliaDashBindingLibStrings.update | aureliaDashBindingLib.aureliaDashBindingLibStrings.clear
  /**
    * The Set value that was either added or removed.
    */
  var value: T
}

object ICollectionObserverSplice {
  @scala.inline
  def apply[T, K](
    addedCount: scala.Double,
    index: scala.Double,
    key: K,
    `object`: stdLib.Set[T] | (stdLib.Map[K, T]),
    oldValue: T,
    removed: js.Array[T],
    `type`: aureliaDashBindingLib.aureliaDashBindingLibStrings.add | aureliaDashBindingLib.aureliaDashBindingLibStrings.delete | aureliaDashBindingLib.aureliaDashBindingLibStrings.update | aureliaDashBindingLib.aureliaDashBindingLibStrings.clear,
    value: T
  ): ICollectionObserverSplice[T, K] = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("addedCount")(addedCount)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("removed")(removed)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionObserverSplice[T, K]]
  }
}

