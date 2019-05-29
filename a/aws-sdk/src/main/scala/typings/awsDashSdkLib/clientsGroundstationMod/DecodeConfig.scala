package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeConfig extends js.Object {
  /**
    * Unvalidated JSON of a decode Config.
    */
  var unvalidatedJSON: JsonString
}

object DecodeConfig {
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DecodeConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON)
  
    __obj.asInstanceOf[DecodeConfig]
  }
}

