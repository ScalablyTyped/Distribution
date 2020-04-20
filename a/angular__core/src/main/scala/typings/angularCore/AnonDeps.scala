package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeps extends js.Object {
  var deps: js.Array[_]
  var useFactory: js.Function
}

object AnonDeps {
  @scala.inline
  def apply(deps: js.Array[_], useFactory: js.Function): AnonDeps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeps]
  }
}

