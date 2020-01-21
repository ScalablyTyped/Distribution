package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  /**
    * The Function ID.
    */
  var functionId: ResourceName = js.native
}

object DeleteFunctionRequest {
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): DeleteFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFunctionRequest]
  }
}

