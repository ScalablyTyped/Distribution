package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing an operation twice. 
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The description that you specify for the namespace when you create it.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * The ID of a namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  /**
    * The name of the namespace, such as example.com.
    */
  var Name: js.UndefOr[NamespaceName] = js.undefined
  /**
    * A complex type that contains information that's specific to the type of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.undefined
  /**
    * The number of services that are associated with the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.undefined
  /**
    * The type of the namespace. Valid values are DNS_PUBLIC and DNS_PRIVATE.
    */
  var Type: js.UndefOr[NamespaceType] = js.undefined
}

object Namespace {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    Id: ResourceId = null,
    Name: NamespaceName = null,
    Properties: NamespaceProperties = null,
    ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
    Type: NamespaceType = null
  ): Namespace = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    if (!js.isUndefined(ServiceCount)) __obj.updateDynamic("ServiceCount")(ServiceCount)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

