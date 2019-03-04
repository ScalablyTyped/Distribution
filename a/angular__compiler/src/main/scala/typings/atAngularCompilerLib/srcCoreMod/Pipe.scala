package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  var name: java.lang.String
  var pure: js.UndefOr[scala.Boolean] = js.undefined
}

object Pipe {
  @scala.inline
  def apply(name: java.lang.String, pure: js.UndefOr[scala.Boolean] = js.undefined): Pipe = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    __obj.asInstanceOf[Pipe]
  }
}

