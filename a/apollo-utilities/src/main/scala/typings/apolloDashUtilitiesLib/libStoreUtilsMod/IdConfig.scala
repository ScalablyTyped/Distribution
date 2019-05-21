package typings
package apolloDashUtilitiesLib.libStoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdConfig extends js.Object {
  var id: java.lang.String
  var typename: js.UndefOr[java.lang.String] = js.undefined
}

object IdConfig {
  @scala.inline
  def apply(id: java.lang.String, typename: java.lang.String = null): IdConfig = {
    val __obj = js.Dynamic.literal(id = id)
    if (typename != null) __obj.updateDynamic("typename")(typename)
    __obj.asInstanceOf[IdConfig]
  }
}

