package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableDiffer[V] extends js.Object {
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: NgIterable[V]): IterableChanges[V] | scala.Null
}

