package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntentVersionRequest extends js.Object {
  /**
    * The name of the intent.
    */
  var name: IntentName
  /**
    * The version of the intent to delete. You cannot delete the $LATEST version of the intent. To delete the $LATEST version, use the DeleteIntent operation.
    */
  var version: NumericalVersion
}

object DeleteIntentVersionRequest {
  @scala.inline
  def apply(name: IntentName, version: NumericalVersion): DeleteIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[DeleteIntentVersionRequest]
  }
}

