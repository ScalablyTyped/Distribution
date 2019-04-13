package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHttpNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateHttpNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * The name that you want to assign to this namespace.
    */
  var Name: NamespaceName
}

object CreateHttpNamespaceRequest {
  @scala.inline
  def apply(Name: NamespaceName, CreatorRequestId: ResourceId = null, Description: ResourceDescription = null): CreateHttpNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateHttpNamespaceRequest]
  }
}

