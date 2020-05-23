package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  var name: String
  var pure: js.UndefOr[Boolean] = js.undefined
}

object Pipe {
  @scala.inline
  def apply(name: String, pure: js.UndefOr[Boolean] = js.undefined): Pipe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipe]
  }
}

