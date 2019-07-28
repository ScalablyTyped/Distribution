package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntentRequest extends js.Object {
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName
  /**
    * The version of the intent.
    */
  var version: Version
}

object GetIntentRequest {
  @scala.inline
  def apply(name: IntentName, version: Version): GetIntentRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[GetIntentRequest]
  }
}

