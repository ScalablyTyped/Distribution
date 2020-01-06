package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageInstruction extends js.Object {
  /**
    * The usage instruction type for the value.
    */
  var Type: js.UndefOr[InstructionType] = js.native
  /**
    * The usage instruction value for this type.
    */
  var Value: js.UndefOr[InstructionValue] = js.native
}

object UsageInstruction {
  @scala.inline
  def apply(Type: InstructionType = null, Value: InstructionValue = null): UsageInstruction = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageInstruction]
  }
}

