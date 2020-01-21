package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGranttype extends js.Object {
  var grant_type: js.UndefOr[String] = js.undefined
}

object AnonGranttype {
  @scala.inline
  def apply(grant_type: String = null): AnonGranttype = {
    val __obj = js.Dynamic.literal()
    if (grant_type != null) __obj.updateDynamic("grant_type")(grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGranttype]
  }
}

