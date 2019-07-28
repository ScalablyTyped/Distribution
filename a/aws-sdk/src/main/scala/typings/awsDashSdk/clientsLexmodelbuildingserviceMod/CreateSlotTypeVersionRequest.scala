package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlotTypeVersionRequest extends js.Object {
  /**
    * Checksum for the $LATEST version of the slot type that you want to publish. If you specify a checksum and the $LATEST version of the slot type has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish the new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * The name of the slot type that you want to create a new version for. The name is case sensitive. 
    */
  var name: SlotTypeName
}

object CreateSlotTypeVersionRequest {
  @scala.inline
  def apply(name: SlotTypeName, checksum: String = null): CreateSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    __obj.asInstanceOf[CreateSlotTypeVersionRequest]
  }
}

