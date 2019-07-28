package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /** If provided and not an empty string, used to select the snapshot to compare the `expected` value against. */
  var id: js.UndefOr[String] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(id: String = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[SnapshotOptions]
  }
}

