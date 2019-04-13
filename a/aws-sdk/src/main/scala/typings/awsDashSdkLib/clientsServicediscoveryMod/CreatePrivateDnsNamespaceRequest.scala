package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePrivateDnsNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * The name that you want to assign to this namespace. When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
    */
  var Name: NamespaceName
  /**
    * The ID of the Amazon VPC that you want to associate the namespace with.
    */
  var Vpc: ResourceId
}

object CreatePrivateDnsNamespaceRequest {
  @scala.inline
  def apply(
    Name: NamespaceName,
    Vpc: ResourceId,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null
  ): CreatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Vpc = Vpc)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
  }
}

