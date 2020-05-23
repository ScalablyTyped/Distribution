package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChangeRecord_[V] extends IterableChangeRecord[V]

object IterableChangeRecord_ {
  @scala.inline
  def apply[V](
    item: V,
    trackById: js.Any,
    currentIndex: Double = null.asInstanceOf[Double],
    previousIndex: Double = null.asInstanceOf[Double]
  ): IterableChangeRecord_[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord_[V]]
  }
}

