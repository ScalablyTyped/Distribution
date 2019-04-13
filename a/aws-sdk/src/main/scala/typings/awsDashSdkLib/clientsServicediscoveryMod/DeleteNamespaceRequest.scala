package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamespaceRequest extends js.Object {
  /**
    * The ID of the namespace that you want to delete.
    */
  var Id: ResourceId
}

object DeleteNamespaceRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
}

