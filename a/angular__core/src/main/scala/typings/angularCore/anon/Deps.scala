package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deps extends js.Object {
  var deps: js.Array[_]
  var useFactory: js.Function
}

object Deps {
  @scala.inline
  def apply(deps: js.Array[_], useFactory: js.Function): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
}

