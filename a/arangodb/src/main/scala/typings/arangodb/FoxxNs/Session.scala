package typings.arangodb.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var created: Double
  var data: js.Any
  var uid: String | Null
}

object Session {
  @scala.inline
  def apply(created: Double, data: js.Any, uid: String = null): Session = {
    val __obj = js.Dynamic.literal(created = created, data = data)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Session]
  }
}

