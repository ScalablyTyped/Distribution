package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteDefinitionConfiguration extends StObject {
  
  /**
    * Gets the device permission ARN.
    */
  var devicePermissionRoleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Gets the devices configured.
    */
  var devices: js.UndefOr[DeviceUnderTestList] = js.undefined
  
  /**
    * Gets the tests intended for qualification in a suite.
    */
  var intendedForQualification: js.UndefOr[IntendedForQualificationBoolean] = js.undefined
  
  /**
    *  Verifies if the test suite is a long duration test. 
    */
  var isLongDurationTest: js.UndefOr[IsLongDurationTestBoolean] = js.undefined
  
  /**
    *  Gets the MQTT protocol that is configured in the suite definition.
    */
  var protocol: js.UndefOr[Protocol] = js.undefined
  
  /**
    * Gets test suite root group.
    */
  var rootGroup: js.UndefOr[RootGroup] = js.undefined
  
  /**
    * Gets Suite Definition Configuration name.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
}
object SuiteDefinitionConfiguration {
  
  inline def apply(): SuiteDefinitionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuiteDefinitionConfiguration]
  }
  
  extension [Self <: SuiteDefinitionConfiguration](x: Self) {
    
    inline def setDevicePermissionRoleArn(value: AmazonResourceName): Self = StObject.set(x, "devicePermissionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDevicePermissionRoleArnUndefined: Self = StObject.set(x, "devicePermissionRoleArn", js.undefined)
    
    inline def setDevices(value: DeviceUnderTestList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceUnderTest*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setIntendedForQualification(value: IntendedForQualificationBoolean): Self = StObject.set(x, "intendedForQualification", value.asInstanceOf[js.Any])
    
    inline def setIntendedForQualificationUndefined: Self = StObject.set(x, "intendedForQualification", js.undefined)
    
    inline def setIsLongDurationTest(value: IsLongDurationTestBoolean): Self = StObject.set(x, "isLongDurationTest", value.asInstanceOf[js.Any])
    
    inline def setIsLongDurationTestUndefined: Self = StObject.set(x, "isLongDurationTest", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRootGroup(value: RootGroup): Self = StObject.set(x, "rootGroup", value.asInstanceOf[js.Any])
    
    inline def setRootGroupUndefined: Self = StObject.set(x, "rootGroup", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
  }
}
