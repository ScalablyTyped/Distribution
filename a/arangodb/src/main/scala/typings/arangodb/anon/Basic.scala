package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basic extends js.Object {
  var basic: js.UndefOr[Username] = js.undefined
  var bearer: js.UndefOr[String] = js.undefined
}

object Basic {
  @scala.inline
  def apply(basic: Username = null, bearer: String = null): Basic = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basic]
  }
}

