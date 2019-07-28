package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNamespaceRequest extends js.Object {
  /**
    * The ID of the namespace that you want to get information about.
    */
  var Id: ResourceId
}

object GetNamespaceRequest {
  @scala.inline
  def apply(Id: ResourceId): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetNamespaceRequest]
  }
}

