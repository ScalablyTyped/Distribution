package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChangeRecord_[V] extends IterableChangeRecord[V]

object IterableChangeRecord_ {
  @scala.inline
  def apply[V](
    item: V,
    trackById: js.Any,
    currentIndex: scala.Int | scala.Double = null,
    previousIndex: scala.Int | scala.Double = null
  ): IterableChangeRecord_[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById)
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord_[V]]
  }
}

