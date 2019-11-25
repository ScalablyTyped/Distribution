package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChangeRecord_[V] extends IterableChangeRecord[V]

object IterableChangeRecord_ {
  @scala.inline
  def apply[V](item: V, trackById: js.Any, currentIndex: Int | Double = null, previousIndex: Int | Double = null): IterableChangeRecord_[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any])
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord_[V]]
  }
}

