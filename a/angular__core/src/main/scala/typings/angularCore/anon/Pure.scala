package typings.angularCore.anon

import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pure[T] extends js.Object {
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.undefined
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T]
}

object Pure {
  @scala.inline
  def apply[T](name: String, `type`: Type[T], pure: js.UndefOr[Boolean] = js.undefined): Pure[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pure[T]]
  }
}

