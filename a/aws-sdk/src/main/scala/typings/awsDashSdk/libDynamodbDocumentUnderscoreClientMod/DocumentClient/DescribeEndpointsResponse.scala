package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointsResponse extends js.Object {
  /**
    * List of endpoints.
    */
  var Endpoints: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.Endpoints = js.native
}

object DescribeEndpointsResponse {
  @scala.inline
  def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
}

