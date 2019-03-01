package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChangeRecord[V] extends js.Object {
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: scala.Double | scala.Null
  /** The item. */
  val item: V
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: scala.Double | scala.Null
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: js.Any
}

object IterableChangeRecord {
  @scala.inline
  def apply[V](
    item: V,
    trackById: js.Any,
    currentIndex: scala.Int | scala.Double = null,
    previousIndex: scala.Int | scala.Double = null
  ): IterableChangeRecord[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("trackById")(trackById)
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord[V]]
  }
}

