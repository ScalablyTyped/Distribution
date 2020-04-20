package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var _from: String
  var _to: String
}

object AnonFrom {
  @scala.inline
  def apply(_from: String, _to: String): AnonFrom = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

