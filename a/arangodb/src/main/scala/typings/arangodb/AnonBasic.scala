package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBasic extends js.Object {
  var basic: js.UndefOr[AnonPassword] = js.undefined
  var bearer: js.UndefOr[String] = js.undefined
}

object AnonBasic {
  @scala.inline
  def apply(basic: AnonPassword = null, bearer: String = null): AnonBasic = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasic]
  }
}

