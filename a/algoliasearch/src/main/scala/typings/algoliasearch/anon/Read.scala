package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  var read: js.UndefOr[js.Array[String]] = js.undefined
  var write: js.UndefOr[js.Array[String]] = js.undefined
}

object Read {
  @scala.inline
  def apply(read: js.Array[String] = null, write: js.Array[String] = null): Read = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
}

