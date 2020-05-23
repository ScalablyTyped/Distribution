package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Granttype extends js.Object {
  var grant_type: js.UndefOr[String] = js.undefined
}

object Granttype {
  @scala.inline
  def apply(grant_type: String = null): Granttype = {
    val __obj = js.Dynamic.literal()
    if (grant_type != null) __obj.updateDynamic("grant_type")(grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Granttype]
  }
}

