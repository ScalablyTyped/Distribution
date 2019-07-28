package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DemodulationConfig extends js.Object {
  /**
    * Unvalidated JSON of a demodulation Config.
    */
  var unvalidatedJSON: JsonString
}

object DemodulationConfig {
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DemodulationConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON)
  
    __obj.asInstanceOf[DemodulationConfig]
  }
}

