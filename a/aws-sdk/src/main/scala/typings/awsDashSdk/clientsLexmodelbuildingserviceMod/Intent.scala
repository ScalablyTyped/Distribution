package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intent extends js.Object {
  /**
    * The name of the intent.
    */
  var intentName: IntentName = js.native
  /**
    * The version of the intent.
    */
  var intentVersion: Version = js.native
}

object Intent {
  @scala.inline
  def apply(intentName: IntentName, intentVersion: Version): Intent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Intent]
  }
}

