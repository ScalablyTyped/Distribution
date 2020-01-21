package typings.angularCore.testingTestingMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOverride[T] extends js.Object {
  var add: js.UndefOr[Partial[T]] = js.undefined
  var remove: js.UndefOr[Partial[T]] = js.undefined
  var set: js.UndefOr[Partial[T]] = js.undefined
}

object MetadataOverride {
  @scala.inline
  def apply[T](add: Partial[T] = null, remove: Partial[T] = null, set: Partial[T] = null): MetadataOverride[T] = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataOverride[T]]
  }
}

