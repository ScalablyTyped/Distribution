package typings.adone.adoneNs.collectionNs.INs.LRUNs

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
  var length: Double
  /**
    * Maximum live time
    */
  var maxAge: Double
  /**
    * Timestamp when the entry was created
    */
  var now: Double
  /**
    * value
    */
  var value: V
}

object Entry {
  @scala.inline
  def apply[K, V](key: K, length: Double, maxAge: Double, now: Double, value: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], length = length, maxAge = maxAge, now = now, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry[K, V]]
  }
}

