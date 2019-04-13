package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String
  /**
    * The Function ID.
    */
  var functionId: ResourceName
}

object DeleteFunctionRequest {
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): DeleteFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, functionId = functionId)
  
    __obj.asInstanceOf[DeleteFunctionRequest]
  }
}

