package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose[K, V] extends js.Object {
  /**
    * Function that is called when a value is deleted
    */
  var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, scala.Unit]] = js.undefined
  /**
    * Cache size, unlimited by default
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
}

