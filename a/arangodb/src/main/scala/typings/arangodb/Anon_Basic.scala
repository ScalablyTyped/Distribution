package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends js.Object {
  var basic: js.UndefOr[Anon_Password] = js.undefined
  var bearer: js.UndefOr[String] = js.undefined
}

object Anon_Basic {
  @scala.inline
  def apply(basic: Anon_Password = null, bearer: String = null): Anon_Basic = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic)
    if (bearer != null) __obj.updateDynamic("bearer")(bearer)
    __obj.asInstanceOf[Anon_Basic]
  }
}

