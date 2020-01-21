package typings.apolloUtilities.storeUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdConfig extends js.Object {
  var id: String
  var typename: js.UndefOr[String] = js.undefined
}

object IdConfig {
  @scala.inline
  def apply(id: String, typename: String = null): IdConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (typename != null) __obj.updateDynamic("typename")(typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdConfig]
  }
}

