package typings
package adoneLib.adoneNs.collectionNs.INs.LRUNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[K, V] extends js.Object {
  /**
    * key
    */
  var key: K
  /**
    * entry length
    */
  var length: scala.Double
  /**
    * Maximum live time
    */
  var maxAge: scala.Double
  /**
    * Timestamp when the entry was created
    */
  var now: scala.Double
  /**
    * value
    */
  var value: V
}

object Entry {
  @scala.inline
  def apply[K, V](key: K, length: scala.Double, maxAge: scala.Double, now: scala.Double, value: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.updateDynamic("now")(now)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[K, V]]
  }
}

