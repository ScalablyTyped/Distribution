package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinIntentSlot extends js.Object {
  /**
    * A list of the slots defined for the intent.
    */
  var name: js.UndefOr[String] = js.undefined
}

object BuiltinIntentSlot {
  @scala.inline
  def apply(name: String = null): BuiltinIntentSlot = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BuiltinIntentSlot]
  }
}

