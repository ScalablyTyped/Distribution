package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intent extends js.Object {
  /**
    * The name of the intent.
    */
  var intentName: IntentName
  /**
    * The version of the intent.
    */
  var intentVersion: Version
}

object Intent {
  @scala.inline
  def apply(intentName: IntentName, intentVersion: Version): Intent = {
    val __obj = js.Dynamic.literal(intentName = intentName, intentVersion = intentVersion)
  
    __obj.asInstanceOf[Intent]
  }
}

