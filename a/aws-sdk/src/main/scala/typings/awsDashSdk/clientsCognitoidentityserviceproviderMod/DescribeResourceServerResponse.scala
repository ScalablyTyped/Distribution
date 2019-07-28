package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourceServerResponse extends js.Object {
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType
}

object DescribeResourceServerResponse {
  @scala.inline
  def apply(ResourceServer: ResourceServerType): DescribeResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer)
  
    __obj.asInstanceOf[DescribeResourceServerResponse]
  }
}

