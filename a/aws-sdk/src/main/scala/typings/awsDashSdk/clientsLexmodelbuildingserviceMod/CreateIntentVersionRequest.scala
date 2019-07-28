package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntentVersionRequest extends js.Object {
  /**
    * Checksum of the $LATEST version of the intent that should be used to create the new version. If you specify a checksum and the $LATEST version of the intent has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * The name of the intent that you want to create a new version of. The name is case sensitive. 
    */
  var name: IntentName
}

object CreateIntentVersionRequest {
  @scala.inline
  def apply(name: IntentName, checksum: String = null): CreateIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    __obj.asInstanceOf[CreateIntentVersionRequest]
  }
}

