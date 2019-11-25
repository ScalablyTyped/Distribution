package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
  var static: Boolean
}

object Anon_Read {
  @scala.inline
  def apply(static: Boolean, read: js.Any = null): Anon_Read = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Read]
  }
}

