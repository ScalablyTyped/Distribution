package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
  var static: scala.Boolean
}

object Anon_Read {
  @scala.inline
  def apply(static: scala.Boolean, read: js.Any = null): Anon_Read = {
    val __obj = js.Dynamic.literal(static = static)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Anon_Read]
  }
}

