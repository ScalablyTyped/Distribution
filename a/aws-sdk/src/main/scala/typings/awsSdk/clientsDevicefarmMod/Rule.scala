package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The rule's stringified attribute. For example, specify the value as "\"abc\"". The supported operators for each attribute are provided in the following list.  APPIUM_VERSION  The Appium version for the test. Supported operators: CONTAINS   ARN  The Amazon Resource Name (ARN) of the device (for example, arn:aws:devicefarm:us-west-2::device:12345Example. Supported operators: EQUALS, IN, NOT_IN   AVAILABILITY  The current availability of the device. Valid values are AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE. Supported operators: EQUALS   FLEET_TYPE  The fleet type. Valid values are PUBLIC or PRIVATE. Supported operators: EQUALS   FORM_FACTOR  The device form factor. Valid values are PHONE or TABLET. Supported operators: EQUALS, IN, NOT_IN   INSTANCE_ARN  The Amazon Resource Name (ARN) of the device instance. Supported operators: IN, NOT_IN   INSTANCE_LABELS  The label of the device instance. Supported operators: CONTAINS   MANUFACTURER  The device manufacturer (for example, Apple). Supported operators: EQUALS, IN, NOT_IN   MODEL  The device model, such as Apple iPad Air 2 or Google Pixel. Supported operators: CONTAINS, EQUALS, IN, NOT_IN   OS_VERSION  The operating system version (for example, 10.3.2). Supported operators: EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, LESS_THAN, LESS_THAN_OR_EQUALS, NOT_IN   PLATFORM  The device platform. Valid values are ANDROID or IOS. Supported operators: EQUALS, IN, NOT_IN   REMOTE_ACCESS_ENABLED  Whether the device is enabled for remote access. Valid values are TRUE or FALSE. Supported operators: EQUALS   REMOTE_DEBUG_ENABLED  Whether the device is enabled for remote debugging. Valid values are TRUE or FALSE. Supported operators: EQUALS  Because remote debugging is no longer supported, this filter is ignored.  
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
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setAttribute(value: DeviceAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setOperator(value: RuleOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
