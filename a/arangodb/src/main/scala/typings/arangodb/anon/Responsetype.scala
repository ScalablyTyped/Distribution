package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responsetype extends js.Object {
  var response_type: js.UndefOr[String] = js.undefined
}

object Responsetype {
  @scala.inline
  def apply(response_type: String = null): Responsetype = {
    val __obj = js.Dynamic.literal()
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsetype]
  }
}

