package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.   Attribute: The aspect of a device such as platform or model used as the selection criteria in a device filter. Allowed values include:   ARN: The Amazon Resource Name (ARN) of the device. For example, "arn:aws:devicefarm:us-west-2::device:12345Example".   PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".   OS_VERSION: The operating system version. For example, "10.3.2".   MODEL: The device model. For example, "iPad 5th Gen".   AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".   FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".   MANUFACTURER: The device manufacturer. For example, "Apple".   REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".   REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE". This attribute will be ignored, as remote debugging is no longer supported.    INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.   INSTANCE_LABELS: The label of the device instance.   FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".     Operator: The filter operator.   The EQUALS operator is available for every attribute except INSTANCE_LABELS.   The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.   The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN attributes.   The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the OS_VERSION attribute.     Values: An array of one or more filter values.   The IN and NOT_IN operators take a values array that has one or more elements.   The other operators require an array with a single element.   In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE" as values.    
    */
  var filters: js.UndefOr[DeviceFilters] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListDevicesRequest {
  @scala.inline
  def apply(arn: AmazonResourceName = null, filters: DeviceFilters = null, nextToken: PaginationToken = null): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

