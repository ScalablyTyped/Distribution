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

