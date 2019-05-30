package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadAny extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
}

object Anon_ReadAny {
  @scala.inline
  def apply(read: js.Any = null): Anon_ReadAny = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Anon_ReadAny]
  }
}

