package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteDefinitionInformation extends StObject {
  
  /**
    * Date (in Unix epoch time) when the test suite was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the devices that are under test for the test suite.
    */
  var defaultDevices: js.UndefOr[DeviceUnderTestList] = js.undefined
  
  /**
    * Specifies if the test suite is intended for qualification.
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
    * Suite definition ID of the test suite.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Suite name of the test suite.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
}
object SuiteDefinitionInformation {
  
  inline def apply(): SuiteDefinitionInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuiteDefinitionInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuiteDefinitionInformation] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDefaultDevices(value: DeviceUnderTestList): Self = StObject.set(x, "defaultDevices", value.asInstanceOf[js.Any])
    
    inline def setDefaultDevicesUndefined: Self = StObject.set(x, "defaultDevices", js.undefined)
    
    inline def setDefaultDevicesVarargs(value: DeviceUnderTest*): Self = StObject.set(x, "defaultDevices", js.Array(value*))
    
    inline def setIntendedForQualification(value: IntendedForQualificationBoolean): Self = StObject.set(x, "intendedForQualification", value.asInstanceOf[js.Any])
    
    inline def setIntendedForQualificationUndefined: Self = StObject.set(x, "intendedForQualification", js.undefined)
    
    inline def setIsLongDurationTest(value: IsLongDurationTestBoolean): Self = StObject.set(x, "isLongDurationTest", value.asInstanceOf[js.Any])
    
    inline def setIsLongDurationTestUndefined: Self = StObject.set(x, "isLongDurationTest", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
  }
}
