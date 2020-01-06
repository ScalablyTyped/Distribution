package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceServerResponse extends js.Object {
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType = js.native
}

object UpdateResourceServerResponse {
  @scala.inline
  def apply(ResourceServer: ResourceServerType): UpdateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateResourceServerResponse]
  }
}

