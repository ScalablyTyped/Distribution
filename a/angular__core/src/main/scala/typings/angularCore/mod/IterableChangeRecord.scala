package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChangeRecord[V] extends js.Object {
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: Double | Null
  /** The item. */
  val item: V
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: Double | Null
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: js.Any
}

object IterableChangeRecord {
  @scala.inline
  def apply[V](
    item: V,
    trackById: js.Any,
    currentIndex: Double = null.asInstanceOf[Double],
    previousIndex: Double = null.asInstanceOf[Double]
  ): IterableChangeRecord[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord[V]]
  }
}

