package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinIntentSlot extends js.Object {
  /**
    * A list of the slots defined for the intent.
    */
  var name: js.UndefOr[String] = js.native
}

object BuiltinIntentSlot {
  @scala.inline
  def apply(name: String = null): BuiltinIntentSlot = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinIntentSlot]
  }
}

