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

object IterableDiffer {
  @scala.inline
  def apply[V](diff: NgIterable[V] => IterableChanges[V] | scala.Null): IterableDiffer[V] = {
    val __obj = js.Dynamic.literal(diff = js.Any.fromFunction1(diff))
  
    __obj.asInstanceOf[IterableDiffer[V]]
  }
}

