package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deps extends js.Object {
  var deps: js.Array[_]
  var useFactory: js.Function
}

object Anon_Deps {
  @scala.inline
  def apply(deps: js.Array[_], useFactory: js.Function): Anon_Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Deps]
  }
}

