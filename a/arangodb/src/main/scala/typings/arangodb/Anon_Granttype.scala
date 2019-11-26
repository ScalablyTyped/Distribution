package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Granttype extends js.Object {
  var grant_type: js.UndefOr[String] = js.undefined
}

object Anon_Granttype {
  @scala.inline
  def apply(grant_type: String = null): Anon_Granttype = {
    val __obj = js.Dynamic.literal()
    if (grant_type != null) __obj.updateDynamic("grant_type")(grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Granttype]
  }
}

