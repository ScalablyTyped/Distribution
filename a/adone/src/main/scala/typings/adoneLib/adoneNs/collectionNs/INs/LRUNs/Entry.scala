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

