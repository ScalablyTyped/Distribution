package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceServerResponse extends js.Object {
  /**
    * The newly created resource server.
    */
  var ResourceServer: ResourceServerType
}

object CreateResourceServerResponse {
  @scala.inline
  def apply(ResourceServer: ResourceServerType): CreateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer)
  
    __obj.asInstanceOf[CreateResourceServerResponse]
  }
}

