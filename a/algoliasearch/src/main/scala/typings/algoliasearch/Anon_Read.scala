package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read extends js.Object {
  var read: js.UndefOr[js.Array[String]] = js.undefined
  var write: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Read {
  @scala.inline
  def apply(read: js.Array[String] = null, write: js.Array[String] = null): Anon_Read = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Anon_Read]
  }
}

