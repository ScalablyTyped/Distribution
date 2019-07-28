package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String
  /**
    * The Function ID.
    */
  var functionId: ResourceName
}

object GetFunctionRequest {
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, functionId = functionId)
  
    __obj.asInstanceOf[GetFunctionRequest]
  }
}

