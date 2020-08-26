package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableChangeRecord_[V] extends IterableChangeRecord[V]

object IterableChangeRecord_ {
  @scala.inline
  def apply[V](item: V, trackById: js.Any): IterableChangeRecord_[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord_[V]]
  }
}

