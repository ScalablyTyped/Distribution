package typings.atom

import typings.atom.mod.CommandEvent
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription[TargetType /* <: EventTarget */] extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.undefined
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit]
}

object AnonDescription {
  @scala.inline
  def apply[TargetType /* <: EventTarget */](
    didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit],
    description: String = null,
    displayName: String = null,
    hiddenInCommandPalette: js.UndefOr[Boolean] = js.undefined
  ): AnonDescription[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenInCommandPalette)) __obj.updateDynamic("hiddenInCommandPalette")(hiddenInCommandPalette.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription[TargetType]]
  }
}

