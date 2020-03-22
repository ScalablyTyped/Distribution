package typings.angularCore

import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPure[T] extends js.Object {
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.undefined
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T]
}

object AnonPure {
  @scala.inline
  def apply[T](name: String, `type`: Type[T], pure: js.UndefOr[Boolean] = js.undefined): AnonPure[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPure[T]]
  }
}

