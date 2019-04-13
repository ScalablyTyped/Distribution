package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * The timestamp when the operation was initialized (e.g., 1479816991.349).
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The error details.
    */
  var errorDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the operation.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A Boolean value indicating whether the operation is terminal.
    */
  var isTerminal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * Details about the operation (e.g., Debian-1GB-Ohio-1).
    */
  var operationDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of operation. 
    */
  var operationType: js.UndefOr[OperationType] = js.undefined
  /**
    * The resource name.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The status of the operation. 
    */
  var status: js.UndefOr[OperationStatus] = js.undefined
  /**
    * The timestamp when the status was changed (e.g., 1479816991.349).
    */
  var statusChangedAt: js.UndefOr[IsoDate] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    createdAt: IsoDate = null,
    errorCode: java.lang.String = null,
    errorDetails: java.lang.String = null,
    id: NonEmptyString = null,
    isTerminal: js.UndefOr[scala.Boolean] = js.undefined,
    location: ResourceLocation = null,
    operationDetails: java.lang.String = null,
    operationType: OperationType = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null,
    status: OperationStatus = null,
    statusChangedAt: IsoDate = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isTerminal)) __obj.updateDynamic("isTerminal")(isTerminal)
    if (location != null) __obj.updateDynamic("location")(location)
    if (operationDetails != null) __obj.updateDynamic("operationDetails")(operationDetails)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusChangedAt != null) __obj.updateDynamic("statusChangedAt")(statusChangedAt)
    __obj.asInstanceOf[Operation]
  }
}

