package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntentRequest extends js.Object {
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName
}

object DeleteIntentRequest {
  @scala.inline
  def apply(name: IntentName): DeleteIntentRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteIntentRequest]
  }
}

