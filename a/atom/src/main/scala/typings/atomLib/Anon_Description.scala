package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description[TargetType /* <: stdLib.EventTarget */] extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var hiddenInCommandPalette: js.UndefOr[scala.Boolean] = js.undefined
  def didDispatch(event: atomLib.atomMod.CommandEvent[TargetType]): scala.Unit | js.Promise[scala.Unit]
}

object Anon_Description {
  @scala.inline
  def apply[TargetType /* <: stdLib.EventTarget */](
    didDispatch: js.Function1[atomLib.atomMod.CommandEvent[TargetType], scala.Unit | js.Promise[scala.Unit]],
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    hiddenInCommandPalette: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Description[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = didDispatch)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(hiddenInCommandPalette)) __obj.updateDynamic("hiddenInCommandPalette")(hiddenInCommandPalette)
    __obj.asInstanceOf[Anon_Description[TargetType]]
  }
}

