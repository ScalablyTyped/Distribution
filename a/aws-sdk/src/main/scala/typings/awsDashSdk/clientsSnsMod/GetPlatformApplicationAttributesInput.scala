package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlatformApplicationAttributesInput extends js.Object {
  /**
    * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
    */
  var PlatformApplicationArn: String
}

object GetPlatformApplicationAttributesInput {
  @scala.inline
  def apply(PlatformApplicationArn: String): GetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn)
  
    __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
  }
}

