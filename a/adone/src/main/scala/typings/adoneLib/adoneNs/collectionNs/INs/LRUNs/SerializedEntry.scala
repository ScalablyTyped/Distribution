package typings
package adoneLib.adoneNs.collectionNs.INs.LRUNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedEntry[K, V] extends js.Object {
  /**
    * when it becomes expired
    */
  var e: scala.Double
  /**
    * key
    */
  var key: K
  /**
    * value
    */
  var value: V
}

object SerializedEntry {
  @scala.inline
  def apply[K, V](e: scala.Double, key: K, value: V): SerializedEntry[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedEntry[K, V]]
  }
}

