package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * The rule's stringified attribute. For example, specify the value as "\"abc\"". The supported operators for each attribute are provided in the following list.  APPIUM_VERSION  The Appium version for the test.  Supported operators: CONTAINS   ARN  The Amazon Resource Name (ARN) of the device. For example, "arn:aws:devicefarm:us-west-2::device:12345Example".  Supported operators: EQUALS, IN, NOT_IN   AVAILABILITY  The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".  Supported operators: EQUALS   FLEET_TYPE  The fleet type. Valid values are "PUBLIC" or "PRIVATE".  Supported operators: EQUALS   FORM_FACTOR  The device form factor. Valid values are "PHONE" or "TABLET".  Supported operators: EQUALS, IN, NOT_IN   INSTANCE_ARN  The Amazon Resource Name (ARN) of the device instance.  Supported operators: IN, NOT_IN   INSTANCE_LABELS  The label of the device instance.  Supported operators: CONTAINS   MANUFACTURER  The device manufacturer. For example, "Apple".  Supported operators: EQUALS, IN, NOT_IN   MODEL  The device model, such as "Apple iPad Air 2" or "Google Pixel".  Supported operators: CONTAINS, EQUALS, IN, NOT_IN   OS_VERSION  The operating system version. For example, "10.3.2".  Supported operators: EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, LESS_THAN, LESS_THAN_OR_EQUALS, NOT_IN   PLATFORM  The device platform. Valid values are "ANDROID" or "IOS".  Supported operators: EQUALS, IN, NOT_IN   REMOTE_ACCESS_ENABLED  Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".  Supported operators: EQUALS   REMOTE_DEBUG_ENABLED  Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".  Supported operators: EQUALS   
    */
  var attribute: js.UndefOr[DeviceAttribute] = js.undefined
  /**
    * Specifies how Device Farm compares the rule's attribute to the value. For the operators that are supported by each attribute, see the attribute descriptions.
    */
  var operator: js.UndefOr[RuleOperator] = js.undefined
  /**
    * The rule's value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(attribute: DeviceAttribute = null, operator: RuleOperator = null, value: String = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Rule]
  }
}

