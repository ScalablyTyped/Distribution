package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningPlatformRequest extends js.Object {
  /**
    * The ID of the target signing platform.
    */
  var platformId: PlatformId
}

object GetSigningPlatformRequest {
  @scala.inline
  def apply(platformId: PlatformId): GetSigningPlatformRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId)
  
    __obj.asInstanceOf[GetSigningPlatformRequest]
  }
}

