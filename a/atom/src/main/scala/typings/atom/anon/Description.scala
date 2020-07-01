package typings.atom.anon

import typings.atom.mod.CommandEvent
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description[TargetType /* <: EventTarget */] extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.undefined
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit]
}

object Description {
  @scala.inline
  def apply[/* <: typings.std.EventTarget */ TargetType](
    didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit],
    description: String = null,
    displayName: String = null,
    hiddenInCommandPalette: js.UndefOr[Boolean] = js.undefined
  ): Description[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenInCommandPalette)) __obj.updateDynamic("hiddenInCommandPalette")(hiddenInCommandPalette.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description[TargetType]]
  }
}

