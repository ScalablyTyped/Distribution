package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSuiteDefinitionRequest extends StObject {
  
  /**
    * Updates a Device Advisor test suite with suite definition configuration.
    */
  var suiteDefinitionConfiguration: SuiteDefinitionConfiguration
  
  /**
    * Suite definition ID of the test suite to be updated.
    */
  var suiteDefinitionId: UUID
}
object UpdateSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionConfiguration: SuiteDefinitionConfiguration, suiteDefinitionId: UUID): UpdateSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionConfiguration = suiteDefinitionConfiguration.asInstanceOf[js.Any], suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSuiteDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSuiteDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionConfiguration(value: SuiteDefinitionConfiguration): Self = StObject.set(x, "suiteDefinitionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
  }
}
