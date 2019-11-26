package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Responsetype extends js.Object {
  var response_type: js.UndefOr[String] = js.undefined
}

object Anon_Responsetype {
  @scala.inline
  def apply(response_type: String = null): Anon_Responsetype = {
    val __obj = js.Dynamic.literal()
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Responsetype]
  }
}

