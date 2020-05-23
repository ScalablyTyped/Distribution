package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait To extends js.Object {
  var _from: String
  var _to: String
}

object To {
  @scala.inline
  def apply(_from: String, _to: String): To = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
}

